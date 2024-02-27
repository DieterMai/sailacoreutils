package dev.dietermai.coreutil.cli.test;

import dev.dietermai.coreutil.cli.cat.IPrinter;

public class PrinterDummy implements IPrinter {

	private StringBuilder sb = new StringBuilder();
	
	@Override
	public void print(String string) {
		sb.append(string);
	}

	public String getContent() {
		return sb.toString();
	}
	
	public void clearContent() {
		this.sb = new StringBuilder();
	}
}
