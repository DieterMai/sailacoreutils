package dev.dietermai.coreutil.cat.generated;


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

class SqueezeBlankCatTest {

	private static final ConfigCase CONFIG = ConfigCase.of(ConfigOptions.squeezeBlank);

	@ParameterizedTest
	@ArgumentsSource(InputArgumentProvider.class)
    void testCatWithSqueezeBlankToResult(InputCase inputCase) throws IOException {
        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
        CatResult expected = CatResult.of(output);

        CatResult actual = Cat.of(input).squeezeBlank().execute();

        TestUtil.verboseCompare(expected, actual);
    }

	@ParameterizedTest
	@ArgumentsSource(InputArgumentProvider.class)
    void testCatWithSqueezeBlankToString(InputCase inputCase) throws IOException {
        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
        CatResult expected = CatResult.of(output);

        CatResult actual = Cat.of(input).squeezeBlank().execute();

        TestUtil.verboseCompare(expected, actual);
    }

}
