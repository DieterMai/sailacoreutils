package dev.dietermai.coreutil.cli.cat.parse.result;

public record ParsingVersionResult() implements ParsingResult{
	public static ParsingVersionResult of() {
		return new ParsingVersionResult();
	}
}
