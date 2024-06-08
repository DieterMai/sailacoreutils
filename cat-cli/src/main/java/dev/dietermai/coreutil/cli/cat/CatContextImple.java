package dev.dietermai.coreutil.cli.cat;

import java.io.FileNotFoundException;

public class CatContextImple implements CatContext {

	@Override
	public Printer getPrinter() {
		return new StreamPrinter(System.out, System.err);
	}

	@Override
	public FileCharSupplier newFileCharSupplier(String name) throws FileNotFoundException {
		return FileCharSupplierImple.of(name);
	}

	@Override
	public SystemService SystemService() {
		return new SystemServiceImple();
	}
}
