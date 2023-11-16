package dev.dietermai.coreutil.cat.test.generate;

public class Appender {
	private StringBuilder sb = new StringBuilder();
	private String indent = "";
	
	
	public void indent() {
		indent += "    ";
	}
	
	public String toString() {
		return sb.toString();
	}

	public void ln(String text, String...arguments) {
		sb.append(indent).append(text.formatted(arguments)).append("\n");
	}
	
	public void ln() {
		sb.append(indent).append("\n");
	}

	public void forEachLn(String pattern, String[] outputLines) {
		for(String line: outputLines) {
			ln(pattern.formatted(line));
		}
	}

	public void dedent() {
		indent = indent.substring(0, indent.length()-4);
	}
}
