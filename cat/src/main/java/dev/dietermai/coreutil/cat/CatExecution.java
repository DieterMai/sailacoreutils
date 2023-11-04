package dev.dietermai.coreutil.cat;

import dev.dietermai.coreutil.cat.charsupplier.CharSupplier;

class CatExecution {
	private final CatRecord record;
	private final DefaultCharacterConverter characterConverter = new DefaultCharacterConverter();
	
	private int number = 1;
	

	CatExecution(CatRecord record) {
		this.record = record;
	}

	CatResult run() {
		CharSupplier charSupplier = record.charSupplier();
		String output = toText(charSupplier);
		return CatResult.of(output);
	}


	private String toText(CharSupplier charSupplier) {
		StringBuilder output = new StringBuilder();
		
		while(charSupplier.hasNext()) {
			output.append(convertChar(charSupplier.next()));
		}
		
		return output.toString();
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
