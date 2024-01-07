package dev.dietermai.coreutil.cli.cat.parse.result;

import java.util.List;

import dev.dietermai.coreutil.cat.CatRecord;

public record ParsingExecutionResult(CatRecord catConfig, List<String> operands) implements ParsingResult{
	public static ParsingExecutionResult of() {
		return new ParsingExecutionResult(CatRecord.of(), List.of());
	}
	
	public static ParsingExecutionResult of(CatRecord catConfig) {
		return new ParsingExecutionResult(catConfig, List.of());
	}

	public static ParsingExecutionResult of(CatRecord catConfig, List<String> operands) {
		return new ParsingExecutionResult(catConfig, operands);
	}
}
