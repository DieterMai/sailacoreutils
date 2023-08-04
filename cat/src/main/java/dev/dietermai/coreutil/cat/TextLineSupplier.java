package dev.dietermai.coreutil.cat;

public class TextLineSupplier implements LineSupplier{

	public static TextLineSupplier of(String text) {
		return new TextLineSupplier(text);
	}
	
	private final String text;
	private int startIndex;
	
	TextLineSupplier(String text){
		this.text = text;
	}
	
	@Override
	public String next() {
		if(startIndex >= text.length()) {
			return "\0";
		}
		
		char c;
		int endIndex = startIndex;
		do {
			c = text.charAt(endIndex++);
		}while(c != '\n' && c != '\0' && endIndex < text.length());
		String line = text.substring(startIndex, endIndex);
		startIndex = endIndex;
		return line;
	}

}
