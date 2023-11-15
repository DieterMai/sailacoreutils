package dev.dietermai.coreutil.cat.generate.test;

import java.io.PrintWriter;
import java.util.List;

import dev.dietermai.coreutil.cat.generate.ConfigCase;

public class TestClassPerConfigGenerator {

	public static final String PACKAGE_SECTION = """
			package dev.dietermai.coreutil.cat.generated;

			""";

	public static final String IMPORT_SECTION = """

			import java.io.IOException;

			import org.junit.jupiter.params.ParameterizedTest;
			import org.junit.jupiter.params.provider.ArgumentsSource;
			
			import dev.dietermai.coreutil.cat.Cat;
			import dev.dietermai.coreutil.cat.CatResult;
			import dev.dietermai.coreutil.cat.TestUtil;
			import dev.dietermai.coreutil.cat.generate.ConfigCase;
			import dev.dietermai.coreutil.cat.generate.ConfigOptions;
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

	public static final String CLASS_FOOD_SECTION = """
			}
			""";

	private final ConfigCase config;

	public TestClassPerConfigGenerator(ConfigCase config, List<TestCaseRecord> testRecords) {
		this.config = config;
	}

	public void generate(PrintWriter printWriter) throws Throwable {
		printWriter.print(PACKAGE_SECTION);
		printWriter.print(IMPORT_SECTION);
		printWriter.print(CLASS_HEAD_SECTION.formatted(config.Name()));
		
		printWriter.print(CONFIG_DECLARATION.formatted(config.asCSL()));

		createTestMethods(printWriter);

		printWriter.print(CLASS_FOOD_SECTION);
	}

	private void createTestMethods(PrintWriter printWriter) throws Throwable {
		for (Execution execution : Execution.getExecutions()) {
			printWriter.println(createTestMethodLineString(execution));
		}
	}

	private String createTestMethodLineString(Execution execution) throws Throwable {
		String configName = config.Name();
		String configMethods = config.methods();

		String testMethod = """
					@ParameterizedTest
					@ArgumentsSource(InputArgumentProvider.class)
				    void testCatWith%1$sTo%3$s(InputCase inputCase) throws IOException {
				        String input = InputFileProvider.getTextFor(inputCase);
				        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
				        CatResult expected = CatResult.of(output);
				        
				        CatResult actual = Cat.of(input)%2$s.execute();
				        
				        TestUtil.verboseCompare(expected, actual);
				    }
				""".formatted(configName, configMethods, execution.Name());
		

		return testMethod;
	}
}
