package dev.dietermai.coreutil.cli.cat;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.apache.commons.cli.AmbiguousOptionException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import dev.dietermai.coreutil.cli.test.TestCatContext;

@ExtendWith(MockitoExtension.class)
class CatCliAppErrorTest {
	
	@Mock
	TestCatContext context;
	
	@Mock
	CatCliParser parser;
	
	@Mock
	SystemService systemService;
	
	@Test
	void test_AmbiguesOptionError() throws CatCliException {
		// Prepare
		AmbiguousOptionException original = new AmbiguousOptionException("fooOption", List.of("fooOptionA", "fooOptionB"));
		CatCliException exception = CatCliException.of(original);

		// Arrange
		when(context.getCatCommandLineParser()).thenReturn(parser);
		when(parser.parse(any())).thenThrow(exception);
		when(context.getSystemService()).thenReturn(systemService);
		
		// Act
		CatCliApp app = new CatCliApp(new String[]{""}, context);
		
		// Assert
		verify(systemService, times(1)).exit(0);
	} 
	

}
