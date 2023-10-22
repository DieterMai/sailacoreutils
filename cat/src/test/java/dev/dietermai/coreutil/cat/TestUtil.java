package dev.dietermai.coreutil.cat;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;
import java.util.Objects;

public class TestUtil {

	public static void verboseCompare(CatResult exptected, CatResult actual) {
		if(Objects.equals(exptected, actual)) {
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("Actual does not equal expected.\n");
		
		
		sb.append("Expexted: ").append(exptected.toString()).append("\n");
		sb.append("Actual:   ").append(actual.toString()).append("\n");
		sb.append("\n");
		sb.append("Detailed compare:\n");
		
		if(exptected.exit() != actual.exit()) {
			sb.append("Exit: Expected ").append(exptected.exit()).append(", actual: ").append(actual.exit()).append("\n");
		}		
		
		descripeStringArrayDiff("stdout", sb, exptected.stdout(), actual.stdout());
		descripeStringArrayDiff("stderr", sb, exptected.stderr(), actual.stderr());
		
		fail(sb.toString());
	}
	
	public static void descripeStringArrayDiff(String name, StringBuilder sb, List<String> expected, List<String> actual) {
		if(expected.equals(actual)) {
			return;
		}
		sb.append(name).append(" differs:\n");
		sb.append("Expected lenght is ").append(expected.size()).append("\n");
		sb.append("Actual lenght is   ").append(actual.size()).append("\n");
		
		
		for(int i = 0; i < Math.max(expected.size(), actual.size()); i++) {
			appendStringElementDiff(sb, i, expected, actual);
		}
	}
	
	public static void appendStringElementDiff(StringBuilder sb, int index, List<String> expected, List<String> actual) {
		if(index < expected.size() && index < actual.size()) {
			return;
		}
		if(index >= expected.size()) {
			sb.append("Expected: missing").append("\n");
			sb.append("Actual: ").append(toDescriptiveString(actual.get(index))).append("\n");
			return;
		}
		if(index >= actual.size()) {
			sb.append("Expected: ").append(toDescriptiveString(expected.get(index))).append("\n");
			sb.append("Actual: missing").append("\n");
			return;
		}
		if(!Objects.equals(expected.get(index),actual.get(index))) {
			sb.append("Expected: ").append(toDescriptiveString(actual.get(index))).append("\n");
			sb.append("Actual: ").append(toDescriptiveString(actual.get(index))).append("\n");
			describeFirstDiff(sb, expected.get(index), actual.get(index));
		}
	}
	
	public static String toDescriptiveString(String s) {
		if(s == null) {
			return "(null)";
		}
		if(s.isEmpty()) {
			return s+" (empty String)";
		}
		if(s.isBlank()) {
			return s+" (blank String with %s characters)".formatted(s.length());
		}
		return s+" (string with %s characters)".formatted(s.length());
	}
	
	public static void describeFirstDiff(StringBuilder sb, String expected, String actual) {
		for(int i = 0; i < Math.max(expected.length(), actual.length()); i++) {
			if(i >= expected.length() && i < actual.length()) {
				sb.append("    First diff is at char ").append(i).append(":\n");
				sb.append("    expected has ended but actual has ").append(actual.charAt(i)).append(" [").append((int)actual.charAt(i)).append("]\n");
				break;
			}else if(i >= actual.length() && i < expected.length()) {
				sb.append("    First diff is at char ").append(i).append(":\n");
				sb.append("    actual has ended but expected has ").append(expected.charAt(i)).append(" [").append((int)expected.charAt(i)).append("]\n");
				break;
			}else if(expected.charAt(i) != actual.charAt(i)) {
				sb.append("    First diff is at char ").append(i).append(":\n");
				sb.append("    expected is ").append(expected.charAt(i)).append(" [").append((int)expected.charAt(i)).append("]\n");
				sb.append("    actual   is ").append(actual.charAt(i)).append(" [").append((int)actual.charAt(i)).append("]\n");
				break;
			}
		}
	}
	
	public static String joinToLines(List<String> input) {
		if(input.isEmpty()) {
			return null;
		}
		return String.join("\n", input);
	}
}
