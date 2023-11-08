package dev.dietermai.coreutil.cat.lineconverter;

public class ShowTabsConverter implements ILineConverter {
	@Override
	public String convert(String line) {
		StringBuilder sb = new StringBuilder();
		for (char c : line.toCharArray()) {
			switch (c) {
			case '\t' -> sb.append("^I");
			default -> sb.append(c);
			}
		}
		return sb.toString();
	}
}
