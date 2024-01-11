package dev.dietermai.coreutil.cat.lineconverter;

public class NumberConverter implements ILineConverter {
	
	private int counter = 1;
	
	@Override
	public String convert(String line) {
		return "%1$ 6d\t%2$s".formatted(counter++, line);
	}
}
