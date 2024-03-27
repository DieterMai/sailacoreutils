package dev.dietermai.coreutil.cli.cat;

import java.io.FileNotFoundException;

public interface CatContext {
	IPrinter getPrinter();
	IFileCharSupplier newFileCharSupplier(String name) throws FileNotFoundException;
}
