package dev.dietermai.coreutil.cat.generate.input;

public enum InputCase{
	SimpleLine(
			"SimpleLine", 
			"A Simple Line"),
	EmptyLine(
			"EmptyLine", 
			""),
	BlankLineSpaces(
			"BlankLineSpaces", 
			"      "),
	BlankLineTabs(
			"BlankLineTabs", 
			"						"),
	
	;
	
	
	public String name;
	public String input;
	
	private InputCase(String name, String input) {
		this.name = name;
		this.input = input;
	}
}
