package dev.dietermai.coreutil.cat.generate.test;

import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TestClassGenerator {

	public static final String PACKAGE_SECTION = """
		package dev.dietermai.coreutil.cat.gentest;
		
		""";

	public static final String IMPORT_SECTION = """

		import java.util.ArrayList;
		import java.util.List;
		
		import org.junit.jupiter.api.Test;
		
		import dev.dietermai.coreutil.cat.Cat;
		import dev.dietermai.coreutil.cat.CatResult;
		import dev.dietermai.coreutil.cat.LineSupplier;
		import dev.dietermai.coreutil.cat.TestUtil;
		import dev.dietermai.coreutil.cat.TextLineSupplier;
		
		""";
	
	public static final String CLASS_HEAD_SECTION = """
		class %sCatTest {
		
		""";

	public static final String CLASS_FOOD_SECTION = """	
		}
		""";
	
	private final List<TestCaseRecord> testRecords;
	private final String inputName;
	
	public TestClassGenerator(String inputName, List<TestCaseRecord> testRecords) {
		this.testRecords = testRecords;
		this.inputName = inputName;
	}

	public void generate(PrintWriter printWriter) {
		printWriter.print(PACKAGE_SECTION);
		printWriter.print(IMPORT_SECTION);
		printWriter.print(CLASS_HEAD_SECTION.formatted(inputName));
		
		createTestMethods(printWriter);
		
		printWriter.print(CLASS_FOOD_SECTION);
	}

	private void createTestMethods(PrintWriter printWriter) {
		for(TestCaseRecord test : testRecords) {
			printWriter.println(createTestMethod(test));
		}
	}

	
	private String createTestMethod(TestCaseRecord testCase) {
		String expected = testCase.expected();
		String configName = testCase.config().name();
		String input = testCase.input().input;
		String configMethods = testCase.config().mOptions;
		
		String[] outputLines = expected.split("\\n");
		
		Appender a = new Appender();
		a.indent();
		a.ln("@Test");
		a.ln("void test%1$sConfig() {", configName);
		a.indent();
		a.ln("LineSupplier supplier = new TextLineSupplier(\"%s\");", input);
		a.ln("List<String> expectedLines = new ArrayList<>();");
		a.forEachLn("expectedLines.add(\"%s\");", outputLines);
		a.ln("String expectedOutput = String.join(\"\\n\", expectedLines);");
		a.ln("CatResult expected = CatResult.of(expectedOutput);");
		a.ln();
		a.ln("CatResult actual = Cat.of(supplier)%s.execute();", configMethods);
		a.ln();
		a.ln("TestUtil.verboseCompare(expected, actual);");
		a.dedent();
		a.ln("}");

		return a.toString();
	}
}
