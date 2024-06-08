package dev.dietermai.coreutil.cli.test;

import dev.dietermai.coreutil.cli.cat.Printer;

public class PrinterDummy implements Printer {

	private StringBuilder out = new StringBuilder();
	private StringBuilder err = new StringBuilder();
	
	
	@Override
	public void print(String string) {
		out.append(string);
	}

	@Override
	public void printError(String string) {
		err.append(string);
	}

	public String getOutContent() {
		return out.toString();
	}
	
	public String getErrContent() {
		return err.toString();
	}
	
	public void clearContent() {
		this.out = new StringBuilder();
		this.err = new StringBuilder();
	}

}
