package dev.dietermai.coreutil.cli.cat;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
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

@ExtendWith(MockitoExtension.class)
class CatCliAppExitCodeTest {

	@Mock
	TestCatContext context;

	@Mock
	CatCliParser parser;

	@Mock
	SystemService systemService;

	@Test
	void test_AmbiguesOptionError() throws CatCliException {
		// Prepare
		AmbiguousOptionException original = new AmbiguousOptionException("fooOption",
				List.of("fooOptionA", "fooOptionB"));
		CatCliException exception = CatCliException.of(original);

		// Arrange
		when(context.getCatCommandLineParser()).thenReturn(parser);
		when(parser.parse(any())).thenThrow(exception);
		when(context.getSystemService()).thenReturn(systemService);

		// Act
		CatCliApp app = new CatCliApp(new String[] { "" }, context);
		app.start();

		// Assert
		verify(systemService, times(1)).exit(ExitCode.AMBIGUOUS_OPTIONS.code());
	}

	@Test
	void test_UnrecognizedOptionException() throws CatCliException {
		// Prepare
		UnrecognizedOptionException original = new UnrecognizedOptionException("Message");
		CatCliException exception = CatCliException.of(original);

		// Arrange
		when(context.getCatCommandLineParser()).thenReturn(parser);
		when(parser.parse(any())).thenThrow(exception);
		when(context.getSystemService()).thenReturn(systemService);

		// Act
		CatCliApp app = new CatCliApp(new String[] { "" }, context);
		app.start();

		// Assert
		verify(systemService, times(1)).exit(ExitCode.UNRECOGNIZED_OPTION.code());
	}

	@Test
	void test_MissingOption() throws CatCliException {
		// Prepare
		MissingOptionException original = new MissingOptionException("Message");
		CatCliException exception = CatCliException.of(original);

		// Arrange
		when(context.getCatCommandLineParser()).thenReturn(parser);
		when(parser.parse(any())).thenThrow(exception);
		when(context.getSystemService()).thenReturn(systemService);

		// Act
		CatCliApp app = new CatCliApp(new String[] { "" }, context);
		app.start();

		// Assert
		verify(systemService, times(1)).exit(ExitCode.MISSING_OPTION.code());
	}

	@Test
	void test_MissingArgumentException_leadsTo_MissingArgumentExitCode() throws CatCliException {
		// Prepare
		MissingArgumentException original = new MissingArgumentException("Message");
		CatCliException exception = CatCliException.of(original);

		// Arrange
		when(context.getCatCommandLineParser()).thenReturn(parser);
		when(parser.parse(any())).thenThrow(exception);
		when(context.getSystemService()).thenReturn(systemService);

		// Act
		CatCliApp app = new CatCliApp(new String[] { "" }, context);
		app.start();

		// Assert
		verify(systemService, times(1)).exit(ExitCode.MISSING_ARGUMENT.code());
	}

	@Test
	void test_AlreadySelectedException_leadsTo_AlreadySelectedOptionExitCode() throws CatCliException {
		// Prepare
		AlreadySelectedException original = new AlreadySelectedException("Message");
		CatCliException exception = CatCliException.of(original);

		// Arrange
		when(context.getCatCommandLineParser()).thenReturn(parser);
		when(parser.parse(any())).thenThrow(exception);
		when(context.getSystemService()).thenReturn(systemService);

		// Act
		CatCliApp app = new CatCliApp(new String[] { "" }, context);
		app.start();

		// Assert
		verify(systemService, times(1)).exit(ExitCode.ALREADY_SELECTED_OPTION.code());
	}

	@Test
	void test_ParserException_leadsTo_ParseExceptionExitCode() throws CatCliException {
		// Prepare
		ParseException original = new ParseException("Message");
		CatCliException exception = CatCliException.of(original);

		// Arrange
		when(context.getCatCommandLineParser()).thenReturn(parser);
		when(parser.parse(any())).thenThrow(exception);
		when(context.getSystemService()).thenReturn(systemService);

		// Act
		CatCliApp app = new CatCliApp(new String[] { "" }, context);
		app.start();

		// Assert
		verify(systemService, times(1)).exit(ExitCode.PARSER_ERROR.code());
	}

	@Test
	void test_Throwable_leadsTo_OtherErrorExitCode() throws CatCliException {
		// Prepare
		Throwable original = new Throwable("Message");
		CatCliException exception = CatCliException.of(original);

		// Arrange
		when(context.getCatCommandLineParser()).thenReturn(parser);
		when(parser.parse(any())).thenThrow(exception);
		when(context.getSystemService()).thenReturn(systemService);

		// Act
		CatCliApp app = new CatCliApp(new String[] { "" }, context);
		app.start();

		// Assert
		verify(systemService, times(1)).exit(ExitCode.OTHER_ERROR.code());
	}

	@Test
	void test_FileNotFoundException_leadsTo_FileNotFoundExitCode() throws FileNotFoundException, CatCliException {
		// Prepare
		FileNotFoundException exception = new FileNotFoundException("Message");

		// Arrange
		when(context.getCatCommandLineParser()).thenReturn(parser);
		when(context.getSystemService()).thenReturn(systemService);
		when(context.newFileCharSupplier(any())).thenThrow(exception);
		when(parser.parse(any())).thenReturn(ParsingExecutionResult.of(CatConfig.of(), List.of("foo")));
		
		// Act
		CatCliApp app = new CatCliApp(new String[] { "" }, context);
		app.start();

		// Assert
		verify(systemService, times(1)).exit(ExitCode.FILE_NOT_FOUND.code());
	}
	
	@Test
	void test_ExceptionOnClose_leadsTo_FileCloseErrorExitCode() throws Exception {
		// Prepare
		Exception exception = new Exception("Message");
		FileCharSupplier fileCharSupplier = mock(FileCharSupplier.class);
		
		// Arrange
		when(context.getCatCommandLineParser()).thenReturn(parser);
		when(context.getSystemService()).thenReturn(systemService);
		when(context.newFileCharSupplier(any())).thenReturn(fileCharSupplier);
		when(parser.parse(any())).thenReturn(ParsingExecutionResult.of(CatConfig.of(), List.of("foo")));
		doThrow(exception).when(fileCharSupplier).close();
		
		// Act
		CatCliApp app = new CatCliApp(new String[] { "" }, context);
		app.start();

		// Assert
		verify(systemService, times(1)).exit(ExitCode.FILE_CLOSE_ERROR.code());
	}

}
