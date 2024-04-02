package dev.dietermai.coreutil.cli.cat;

import java.io.PrintStream;

public class StreamPrinter implements Printer{

	private final PrintStream stream;
	
	public StreamPrinter(PrintStream stream) {
		this.stream = stream;
	}

	@Override
	public void print(String string) {
		stream.print(string);
		stream.flush();
	}
	
}
