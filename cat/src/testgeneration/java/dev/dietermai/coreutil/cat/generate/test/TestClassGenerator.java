package dev.dietermai.coreutil.cat.generate.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.List;

import dev.dietermai.coreutil.cat.generate.Constants;


public class TestClassGenerator {

	public static final String PACKAGE_SECTION = """
		package dev.dietermai.coreutil.cat.generated;
		
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

	public void generate(PrintWriter printWriter) throws Throwable {
		printWriter.print(PACKAGE_SECTION);
		printWriter.print(IMPORT_SECTION);
		printWriter.print(CLASS_HEAD_SECTION.formatted(inputName));
		
		createTestMethods(printWriter);
		
		printWriter.print(CLASS_FOOD_SECTION);
	}

	private void createTestMethods(PrintWriter printWriter) throws Throwable {
		for(TestCaseRecord test : testRecords) {
			printWriter.println(createTestMethod(test));
		}
	}

	
	private String createTestMethod(TestCaseRecord testCase) throws Throwable {
		String expected = testCase.expected();
		String configName = testCase.config().name();
		String input = testCase.input().text;
		String configMethods = testCase.config().mOptions;
		
		String[] outputLines = expected.split("\\n");
		
		Appender a = new Appender();
		a.indent();
		a.ln("@Test");
		a.ln("void test%1$sConfig() {", configName);
		a.indent();
		a.ln("List<String> inputLines = new ArrayList<>();");
		a.forEachLn("inputLines.add(\"%s\");", input.split("\\n"));		
		a.ln("LineSupplier supplier = new TextLineSupplier(String.join(\"\\n\", inputLines));");
		a.ln();
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
