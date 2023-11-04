package dev.dietermai.coreutil.cat;

import static org.junit.jupiter.api.Assertions.fail;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
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
	
	public static void descripeStringArrayDiff(String name, StringBuilder sb, String expected, String actual) {
		if(expected.equals(actual)) {
			return;
		}
		
		sb.append(name).append(" differs:\n");
		sb.append("Expected lenght is ").append(expected.length()).append("\n");
		sb.append("Actual lenght is   ").append(actual.length()).append("\n");
		
		
		appendStringElementDiff(sb, expected, actual);
	}
	
	public static void appendStringElementDiff(StringBuilder sb, String expected, String actual) {
		int line = 0;
		CharacterIterator iterExp = new StringCharacterIterator(expected);
		CharacterIterator iterAct = new StringCharacterIterator(actual);
		
		while(true) {
			String expectedLine = getNextLine(iterExp);
			String actualLine = getNextLine(iterAct);
			if(expectedLine == null && actualLine == null) {
				return;
			}
			if(expectedLine == null && actualLine != null) {
				sb.append("Diff in line "+line+": expected line is missing but actual is '"+actualLine.translateEscapes()+"'");
				return;
			}
			if(expectedLine != null && actualLine == null) {
				sb.append("Diff in line "+line+": acutal line is missing but expected is '"+expectedLine.translateEscapes()+"'");
				return;
			}
			if(!expectedLine.equals(actualLine)) {
				sb.append("Diff in line "+line+": actual and expected differ:");
				sb.append("\nExpected: "+expectedLine.translateEscapes());
				sb.append("\nActual  : "+actualLine.translateEscapes());
				return;
			}
			line++;
		}
	}
	
	private static String getNextLine(CharacterIterator iter) {
		char c = getNext(iter);
		if(c == CharacterIterator.DONE) {
			return null;
		}
		
		StringBuilder sb = new StringBuilder();
		do {
			sb.append(c);
			if(c == '\n') {
				return sb.toString(); // end of line
			}
			c = getNext(iter);
		}while(c != CharacterIterator.DONE);
		
		return sb.toString(); // end of string
	}
	
	private static char getNext(CharacterIterator iter) {
		char c = iter.current();
		iter.setIndex(iter.getIndex()+1);
		return c;
	}
}
