package dev.dietermai.coreutil.cat;

import java.util.ArrayList;
import java.util.List;

import dev.dietermai.coreutil.cat.charsupplier.CharSupplier;

class CatExecution {
	private final CatRecord record;
	private final DefaultCharacterConverter characterConverter = new DefaultCharacterConverter();
	
	private int number = 1;
	private boolean pendingNewLine;
	private boolean lastLineWasBlank;
	

	CatExecution(CatRecord record) {
		this.record = record;
	}

	CatResult run() {
		CharSupplier charSupplier = record.charSupplier();
		if(charSupplier != null) {
			return runsWith(charSupplier);
		}else {
			return runWith(record.supplier());
		}
	}

	private CatResult runWith(LineSupplier supplier) {
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
		
		if(output.isEmpty()) {
			output.add("");
		}
		
		return CatResult.of(output);
	}

	private CatResult runsWith(CharSupplier charSupplier) {
		StringBuilder output = new StringBuilder();
		
		while(charSupplier.hasNext()) {
			output.append(convertChar(charSupplier.next()));
		}
		
		return CatResult.of(output.toString());
	}

	/**
	 * @return true if this line ended with a null character
	 */
	private boolean addLine(List<String> output, String line) {
//		if (line.endsWith("\0")) {
//			output.add(formatLine(line.substring(0, line.length() - 1)));
//			return true;
//		} else 
			if(record.squeezeBlank() && lastLineWasBlank && line.isBlank()){
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
		pendingNewLine = trailingN;
		
		String formatted = handleShows(original);
		formatted = handleNumbering(formatted, original);
		
		// remember new lines
		return formatted;
	}
	
	private String convertChar(char c) {
		return characterConverter.convert(c);
	}
	
	private String handleShows(String line) {
		StringBuilder sb = new StringBuilder();
		for(char c : line.toCharArray()) {
			sb.append(characterConverter.convert(c));
		}
		return sb.toString();
		
//		ByteBuffer buffer = StandardCharsets.UTF_8.encode(line);
//		byte[] byteArray = buffer.array();
//
//		StringBuilder sb = new StringBuilder();
//		for(byte b : byteArray) {
//			
//			int c = Byte.toUnsignedInt(b);
//			
//			if(c == 0) {
//				break;
//			}else if(c == '\t') {
//				if(record.showTabs()) {
//					sb.append("^I");
//				}else {
//					sb.append((char)c);				
//				}
//			}else if(c == '\n') {
//				if(record.showEnds()) {
//					sb.append("$");
//				}else {
//					continue;
//				}
//			}else if(c == '\r') {
//				if(record.showEnds() || record.showNonprinting()) {
//					sb.append("^M");
//				}else {
//					sb.append('\r');
//				}
//			}else if(c < ' ') {
//				if(record.showNonprinting()) {
//					sb.append('^');
//					sb.append((char)(c+'@'));
//	//				System.out.println("CatExecution.formatLine() "+((int)c)+" + "+((int)'@')+" = "+((char)(c+'@')));
//				}else {
//					sb.append((char)c);
//				}
//			}else if(c <= 126) {
//				sb.append((char)c);
//			}else if(c == 127) { // delete
//				if(record.showNonprinting()) {
//					sb.append("^?");
//				}else {
//					sb.append((char)c);
//				}
//			}else if(c <= 159){
//				if(record.showNonprinting()) {
//					sb.append("M-^");
//					sb.append((char)(c-128+'@'));
////					System.out.println("CatExecution.formatLine() "+((int)c)+" - 128 + "+((int)'@')+" = "+((char)(c-128+'@')));
//				}else {
//					sb.append((char)c);
//				}
//			}else if(c < 255) {
//				if(record.showNonprinting()) {
//					sb.append("M-");
//					sb.append((char)(c-160+' '));
////					System.out.println("CatExecution.formatLine() "+((int)c)+" - 160 + "+((int)' ')+" = "+((char)(c-160+' ')));
//				}else {
//					sb.append((char)c);
//				}
//			}else if(c == 255){
//				if(record.showNonprinting()) {
//					sb.append("M-^?");
//				}else {
//					sb.append((char)c);
//				}
//			}else {
//				sb.append((char)c);
//			}
//			
//		}
//		return sb.toString();
	}

	private String handleNumbering(String formatted, String original) {
		if(record.numberNonblank()) {
			if(!formatted.isEmpty() || original.endsWith("\r")) {
				formatted = "%1$ 6d\t%2$s".formatted(number++, formatted);
			}
		}else if(record.number()) {
			formatted = "%1$ 6d\t%2$s".formatted(number++, formatted);
		}
		return formatted;
	}
}
