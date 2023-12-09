package dev.dietermai.coreutil.cat.test.generate;

import java.io.PrintWriter;
import java.util.List;


public class TestClassPerExecutionGenerator {
    public static final String FILE_TEMPLATE = """
            package dev.dietermai.coreutil.cat.generated;

            import java.io.IOException;
            import java.util.Iterator;
            import java.util.stream.Collectors;
            import java.util.stream.Stream;

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

            @SuppressWarnings("unused")
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
                    
                    ${OUTPUT_TYPE} expected = ${TRANSFORMER};
                    
                    ${OUTPUT_TYPE} actual = Cat.of(input)${CONFIG_METHODS}${EXEC_METHODS};
                    
                    TestUtil.verboseCompare(expected, actual);
                }

            """;

    
    private final String fileName;
    private final List<TestClassRecord> testClassRecords;
    private final Execution exectuion;

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
        text = text.replace("${OUTPUT_TYPE}", exectuion.outputType());
        text = text.replace("${TRANSFORMER}", exectuion.transformer());
        text = text.replace("${EXEC_METHODS}", exectuion.method());
        
        text = text.replace("${CONFIG_METHODS}", testClassRecord.config().methods());

        return text;
	}

}
