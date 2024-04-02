package dev.dietermai.coreutil.cli.cat;

import java.io.FileNotFoundException;

import dev.dietermai.coreutil.cli.cat.parse.CatCliParserImple;

public class CatContextImple implements CatContext {

	@Override
	public Printer getPrinter() {
		return new StreamPrinter(System.out);
	}

	@Override
	public FileCharSupplier newFileCharSupplier(String name) throws FileNotFoundException {
		return FileCharSupplierImple.of(name);
	}

	@Override
	public CatCliParser getCatCommandLineParser() {
		return new CatCliParserImple();
	}

}
