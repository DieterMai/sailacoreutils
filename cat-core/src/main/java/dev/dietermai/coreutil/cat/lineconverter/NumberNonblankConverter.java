package dev.dietermai.coreutil.cat.lineconverter;

public class NumberNonblankConverter implements ILineConverter {
	
	private int counter = 1;
	
	@Override
	public String convert(String line) {
		if(isBlank(line)) {
			return line;
		}
		return "%1$ 6d\t%2$s".formatted(counter++, line);
	}
	
	private boolean isBlank(String line) {
		return line.charAt(0) == '\n';
	}
}
