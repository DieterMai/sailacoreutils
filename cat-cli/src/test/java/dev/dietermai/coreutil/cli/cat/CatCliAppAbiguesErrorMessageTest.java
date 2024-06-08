package dev.dietermai.coreutil.cli.cat;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import dev.dietermai.coreutil.cli.test.PrinterDummy;
import dev.dietermai.coreutil.cli.test.TestHelper;

@ExtendWith(MockitoExtension.class)
class CatCliAppAbiguesErrorMessageTest {

	@Mock
	CatCliParser parser;

	@Mock
	SystemService system;

	@Test
	void test_AmbiguesOption_leadsTo_ambigousOptionExitCode() throws CatCliException {
		// Arrange
		TestHelper helper = TestHelper.of(system);
		CatContext context = helper.context();

		// Act
		new CatCliApp(new String[] { "--num" }, context).start();

		// assert
		PrinterDummy printer = (PrinterDummy) context.getPrinter();
		assertEquals("""
				Ambiguous option: '--num'  (could be: 'number', 'number-nonblank')
				Try 'cat --help' for more information.
				""", printer.getErrContent());
		assertEquals("", printer.getOutContent());
		
	}
}
