package dev.dietermai.coreutil.cli.cat.error;

public enum ExitCode {
	SUCCESS(0),
	AMBIGUOUS_OPTIONS(1),
	UNRECOGNIZED_OPTION(2),
	MISSING_OPTION(3),
	MISSING_ARGUMENT(4),
	ALREADY_SELECTED_OPTION(5),
	PARSER_ERROR(6),
	OTHER_ERROR(7), 
	MISSNG_EXCEPTION(8),
	FILE_NOT_FOUND(9),
	FILE_CLOSE_ERROR(10);
	;

	private final int code;

	private ExitCode(int code) {
		this.code = code;
	}

	public int code() {
		return code;
	}
}
