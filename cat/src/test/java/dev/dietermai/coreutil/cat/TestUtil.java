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
		
		
		descripeStringArrayDiff(sb, exptected.stdout(), actual.stdout());
		descripeStringArrayDiff(sb, exptected.stderr(), actual.stderr());
		
		fail(sb.toString());
	}
	
	public static void descripeStringArrayDiff(StringBuilder sb, List<String> expected, List<String> actual) {
		for(int i = 0; i < Math.max(expected.size(), actual.size()); i++) {
			if(i >= expected.size() && i < actual.size()) {
				sb.append("Line ").append(i).append(": expected missing while actual [").append(actual.get(i)).append("]\n");
			}else if(i < expected.size() && i >= actual.size()) {
				sb.append("Line ").append(i).append(": actual missing while expected [").append(expected.get(i)).append("]\n");
			}else if(!expected.get(i).equals(actual.get(i))) {
				sb.append("Line ").append(i).append(" differs:\n");
				sb.append("Expected: [").append(expected.get(i)).append("]\n");
				sb.append("Actual:   [").append(actual.get(i)).append("]\n");
				describeFirstDiff(sb, expected.get(i), actual.get(i));
			}
		}
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
}
