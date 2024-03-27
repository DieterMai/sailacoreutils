package dev.dietermai.coreutil.cli.test;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import dev.dietermai.coreutil.cli.cat.CatContext;
import dev.dietermai.coreutil.cli.cat.IFileCharSupplier;
import dev.dietermai.coreutil.cli.cat.IPrinter;

public class TestCatContext implements CatContext {

	private final PrinterDummy printer = new PrinterDummy();
	private final Map<String, DummyFileCharSupplier> fileCharSupplierMap = new HashMap<>();
	
	@Override
	public IPrinter getPrinter() {
		return printer;
	}

	public void addFileCharSupplier(String name, String text) {
		try {
			fileCharSupplierMap.put(name, new DummyFileCharSupplier(text));
		} catch (FileNotFoundException e) {
			// TODO
		}
	}
	
	@Override
	public IFileCharSupplier newFileCharSupplier(String name) throws FileNotFoundException {
		return fileCharSupplierMap.get(name);
	}

}
