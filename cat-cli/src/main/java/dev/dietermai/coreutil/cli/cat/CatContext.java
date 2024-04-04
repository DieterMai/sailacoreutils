package dev.dietermai.coreutil.cli.cat;

import java.io.FileNotFoundException;

public interface CatContext {
	Printer getPrinter();
	FileCharSupplier newFileCharSupplier(String name) throws FileNotFoundException;
	CatCliParser getCatCommandLineParser();
	SystemService getSystemService();
}
