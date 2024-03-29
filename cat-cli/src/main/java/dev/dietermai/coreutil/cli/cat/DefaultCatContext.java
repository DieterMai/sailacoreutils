package dev.dietermai.coreutil.cli.cat;

import java.io.FileNotFoundException;

public class DefaultCatContext implements CatContext{

	@Override
	public IPrinter getPrinter() {
		return new StreamPrinter(System.out);
	}

	@Override
	public IFileCharSupplier newFileCharSupplier(String name) throws FileNotFoundException {
		return FileCharSupplier.of(name);
	}


}
