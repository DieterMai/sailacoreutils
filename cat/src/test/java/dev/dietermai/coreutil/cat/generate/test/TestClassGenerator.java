package dev.dietermai.coreutil.cat.generate.test;

import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TestClassGenerator {

	public static final String PACKAGE_SECTION = """
		package dev.dietermai.coreutil.cat;
		
		""";

	public static final String IMPORT_SECTION = """
				
		import org.junit.jupiter.api.Test;
		
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
		
		String expectedBlock = Stream.of(outputLines).map(this::escapeLine).map(s -> "        "+s).collect(Collectors.joining("\n"));		
		
		return """
					@Test
					void test%1$sConfig() {
						LineSupplier supplier = new TextLineSupplier("%2$s");
						String exptectedOut = \"""
				%4$s\""";
						CatResult expected = CatResult.of(exptectedOut);

						CatResult actual = Cat.of(supplier)%3$s.execute();

						TestUtil.verboseCompare(expected, actual);
					}
				""".formatted(configName, input, configMethods, expectedBlock);
	}
	
	private String escapeLine(String line) {
		StringBuilder sb = new StringBuilder(line.length()+2);
		if(line.length() == 0) {
			sb.append("");
		}else if(line.length() == 1) {
			sb.append(escape(line.charAt(0)));
		}else if(line.length() == 2) {
			sb.append(escape(line.charAt(0)));
			sb.append(escape(line.charAt(1)));
		}else {
			sb.append(escape(line.charAt(0)));
			sb.append(line.substring(1, line.length()-2));
			sb.append(escape(line.charAt(line.length()-1)));
		}
		return sb.toString();
	}
	
	private String escape(char c) {
		return switch(c) {
		case ' ' -> "\\s";
		case '\t' -> "\\t";
		default -> ""+c;
		};
	}
}
