package dev.dietermai.coreutil.cat.lineconverter;

public class SqueezeBlankConverter implements ILineConverter {
	
	private boolean previousLineWasBlank = false;
	
	@Override
	public String convert(String line) {
		boolean currentLineIsBlank = isBlank(line);
		if(previousLineWasBlank && currentLineIsBlank) {
			return null;
		}
		previousLineWasBlank = currentLineIsBlank;
		return line;
	}
	
	private boolean isBlank(String line) {
		return line.charAt(0) == '\n';
	}
}
