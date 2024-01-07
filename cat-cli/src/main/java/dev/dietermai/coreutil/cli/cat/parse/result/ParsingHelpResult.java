package dev.dietermai.coreutil.cli.cat.parse.result;

public record ParsingHelpResult() implements ParsingResult{
	public static ParsingHelpResult of() {
		return new ParsingHelpResult();
	}
}
