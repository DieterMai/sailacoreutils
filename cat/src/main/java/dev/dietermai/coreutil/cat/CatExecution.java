package dev.dietermai.coreutil.cat;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

class CatExecution {
	private final CatRecord record;
	private int number = 1;
	private boolean pendingNewLine;
	private boolean lastLineWasBlank;

	CatExecution(CatRecord record) {
		this.record = record;
	}

	CatResult run() {
		LineSupplier supplier = record.supplier();
		
		List<String> output = new ArrayList<>();
		String line;
		while(true) {
			line = supplier.next();
			if(line == null) {
				if(pendingNewLine) {
					output.add("");
				}
				break;
			}
			
			if(addLine(output, line)) {
				break;
			}
		}
		
		return CatResult.of(output);
	}

	/**
	 * @return true if this line ended with a null character
	 */
	private boolean addLine(List<String> output, String line) {
		if (line.endsWith("\0")) {
			output.add(formatLine(line.substring(0, line.length() - 1)));
			return true;
		} else if(record.squeezeBlank() && lastLineWasBlank && line.isBlank()){
			// do noting
		}else {
			output.add(formatLine(line));
			lastLineWasBlank = line.isBlank();
			return false;
		}
	return false;
	}

	private String formatLine(String original) {
		
		String formatted = new String(original);
		
		// check how the line ends
		boolean trailingN = original.endsWith("\n");
		boolean trailingRN = original.endsWith("\r\n");

		
		formatted = handleShowNonPrinting(formatted);
		formatted = handleShowEnds(formatted, trailingRN, trailingN);
		
		// Add line numbers
		if(record.numberNonblank()) {
			if(!formatted.isEmpty() || trailingRN) {
				formatted = "%1$ 6d  %2$s".formatted(number++, formatted);
			}
		}else if(record.number()) {
				formatted = "%1$ 6d  %2$s".formatted(number++, formatted);
		}
		
		
		if(record.showTabs()) {
			formatted = formatted.replaceAll("\\t", "^I");
		}
		
		// remember new lines
		pendingNewLine = trailingN;
		return formatted;
	}
	
	private String handleShowNonPrinting(String line) {
		if(!record.showNonprinting()) {
			return line;
		}
		
		ByteBuffer buffer = StandardCharsets.UTF_8.encode(line);
		byte[] byteArray = buffer.array();

		StringBuilder sb = new StringBuilder();
		for(byte b : byteArray) {
			int c = Byte.toUnsignedInt(b);
			if(c == 0) {
				break;
			}else if(c == '\t' || c == '\n') {
				sb.append(c);
			}else if(c < ' ') {
				sb.append('^');
				sb.append((char)(c+'@'));
//					System.out.println("CatExecution.formatLine() "+((int)c)+" + "+((int)'@')+" = "+((char)(c+'@')));
			}else if(c <= 126) {
				sb.append(c);
			}else if(c == 127) { // delete
				sb.append("^?");
			}else if(c <= 159){
				sb.append("M-^");
				sb.append((char)(c-128+'@'));
//					System.out.println("CatExecution.formatLine() "+((int)c)+" - 128 + "+((int)'@')+" = "+((char)(c-128+'@')));
			}else if(c < 255) {
				sb.append("M-");
				sb.append((char)(c-160+' '));
//					System.out.println("CatExecution.formatLine() "+((int)c)+" - 160 + "+((int)' ')+" = "+((char)(c-160+' ')));
			}else if(c == 255){
				sb.append("M-^?");
			}else{
				sb.append("Not yet implemented");
			}
		}
		return sb.toString();
	}
	
	private String handleShowEnds(String line, boolean trailingRN, boolean trailingN) {
		if(!record.showEnds()) {
			return clipLineEnding(line);
		}else {
			return showEnding(line);
		}
	}
	
	private String clipLineEnding(String line) {
		if(isCrNlEnding(line)) {
			return line.substring(0, line.length()-2);
		}else if(isNlEnding(line) || isCrEnding(line)) {
			return line.substring(0, line.length()-1);
		}else {
			return line;
		}
	}
	
	private String showEnding(String line) {
		if(isCrNlEnding(line)) {
			return line.replace("\r\n", "^M$");
		}else if(isNlEnding(line)) {
			return line.replace('\n', '$');
		}else if(isCrEnding(line)) {
			return line.replace("\r", "^M");
		}else {
			return line;
		}
	}
	
	private boolean isCrNlEnding(String line) {
		return line.endsWith("\r\n");
	}
	
	private boolean isCrEnding(String line) {
		return line.endsWith("\r");
	}
	
	private boolean isNlEnding(String line) {
		return line.endsWith("\n");
	}
	
}
