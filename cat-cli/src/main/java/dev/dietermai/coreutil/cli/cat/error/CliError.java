package dev.dietermai.coreutil.cli.cat.error;

import org.apache.commons.cli.AmbiguousOptionException;
import org.apache.commons.cli.UnrecognizedOptionException;

public sealed interface CliError{

	static CliError of(Throwable nested) {
		return switch(nested) {
		case null -> new Other(); // TODO
		case AmbiguousOptionException e -> new AmbiguasOption(e.getOption());
		case UnrecognizedOptionException e -> new UnrecognizedOption(e.getOption());
//		case MissingOptionException e -> new MissingOption(); // TODO test
//		case MissingArgumentException e -> new MissingArgument(); // TODO test
//		case AlreadySelectedException e -> new AlreadySelected(); // TODO test
//		case ParseException e -> new Parse(); // TODO
		case Throwable e -> new Other(); // TODO
		};
	}
	
	
	public record AmbiguasOption(String option) implements CliError{
	}
	
	public record UnrecognizedOption(String option) implements CliError{
	}
	
	public record MissingOption() implements CliError{
	}
	
//	public record MissingArgument() implements CliError{
//	}
//	
//	public record AlreadySelected() implements CliError{
//	}
//	
//	public record Parse() implements CliError{
//	}
//	
//	public record FileNotFound(String file) {
//		
//	}
	
	public record Other() implements CliError{
	}
}
