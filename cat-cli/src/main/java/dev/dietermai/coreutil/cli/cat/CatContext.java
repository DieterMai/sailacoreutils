package dev.dietermai.coreutil.cli.cat;

import java.io.FileNotFoundException;

/*
 * TODO Do we really need this?
 */
public interface CatContext {
	Printer getPrinter();
	FileCharSupplier newFileCharSupplier(String name) throws FileNotFoundException;
	SystemService SystemService();
}
