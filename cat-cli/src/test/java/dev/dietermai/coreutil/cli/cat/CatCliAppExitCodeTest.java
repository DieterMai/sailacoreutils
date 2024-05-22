package dev.dietermai.coreutil.cli.cat;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.FileNotFoundException;
import java.util.List;

import org.apache.commons.cli.AlreadySelectedException;
import org.apache.commons.cli.AmbiguousOptionException;
import org.apache.commons.cli.MissingArgumentException;
import org.apache.commons.cli.MissingOptionException;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.UnrecognizedOptionException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import dev.dietermai.coreutil.cat.CatConfig;
import dev.dietermai.coreutil.cli.cat.error.ExitCode;
import dev.dietermai.coreutil.cli.cat.parse.result.ParsingExecutionResult;
import dev.dietermai.coreutil.cli.test.TestCatContext;
import dev.dietermai.coreutil.cli.test.TestHelper;

@ExtendWith(MockitoExtension.class)
class CatCliAppExitCodeTest {

	@Mock
	TestCatContext context;

	@Mock
	CatCliParser parser;

	@Mock
	SystemService system;

	@Test
	void test_AmbiguesOptionError() throws CatCliException {
		// Prepare
		TestHelper helper = TestHelper.of(context, parser, system);
		AmbiguousOptionException original = new AmbiguousOptionException("", List.of());
		CatCliException exception = CatCliException.of(original);
		
		// Arrange
		helper.parsingThrows(exception);

		// Act
		new CatCliApp(new String[] { "" }, context).start();

		// Assert
		helper.verifyExitCode(ExitCode.AMBIGUOUS_OPTIONS);
	}

	

}
