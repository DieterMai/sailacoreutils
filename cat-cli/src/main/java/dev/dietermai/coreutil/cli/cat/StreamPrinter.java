package dev.dietermai.coreutil.cli.cat;

import java.io.PrintStream;
import java.util.Objects;

public class StreamPrinter implements Printer{

	private final PrintStream out;
	private final PrintStream err;
	
	
	public StreamPrinter(PrintStream out, PrintStream err) {
		Objects.requireNonNull(out);
		Objects.requireNonNull(err);
		
		this.out = out;
		this.err = err;
	}

	@Override
	public void print(String string) {
		out.print(string);
		out.flush();
	}
	
	@Override
	public void printError(String string) {
		err.print(string);
		err.flush();
	}
	
}
