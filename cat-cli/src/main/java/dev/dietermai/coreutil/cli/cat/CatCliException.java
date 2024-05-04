package dev.dietermai.coreutil.cli.cat;

import java.io.FileNotFoundException;

import org.apache.commons.cli.AlreadySelectedException;
import org.apache.commons.cli.AmbiguousOptionException;
import org.apache.commons.cli.MissingArgumentException;
import org.apache.commons.cli.MissingOptionException;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.UnrecognizedOptionException;

import dev.dietermai.coreutil.cli.cat.error.ExitCode;

public class CatCliException extends Exception {
	private static final long serialVersionUID = 1L;

	private final int code;

	public static CatCliException of(Throwable e) {
		return new CatCliException(e, mapToCode(e));
	}

	private static int mapToCode(Throwable e) {
		return switch (e) {
		case null 							-> ExitCode.MISSNG_EXCEPTION.code();
		case AmbiguousOptionException _		-> ExitCode.AMBIGUOUS_OPTIONS.code();
		case UnrecognizedOptionException _	-> ExitCode.UNRECOGNIZED_OPTION.code();
		case MissingOptionException _		-> ExitCode.MISSING_OPTION.code();
		case MissingArgumentException _		-> ExitCode.MISSING_ARGUMENT.code();
		case AlreadySelectedException _		-> ExitCode.ALREADY_SELECTED_OPTION.code();
		case ParseException _ 				-> ExitCode.PARSER_ERROR.code();
		case FileNotFoundException _ 		-> ExitCode.FILE_NOT_FOUND.code();
		case Exception _					-> ExitCode.FILE_CLOSE_ERROR.code(); // TODO strange that a generic excpetion leads to file close error
		case Throwable _ 					-> ExitCode.OTHER_ERROR.code();
		};
	}

	private CatCliException(Throwable nested, int code) {
		super(nested);
		this.code = code;
	}

	public int getErrorCode() {
		return code;
	}
}
