package dev.dietermai.coreutil.cli.test;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import dev.dietermai.coreutil.cli.cat.CatContext;
import dev.dietermai.coreutil.cli.cat.FileCharSupplier;
import dev.dietermai.coreutil.cli.cat.SystemService;

public class TestCatContext implements CatContext {

	private final PrinterDummy printer = new PrinterDummy();
	private final Map<String, DummyFileCharSupplier> fileCharSupplierMap = new HashMap<>();
	private final SystemService systemService;
	
	public TestCatContext(SystemService systemService) {
		this.systemService = systemService;
	}
	
	@Override
	public PrinterDummy getPrinter() {
		return printer;
	}

	public void addFileCharSupplier(String name, String text) {
		try {
			fileCharSupplierMap.put(name, new DummyFileCharSupplier(text));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public FileCharSupplier newFileCharSupplier(String name) throws FileNotFoundException {
		return fileCharSupplierMap.get(name);
	}

	@Override
	public SystemService SystemService() {
		return systemService;
	}
}
