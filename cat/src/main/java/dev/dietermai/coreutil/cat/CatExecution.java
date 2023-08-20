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
		boolean trailingN = original.endsWith("\n");
		boolean trailingRN = original.endsWith("\r\n");
		pendingNewLine = trailingN;
		
		String formatted = handleShows(original);
		
		// Add line numbers
		if(record.numberNonblank()) {
			if(!formatted.isEmpty() || trailingRN) {
				formatted = "%1$ 6d  %2$s".formatted(number++, formatted);
			}
		}else if(record.number()) {
				formatted = "%1$ 6d  %2$s".formatted(number++, formatted);
		}
		
		// remember new lines
		return formatted;
	}
	
	private String handleShows(String line) {
		ByteBuffer buffer = StandardCharsets.UTF_8.encode(line);
		byte[] byteArray = buffer.array();

		StringBuilder sb = new StringBuilder();
		for(byte b : byteArray) {
			int c = Byte.toUnsignedInt(b);
			
			if(c == 0) {
				break;
			}else if(c == '\t') {
				if(record.showTabs()) {
					sb.append("^I");
				}else {
					sb.append((char)c);				
				}
			}else if(c == '\n') {
				if(record.showEnds()) {
					sb.append("$");
				}else {
					continue;
				}
			}else if(c == '\r') {
				if(record.showEnds() || record.showNonprinting()) {
					sb.append("^M");
				}else {
					sb.append('\r');
				}
			}else if(c < ' ') {
				if(record.showNonprinting()) {
					sb.append('^');
					sb.append((char)(c+'@'));
	//				System.out.println("CatExecution.formatLine() "+((int)c)+" + "+((int)'@')+" = "+((char)(c+'@')));
				}else {
					sb.append((char)c);
				}
			}else if(c <= 126) {
				sb.append((char)c);
			}else if(c == 127) { // delete
				if(record.showNonprinting()) {
					sb.append("^?");
				}else {
					sb.append((char)c);
				}
			}else if(c <= 159){
				if(record.showNonprinting()) {
					sb.append("M-^");
					sb.append((char)(c-128+'@'));
//					System.out.println("CatExecution.formatLine() "+((int)c)+" - 128 + "+((int)'@')+" = "+((char)(c-128+'@')));
				}else {
					sb.append((char)c);
				}
			}else if(c < 255) {
				if(record.showNonprinting()) {
					sb.append("M-");
					sb.append((char)(c-160+' '));
//					System.out.println("CatExecution.formatLine() "+((int)c)+" - 160 + "+((int)' ')+" = "+((char)(c-160+' ')));
				}else {
					sb.append((char)c);
				}
			}else if(c == 255){
				if(record.showNonprinting()) {
					sb.append("M-^?");
				}else {
					sb.append((char)c);
				}
			}else {
				sb.append((char)c);
			}
			
		}
		return sb.toString();
	}

	private String handleNumbering(String formatted, String original) {
		if(record.numberNonblank()) {
			if(!formatted.isEmpty() || original.endsWith("\r")) {
				formatted = "%1$ 6d  %2$s".formatted(number++, formatted);
			}
		}else if(record.number()) {
			formatted = "%1$ 6d  %2$s".formatted(number++, formatted);
		}
		return formatted;
	}
}
