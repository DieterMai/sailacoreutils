package dev.dietermai.coreutil.cat.generate.input;

import java.util.ArrayList;
import java.util.List;

public class InputCases {
	public static List<InputCase> get(){
		List<InputCase> cases = new ArrayList<>();
		cases.add(blankLineSpaces());
		cases.add(blankLineTabs());
		cases.add(emptyLine());
		cases.add(simpleLine());
		cases.add(simpleMultiLineText());
		cases.add(textWithEmptyTrailingLine());
		cases.add(textWithBlankTrailingLineSpaces());
		cases.add(textWithBlankTrailingLineTabs());
		cases.add(textWithMultipleEmptyLines());
		cases.add(textWithMultipleSegmentsOfBlankLines());
		cases.add(textWithNoTrailingEmptyLine());
		cases.addAll(getTextsWithAllAscii());
		
		return cases;
	}
	
	private static InputCase blankLineSpaces() {
		return new InputCase(
				"BlankLineSpaces",
				"    ");
	}
	
	private static InputCase blankLineTabs() {
		return new InputCase(
				"BlankLineTabs",
				"\t\t\t\t");
	}
	
	private static InputCase emptyLine() {
		return new InputCase(
				"EmptyLine",
				"");
	}
	
	private static InputCase simpleLine() {
		return new InputCase(
				"SimpleLine",
				"A Simple Line");
	}
	
	private static InputCase simpleMultiLineText() {
		return new InputCase(
				"SimpleMultiLineText",
				"""
				This is a simple text
				second line
				third line
				forth line
				5th line
				6th line""");
	}
	
	
	
	private static InputCase textWithBlankTrailingLineSpaces() {
		return new InputCase(
				"TextWithBlankTrailingLineSpaces",
				"""
				This is a simple text
				second line
				
				
				
				6th line
				    """);
	}
	
	private static InputCase textWithBlankTrailingLineTabs() {
		return new InputCase(
				"TextWithBlankTrailingLineTabs",
				"""
				This is a simple text
				second line
				
				
				
				6th line
				\t\t\t\t""");
	}
	
	
	private static InputCase textWithMultipleEmptyLines() {
		return new InputCase(
				"TextWithMultipleEmptyLines",
				"""
				This is a text with multiple empty lines
				This line is not empty
				
				
				
				
				
				
				This line is not empty again""");
	}
	
	
	private static InputCase textWithMultipleSegmentsOfBlankLines() {
		return new InputCase(
				"TextWithMultipleSegmentsOfBlankLines",
				"""
				This is a text with multiple empty lines
				This line is not empty
				
				
				
				
				\s\s\s\s
				\s\s\s\s
				\s\s\s\s
				\s\s\s\s
				\t\t\t\t
				\t\t\t\t
				\t\t\t\t
				\t\t\t\t
				This line is not empty again""");
	}
	
	
	private static InputCase textWithNoTrailingEmptyLine() {
		return new InputCase(
				"TextWitTextWithNoTrailingEmptyLinehEmptyTrailingLine",
				"""
				This is a simple text
				second line
				3rd line""");
	}
	
	
	
	private static InputCase textWithEmptyTrailingLine() {
		return new InputCase(
				"TextWithEmptyTrailingLine",
				"""
				This is a simple text
				second line
				
				
				
				6th line
				""");
	}
	
	private static List<InputCase> getTextsWithAllAscii() {
		List<InputCase> cases = new ArrayList<>();
		for(int i = 0; i < 256; i++) {
			cases.add(getTextWithAscii(i));
		}
		
		return cases;
		
	}

	private static InputCase getTextWithAscii(int i) {
		String hex = Integer.toHexString(i);
		String code = "0000".substring(0, 4-hex.length())+hex;
		char c = (char)i;
		return new InputCase(
				"TextWithAscii"+code,
				"""
				This is a text containing '%2$s' (code %1$s) characters
				
				
				
				%2$s%2$s%2$s%2$s
				
				
				
				last line""".formatted(i, c));
	}
	
}
