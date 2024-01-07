package dev.dietermai.coreutil.cli.cat.parse.result;

public sealed interface ParsingResult 
permits ParsingExecutionResult, ParsingHelpResult, ParsingVersionResult{
	default boolean isHelp() {
		return this instanceof ParsingHelpResult;
	}

	default boolean isVersion() {
		return this instanceof ParsingVersionResult;
	}
	
	default boolean isExecution() {
		return this instanceof ParsingExecutionResult;
	}
}
