package dev.dietermai.coreutil.cli.cat;

import org.junit.jupiter.api.Test;

import dev.dietermai.coreutil.cli.test.PrinterDummy;
import dev.dietermai.coreutil.cli.test.TestCatContext;

class CatCliAppFileTest {
	
	@Test
	void test_File() {
		// arrange
		TestCatContext context = new TestCatContext();
		String[] input = {"foo"};
		CatCliApp app = new CatCliApp(input, context);
		
		// act
		app.start();
		
		// assert
		PrinterDummy printer = (PrinterDummy) context.getPrinter();
		System.out.println(printer.getContent());
	} 
	

}
