package dev.dietermai.coreutil.cli.cat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import dev.dietermai.coreutil.cli.cat.error.ExitCode;
import dev.dietermai.coreutil.cli.test.TestHelper;

@ExtendWith(MockitoExtension.class)
class CatCliAppExitCodeTest {

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
		helper.verifyExitCode(ExitCode.AMBIGUOUS_OPTIONS);
	}
	
	@Test
	void test_UnsupportedOption_leadsTo_unrecognizedOptionExitCode() throws CatCliException {
		// Arrange
		TestHelper helper = TestHelper.of(system);
		CatContext context = helper.context();

		// Act
		new CatCliApp(new String[] { "--foo" }, context).start();

		// assert
		helper.verifyExitCode(ExitCode.UNRECOGNIZED_OPTION);
	}
}
