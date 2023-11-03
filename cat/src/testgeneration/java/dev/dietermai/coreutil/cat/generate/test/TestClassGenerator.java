package dev.dietermai.coreutil.cat.generate.test;

import java.io.PrintWriter;
import java.util.List;


public class TestClassGenerator {

	public static final String PACKAGE_SECTION = """
		package dev.dietermai.coreutil.cat.generated;
		
		""";

	public static final String IMPORT_SECTION = """

		import java.nio.file.Path;
		
		import org.junit.jupiter.api.Test;
		
		import dev.dietermai.coreutil.cat.Cat;
		import dev.dietermai.coreutil.cat.CatResult;
		import dev.dietermai.coreutil.cat.LineSupplier;
		import dev.dietermai.coreutil.cat.TestUtil;
		import dev.dietermai.coreutil.cat.TextLineSupplier;
		import dev.dietermai.coreutil.cat.testutil.ReadFile;
		
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
			printWriter.println(createTestMethodLineSupplier(test));
			printWriter.println(createTestMethodLineString(test));
			
		}
	}

	
	private String createTestMethodLineSupplier(TestCaseRecord testCase) throws Throwable {
		String configName = testCase.config().name();
		String inputFile = testCase.input().name()+".txt";
		String outputFile = testCase.input().name()+configName+".txt";
				
		Appender a = new Appender();
		a.indent();
		a.ln("@Test");
		a.ln("void test%1$sConfig_LineSupplier() {", configName);
		a.indent();
		a.ln("String input = ReadFile.readFile(Path.of(\"./src/testgeneration/resources/input/%s\"));", inputFile);
		a.ln("String output = ReadFile.readFile(Path.of(\"./src/testgeneration/resources/output/%s\"));", outputFile);
		a.ln("LineSupplier supplier = new TextLineSupplier(input);");
		a.ln("CatResult expected = CatResult.of(output);");
		a.ln();
		a.ln("CatResult actual = Cat.of(supplier).execute();");
        a.ln();
        a.ln("TestUtil.verboseCompare(expected, actual);");
		a.dedent();
		a.ln("}");

		return a.toString();
	}
	
	private String createTestMethodLineString(TestCaseRecord testCase) throws Throwable {
		String configName = testCase.config().name();
		String inputFile = testCase.input().name()+".txt";
		String outputFile = testCase.input().name()+configName+".txt";
				
		Appender a = new Appender();
		a.indent();
		a.ln("@Test");
		a.ln("void test%1$sConfig_String() {", configName);
		a.indent();
		a.ln("String input = ReadFile.readFile(Path.of(\"./src/testgeneration/resources/input/%s\"));", inputFile);
		a.ln("String output = ReadFile.readFile(Path.of(\"./src/testgeneration/resources/output/%s\"));", outputFile);
		a.ln("CatResult expected = CatResult.of(output);");
		a.ln();
		a.ln("CatResult actual = Cat.of(input).execute();");
        a.ln();
        a.ln("TestUtil.verboseCompare(expected, actual);");
		a.dedent();
		a.ln("}");

		return a.toString();
	}
}
