package dev.dietermai.coreutil.cli.test;

import java.io.FileNotFoundException;

import dev.dietermai.coreutil.cat.charsupplier.StringCharSupplier;
import dev.dietermai.coreutil.cli.cat.FileCharSupplier;

public class DummyFileCharSupplier implements FileCharSupplier {

	private StringCharSupplier stringCharSupplier;

	public DummyFileCharSupplier(String text) throws FileNotFoundException {
		this.stringCharSupplier = new StringCharSupplier(text);
	}

	@Override
	public char next() {
		return stringCharSupplier.next();
	}
	
	@Override
	public boolean hasNext() {
		return stringCharSupplier.hasNext();
	}

	@Override
	public void close() throws Exception {
		// TODO
	}

}
