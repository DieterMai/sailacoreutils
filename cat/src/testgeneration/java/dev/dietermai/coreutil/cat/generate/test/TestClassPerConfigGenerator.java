package dev.dietermai.coreutil.cat.generate.test;

import java.io.PrintWriter;
import java.util.List;


public class TestClassPerConfigGenerator {

	public static final String PACKAGE_SECTION = """
		package dev.dietermai.coreutil.cat.generated;
		
		""";

	public static final String IMPORT_SECTION = """

		import java.nio.file.Path;
		
		import org.junit.jupiter.api.Test;
		
		import dev.dietermai.coreutil.cat.Cat;
		import dev.dietermai.coreutil.cat.CatResult;
		import dev.dietermai.coreutil.cat.TestUtil;
		import dev.dietermai.coreutil.cat.testutil.ReadFile;
		
		""";
	
	public static final String CLASS_HEAD_SECTION = """
		class %sCatTest {
		
		""";

	public static final String CLASS_FOOD_SECTION = """	
		}
		""";
	
	private final List<TestCaseRecord> testRecords;
	private final String name;
	
	public TestClassPerConfigGenerator(String name, List<TestCaseRecord> testRecords) {
		this.testRecords = testRecords;
		this.name = name;
	}

	public void generate(PrintWriter printWriter) throws Throwable {
		printWriter.print(PACKAGE_SECTION);
		printWriter.print(IMPORT_SECTION);
		printWriter.print(CLASS_HEAD_SECTION.formatted(Captialize(name)));
		
		createTestMethods(printWriter);
		
		printWriter.print(CLASS_FOOD_SECTION);
	}

	private void createTestMethods(PrintWriter printWriter) throws Throwable {
		for(TestCaseRecord test : testRecords) {
			printWriter.println(createTestMethodLineString(test));
		}
	}

	
	
	private String createTestMethodLineString(TestCaseRecord testCase) throws Throwable {
		String configName = testCase.config().name();
		String configMethod = testCase.config().methods();
		String inputName = testCase.input().name();
		String inputFile = inputName+".txt";
		String outputFile = inputName+"_"+configName+".txt";
		
		Appender a = new Appender();
		a.indent();
		a.ln("@Test");
		a.ln("void testWithInput%1$s_String() {", Captialize(inputName));
		a.indent();
		a.ln("String input = ReadFile.readFile(Path.of(\"./src/testgeneration/resources/input/%s\"));", inputFile);
		a.ln("String output = ReadFile.readFile(Path.of(\"./src/testgeneration/resources/output/%s\"));", outputFile);
		a.ln("CatResult expected = CatResult.of(output);");
		a.ln();
		a.ln("CatResult actual = Cat.of(input)"+configMethod+".toResult();");
        a.ln();
        a.ln("TestUtil.verboseCompare(expected, actual);");
		a.dedent();
		a.ln("}");

		return a.toString();
	}
	
	private String Captialize(String s) {
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}
}
