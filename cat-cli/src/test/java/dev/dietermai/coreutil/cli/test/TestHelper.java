package dev.dietermai.coreutil.cli.test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Assertions;

import dev.dietermai.coreutil.cli.cat.CatContext;
import dev.dietermai.coreutil.cli.cat.FileCharSupplier;
import dev.dietermai.coreutil.cli.cat.SystemService;
import dev.dietermai.coreutil.cli.cat.error.ExitCode;

public class TestHelper {
	TestCatContext context;
	SystemService system;
	
	public TestHelper(SystemService system) {
		this.system = system;
		this.context = new TestCatContext(system);
	}
	
	public static TestHelper of(SystemService system) {
		TestHelper instance = new TestHelper(system);
		instance.initialize();
		return instance;
	}

	private TestHelper initialize() {
		return this;
	}
	
	public CatContext context() {
		return context;
	}
	
	// TODO remove
	public void parsingThrows(Throwable t) {
	}
	
	public void fileCharSupplierFailsToClose(FileCharSupplier fileCharSupplier, Exception exception) {
		try {
			doThrow(exception).when(fileCharSupplier).close();
		} catch (Exception e) {
			Assertions.fail();
		}
	}
	
	public void creatingFailSupplierFails(FileNotFoundException e) {
		try {
			when(context.newFileCharSupplier(any())).thenThrow(e);
		} catch (FileNotFoundException e1) {
			Assertions.fail();
		}
	}
	
	public FileCharSupplier creatingFileSupplierSucceeds() {
		try {
			FileCharSupplier fileCharSupplier = mock(FileCharSupplier.class);
			when(context.newFileCharSupplier(any())).thenReturn(fileCharSupplier);
			return fileCharSupplier;
		} catch (FileNotFoundException e1) {
			Assertions.fail();
			return null;
		}
	}
	
	
	
	/* ************* */
	/* Verifier      */
	/* ************* */
	public void verifyExitCode(ExitCode exitCode) {
		verify(system, times(1)).exit(exitCode.value());
	}
	
}
