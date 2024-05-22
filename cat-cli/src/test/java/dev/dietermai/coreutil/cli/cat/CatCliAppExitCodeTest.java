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

	@Test
	void test_UnrecognizedOptionException() throws CatCliException {
		// Prepare
		TestHelper helper = TestHelper.of(context, parser, system);
		UnrecognizedOptionException original = new UnrecognizedOptionException("Message");
		CatCliException exception = CatCliException.of(original);

		// Arrange
		helper.parsingThrows(exception);

		// Act
		CatCliApp app = new CatCliApp(new String[] { "" }, context);
		app.start();

		// Assert
		helper.verifyExitCode(ExitCode.UNRECOGNIZED_OPTION);
	}

	@Test
	void test_MissingOption() throws CatCliException {
		// Prepare
		TestHelper helper = TestHelper.of(context, parser, system);
		MissingOptionException original = new MissingOptionException("Message");
		CatCliException exception = CatCliException.of(original);

		// Arrange
		helper.parsingThrows(exception);

		// Act
		CatCliApp app = new CatCliApp(new String[] { "" }, context);
		app.start();

		// Assert
		helper.verifyExitCode(ExitCode.MISSING_OPTION);
	}

	@Test
	void test_MissingArgumentException_leadsTo_MissingArgumentExitCode() throws CatCliException {
		// Prepare
		TestHelper helper = TestHelper.of(context, parser, system);
		MissingArgumentException original = new MissingArgumentException("Message");
		CatCliException exception = CatCliException.of(original);

		// Arrange
		helper.parsingThrows(exception);

		// Act
		CatCliApp app = new CatCliApp(new String[] { "" }, context);
		app.start();

		// Assert
		helper.verifyExitCode(ExitCode.MISSING_ARGUMENT);
	}

	@Test
	void test_AlreadySelectedException_leadsTo_AlreadySelectedOptionExitCode() throws CatCliException {
		// Prepare
		TestHelper helper = TestHelper.of(context, parser, system);
		AlreadySelectedException original = new AlreadySelectedException("Message");
		CatCliException exception = CatCliException.of(original);

		// Arrange
		helper.parsingThrows(exception);

		// Act
		CatCliApp app = new CatCliApp(new String[] { "" }, context);
		app.start();

		// Assert
		helper.verifyExitCode(ExitCode.ALREADY_SELECTED_OPTION);
	}

	@Test
	void test_ParserException_leadsTo_ParseExceptionExitCode() throws CatCliException {
		// Prepare
		TestHelper helper = TestHelper.of(context, parser, system);
		ParseException original = new ParseException("Message");
		CatCliException exception = CatCliException.of(original);

		// Arrange
		helper.parsingThrows(exception);

		// Act
		CatCliApp app = new CatCliApp(new String[] { "" }, context);
		app.start();

		// Assert
		helper.verifyExitCode(ExitCode.PARSER_ERROR);
	}

	@Test
	void test_Throwable_leadsTo_OtherErrorExitCode() throws CatCliException {
		// Prepare
		TestHelper helper = TestHelper.of(context, parser, system);
		Throwable original = new Throwable("Message");
		CatCliException exception = CatCliException.of(original);

		// Arrange
		helper.parsingThrows(exception);

		// Act
		CatCliApp app = new CatCliApp(new String[] { "" }, context);
		app.start();

		// Assert
		helper.verifyExitCode(ExitCode.OTHER_ERROR);
	}

	@Test
	void test_FileNotFoundException_leadsTo_FileNotFoundExitCode() throws FileNotFoundException, CatCliException {
		// Prepare
		TestHelper helper = TestHelper.of(context, parser, system);
		FileNotFoundException exception = new FileNotFoundException("Message");

		// Arrange
		helper.creatingFailSupplierFails(exception);
		when(parser.parse(any())).thenReturn(ParsingExecutionResult.of(CatConfig.of(), List.of("foo")));
		
		// Act
		CatCliApp app = new CatCliApp(new String[] { "" }, context);
		app.start();

		// Assert
		helper.verifyExitCode(ExitCode.FILE_NOT_FOUND);
	}
	
	@Test
	void test_ExceptionOnClose_leadsTo_FileCloseErrorExitCode() throws Exception {
		// Prepare
		TestHelper helper = TestHelper.of(context, parser, system);
		Exception exception = new Exception("Message");
		
		// Arrange
		FileCharSupplier supplier = helper.creatingFileSupplierSucceeds();
		when(parser.parse(any())).thenReturn(ParsingExecutionResult.of(CatConfig.of(), List.of("foo")));
		helper.fileCharSupplierFailsToClose(supplier, exception);
		
		// Act
		CatCliApp app = new CatCliApp(new String[] { "" }, context);
		app.start();

		// Assert
		helper.verifyExitCode(ExitCode.FILE_CLOSE_ERROR);
	}

}
