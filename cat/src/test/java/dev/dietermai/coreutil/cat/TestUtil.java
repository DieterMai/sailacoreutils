package dev.dietermai.coreutil.cat;

import static org.junit.jupiter.api.Assertions.fail;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class TestUtil {
	public static void verboseCompare(String exptected, String actual) {
		if(Objects.equals(exptected, actual)) {
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("Actual does not equal expected.\n");
		
		
		sb.append("Expexted: ").append(exptected.toString()).append("\n");
		sb.append("Actual:   ").append(actual.toString()).append("\n");
		sb.append("\n");
		sb.append("Detailed compare:\n");
		
		descripeStringDiff("stdout", sb, exptected, actual);
		
		fail(sb.toString());
	}
	
	public static void verboseCompare(Iterator<String> expectedIter, Iterator<String> actualIter) {
		int lineIndex = 0;
		while(expectedIter.hasNext() && actualIter.hasNext()) {
			String expectedLine = expectedIter.next();
			String actualLine = actualIter.next();
			if(Objects.equals(expectedLine, actualLine)) {
				lineIndex++;
				continue;
			}
			StringBuilder sb = new StringBuilder();
			sb.append("Difference in line "+lineIndex).append("\n");
			appendStringElementDiff(sb, expectedLine, actualLine);
			fail(sb.toString());
		}
		if(expectedIter.hasNext()) {
			StringBuilder sb = new StringBuilder();
			sb.append("Difference in line "+lineIndex).append("\n");
			sb.append("Actual has already ended but expected has line: "+expectedIter.next());
			fail(sb.toString());
		}
		if(actualIter.hasNext()) {
			StringBuilder sb = new StringBuilder();
			sb.append("Difference in line "+lineIndex).append("\n");
			sb.append("Expected has already ended but actual has line: "+actualIter.next());
			fail(sb.toString());
		}
	}
	
	public static void descripeStringDiff(String name, StringBuilder sb, String expected, String actual) {
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
				sb.append("\nExpected: "+untranslateEscapes(expectedLine));
				sb.append("\nActual  : "+untranslateEscapes(actualLine));
				return;
			}
			line++;
		}
	}
	
	private static String untranslateEscapes(String s) {
		StringBuilder sb = new StringBuilder();
		
		for(char c : s.toCharArray()) {
			sb.append(
			switch(c){
			case '\0' -> "\\0";
			case '\n' -> "\\n";
			case '\t' -> "\\t";
			case '\r' -> "\\r";
			case '\b' -> "\\b";
			case '\f' -> "\\f";
			default -> Character.toString(c);
			});
		}
		
		return sb.toString();
		
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
		iter.next();
		return c;
	}
	
	public static Iterator<String> toLineIterator(String text){
		return new Iterator<String>() {
			private int startIndex = 0;
			
			@Override
			public String next() {
				int endIndex = startIndex;
				while(endIndex < text.length()) {
					if(text.charAt(endIndex++) == '\n') {
						break;
					}
				}
				String line = text.substring(startIndex, endIndex);
				startIndex = endIndex;
				return line;
			}
			
			@Override
			public boolean hasNext() {
				return startIndex < text.length();
			}
		};
	}
}
