package dev.dietermai.coreutil.cat.lineconverter;

public class ShowEndsConverter implements ILineConverter {
	@Override
	public String convert(String line) {
		if (line.endsWith("\r\n")) {
			return line.substring(0, line.length() - 2) + "^M$\n";
		} else if (line.endsWith("\n")) {
			return line.substring(0, line.length() - 1) + "$\n";
		} else {
			return line;
		}
	}
}
