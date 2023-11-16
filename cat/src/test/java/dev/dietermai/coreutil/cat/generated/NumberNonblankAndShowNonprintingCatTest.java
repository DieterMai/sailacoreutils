package dev.dietermai.coreutil.cat.generated;

import java.io.IOException;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import dev.dietermai.coreutil.cat.Cat;
import dev.dietermai.coreutil.cat.CatResult;
import dev.dietermai.coreutil.cat.TestUtil;
import dev.dietermai.coreutil.cat.test.ConfigCase;
import dev.dietermai.coreutil.cat.test.ConfigCases;
import dev.dietermai.coreutil.cat.test.InputArgumentProvider;
import dev.dietermai.coreutil.cat.test.InputCase;
import dev.dietermai.coreutil.cat.test.InputFileProvider;
import dev.dietermai.coreutil.cat.test.OutputFileProvider;

class NumberNonblankAndShowNonprintingCatTest {

	private static final ConfigCase CONFIG = ConfigCases.get().get("--number-nonblank --show-nonprinting");

	@ParameterizedTest
	@ArgumentsSource(InputArgumentProvider.class)
    void testCatWithNumberNonblankAndShowNonprintingToResult(InputCase inputCase) throws IOException {
        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
        CatResult expected = CatResult.of(output);

        CatResult actual = Cat.of(input).numberNonblank().showNonprinting().execute();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
	@ArgumentsSource(InputArgumentProvider.class)
    void testCatWithNumberNonblankAndShowNonprintingToString(InputCase inputCase) throws IOException {
        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
        String expected = output;

        String actual = Cat.of(input).numberNonblank().showNonprinting().executeToString();

        TestUtil.verboseCompare(expected, actual);
    }
}
