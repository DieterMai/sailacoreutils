package dev.dietermai.coreutil.cat.test.generate;

import java.io.PrintWriter;
import java.util.List;

import dev.dietermai.coreutil.cat.test.ConfigCase;

public class TestClassPerConfigGenerator {
	public static final String PRE_CLASS = """
			package dev.dietermai.coreutil.cat.generated;

			import java.io.IOException;
			
			import org.junit.jupiter.params.ParameterizedTest;
			import org.junit.jupiter.params.provider.ArgumentsSource;
			
			import dev.dietermai.coreutil.cat.Cat;
			import dev.dietermai.coreutil.cat.CatResult;
			import dev.dietermai.coreutil.cat.TestUtil;
			import dev.dietermai.coreutil.cat.test.ConfigCase;
			import dev.dietermai.coreutil.cat.test.ConfigOptions;
			import dev.dietermai.coreutil.cat.test.InputArgumentProvider;
			import dev.dietermai.coreutil.cat.test.InputCase;
			import dev.dietermai.coreutil.cat.test.InputFileProvider;
			import dev.dietermai.coreutil.cat.test.OutputFileProvider;

			""";

	public static final String CLASS_HEAD_SECTION = """
			class %sCatTest {

			""";
	
	public static final String CONFIG_DECLARATION = """
				private static final ConfigCase CONFIG = ConfigCase.of(%s);
			
			""";

	public static final String CLASS_CLOSE = """
			}
			""";
	
	public static final String METHODS = """
				@ParameterizedTest
				@ArgumentsSource(InputArgumentProvider.class)
			    void testCatWith%1$sToResult(InputCase inputCase) throws IOException {
			        String input = InputFileProvider.getTextFor(inputCase);
			        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
			        CatResult expected = CatResult.of(output);
			        
			        CatResult actual = Cat.of(input)%2$s.execute();
			        
			        TestUtil.verboseCompare(expected, actual);
			    }
			    
			    @ParameterizedTest
				@ArgumentsSource(InputArgumentProvider.class)
			    void testCatWith%1$sToString(InputCase inputCase) throws IOException {
			        String input = InputFileProvider.getTextFor(inputCase);
			        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
			        String expected = output;
			        
			        String actual = Cat.of(input)%2$s.executeToString();
			        
			        TestUtil.verboseCompare(expected, actual);
			    }
			""";

	private final ConfigCase config;

	public TestClassPerConfigGenerator(ConfigCase config, List<TestCaseRecord> testRecords) {
		this.config = config;
	}

	public void generate(PrintWriter printWriter) throws Throwable {
		printWriter.print(PRE_CLASS);
		printWriter.print(adaptClassDeclaration());
		
		printWriter.print(CONFIG_DECLARATION.formatted(config.asCSL()));

		printWriter.print(createTestMethods(printWriter));

		printWriter.print(CLASS_CLOSE);
	}
	
	private String adaptClassDeclaration() {
		return CLASS_HEAD_SECTION.formatted(config.Name());
	}

	private String createTestMethods(PrintWriter printWriter) throws Throwable {
		String configName = config.Name();
		String configMethods = config.methods();

		return METHODS.formatted(configName, configMethods);
	}

}
