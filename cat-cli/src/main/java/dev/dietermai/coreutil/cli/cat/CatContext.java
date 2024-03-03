package dev.dietermai.coreutil.cli.cat;

import java.io.FileNotFoundException;

public interface CatContext {
	IPrinter getPrinter();
	FileCharSupplier newFileCharSupplier(String name) throws FileNotFoundException;
}
