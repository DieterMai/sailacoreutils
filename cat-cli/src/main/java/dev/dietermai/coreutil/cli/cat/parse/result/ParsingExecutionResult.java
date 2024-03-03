package dev.dietermai.coreutil.cli.cat.parse.result;

import java.util.List;

import dev.dietermai.coreutil.cat.CatConfig;

public record ParsingExecutionResult(CatConfig catConfig, List<String> operands) implements ParsingResult{
	public static ParsingExecutionResult of() {
		return new ParsingExecutionResult(CatConfig.of(), List.of());
	}
	
	public static ParsingExecutionResult of(CatConfig catConfig) {
		return new ParsingExecutionResult(catConfig, List.of());
	}

	public static ParsingExecutionResult of(CatConfig catConfig, List<String> operands) {
		return new ParsingExecutionResult(catConfig, operands);
	}
}
