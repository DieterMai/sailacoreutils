package dev.dietermai.coreutil.cat.test.generate;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import dev.dietermai.coreutil.cat.Cat;
import dev.dietermai.coreutil.cat.TestUtil;


public class TestClassPerExecutionGenerator {
    public static final String FILE_TEMPLATE = """
            package dev.dietermai.coreutil.cat.generated;

            import java.io.IOException;
            import java.util.Iterator;

            import org.junit.jupiter.params.ParameterizedTest;
            import org.junit.jupiter.params.provider.ArgumentsSource;

            import dev.dietermai.coreutil.cat.Cat;
            import dev.dietermai.coreutil.cat.TestUtil;
            import dev.dietermai.coreutil.cat.test.ConfigCase;
            import dev.dietermai.coreutil.cat.test.ConfigCases;
            import dev.dietermai.coreutil.cat.test.InputArgumentProvider;
            import dev.dietermai.coreutil.cat.test.InputCase;
            import dev.dietermai.coreutil.cat.test.InputFileProvider;
            import dev.dietermai.coreutil.cat.test.OutputFileProvider;

            class ${CLASS_NAME} {

            ${METHODS}

            }
            """;

    public static final String METHODS_TEMPLATE = """
                @ParameterizedTest
                @ArgumentsSource(InputArgumentProvider.class)
                void testCat${EXECUTE_NAME}WithConfig${CONFIG_NAME}ToResult(InputCase inputCase) throws IOException {
                    final ConfigCase CONFIG = ConfigCases.get().get("${CONFIG_KEY}");

                    String input = InputFileProvider.getTextFor(inputCase);
                    String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
            ${EXECUTION}
                }

            """;


    public static final String EXECUTION_STRING = """
                    String expected = output;

                    String actual = Cat.of(input)${CONFIG_METHODS}.execute();

                    TestUtil.verboseCompare(expected, actual);
            """;
    
    public static final String EXECUTION_ITERATOR = """
		            Iterator<String> expected = TestUtil.toLineIterator(output);

    		  		Iterator<String> actual = Cat.of(input)${CONFIG_METHODS}.iterator();

    		  		TestUtil.verboseCompare(expected, actual);
    		""";

    private final String fileName;
    private final List<TestClassRecord> testClassRecords;
    private final Execution exectuion;
    private static final Map<String, String> executionTextMap = new HashMap<>();
    static {
    	executionTextMap.put("string", EXECUTION_STRING);
    	executionTextMap.put("iterator", EXECUTION_ITERATOR);
    }

    public TestClassPerExecutionGenerator(String fileName, List<TestClassRecord> testClassRecords,
            Execution execution) {
        this.fileName = fileName;
        this.testClassRecords = testClassRecords;
        this.exectuion = execution;

    }

    public void generate(PrintWriter printWriter) throws Throwable {
        String text = FILE_TEMPLATE;
        text = text.replace("${CLASS_NAME}", fileName);

        text = text.replace("${METHODS}", getMethods());

        printWriter.print(text);
    }

    private String getMethods() {
        StringBuilder sb = new StringBuilder();

        for (TestClassRecord testClassRecord : testClassRecords) {
            sb.append(getMethod(testClassRecord));
        }

        return sb.toString();
    }

    private String getMethod(TestClassRecord testClassRecord) {
        String text = METHODS_TEMPLATE;
        text = text.replace("${EXECUTE_NAME}", exectuion.Name());
        text = text.replace("${CONFIG_NAME}", testClassRecord.config().Name());
        text = text.replace("${CONFIG_KEY}", testClassRecord.configKey());
        text = text.replace("${EXECUTION}", executionTextMap.get(exectuion.name()));
        text = text.replace("${CONFIG_METHODS}", testClassRecord.config().methods());

        return text;
	}

}
