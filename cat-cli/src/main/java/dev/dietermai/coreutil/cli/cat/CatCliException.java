package dev.dietermai.coreutil.cli.cat;

import org.apache.commons.cli.AlreadySelectedException;
import org.apache.commons.cli.AmbiguousOptionException;
import org.apache.commons.cli.MissingArgumentException;
import org.apache.commons.cli.MissingOptionException;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.UnrecognizedOptionException;

import dev.dietermai.coreutil.cli.cat.error.ExitCode;

public class CatCliException extends Exception {
	private static final long serialVersionUID = 1L;

	private final ExitCode code;

	private CatCliException(String message, ExitCode code, Throwable nested) {
		super(message, nested);
		this.code = code;
	}

	public ExitCode getErrorCode() {
		return code;
	}

	public static CatCliException ambiguousOption(AmbiguousOptionException e) {
		return new CatCliException(e.getMessage(), ExitCode.AMBIGUOUS_OPTIONS, e);
	}

	public static CatCliException unrecognizedOption(UnrecognizedOptionException e) {
		return new CatCliException(e.getMessage(), ExitCode.UNRECOGNIZED_OPTION, e);
	}

	public static CatCliException missingOption(MissingOptionException e) {
		return new CatCliException(e.getMessage(), ExitCode.MISSING_OPTION, e);
	}

	public static CatCliException missingArgument(MissingArgumentException e) {
		return new CatCliException(e.getMessage(), ExitCode.MISSING_ARGUMENT, e);
	}

	public static CatCliException alreadySelected(AlreadySelectedException e) {
		return new CatCliException(e.getMessage(), ExitCode.ALREADY_SELECTED_OPTION, e);
	}

	public static CatCliException parseException(ParseException e) {
		return new CatCliException(e.getMessage(), ExitCode.PARSER_ERROR, e);
	}

	public static CatCliException unexpectedParsingException(Exception e) {
		return new CatCliException(e.getMessage(), ExitCode.UNEXPECTED_PARSING_ERROR, e);
	}
	
	
}
