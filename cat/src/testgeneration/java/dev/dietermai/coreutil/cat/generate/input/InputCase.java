package dev.dietermai.coreutil.cat.generate.input;

public enum InputCase{
	BlankLineSpaces(
			"    "),
	BlankLineTabs(
			"\t\t\t\t"),
	EmptyLine(
			""),
	SimpleLine(
			"A Simple Line"),
	SimpleMultiLineText("""
			This is a simple text
			second line
			third line
			forth line
			5th line
			6th line"""),
	TextWithEmptyTrailingLine("""
			This is a simple text
			second line
			
			
			
			6th line
			"""),
	TextWithBlankTrailingLineSpaces("""
			This is a simple text
			second line
			
			
			
			6th line
			    """),
	TextWithBlankTrailingLineTabs("""
			This is a simple text
			second line
			
			
			
			6th line
			\t\t\t\t"""),
	TextWithMultipleEmptyLines("""
			This is a text with multiple empty lines
			This line is not empty
			
			
			
			
			
			
			This line is not empty again"""),
	TextWithMultipleSegmentsOfBlankLines("""
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
			This line is not empty again"""),
	TextWithNoTrailingEmptyLine("""
			This is a simple text
			second line
			3rd line"""),
	TextWithZeroInTheMiddle("""
			This is a simple text
			This line co\0tains a null character
			This is the last line
			"""),
	;
	
	
	public String text;
	
	private InputCase(String text) {
		this.text = text;
	}
}
