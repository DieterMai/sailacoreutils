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

class CatResultExecutionTest {

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatResultWithConfigDefaulttToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
        CatResult expected = CatResult.of(output);

        CatResult actual = Cat.of(input).execute();

        TestUtil.verboseCompare(expected, actual);

    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatResultWithConfigShowTabsAndSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-tabs --squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
        CatResult expected = CatResult.of(output);

        CatResult actual = Cat.of(input).showTabs().squeezeBlank().execute();

        TestUtil.verboseCompare(expected, actual);

    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatResultWithConfigNumberNonblankAndShowTabsToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number-nonblank --show-tabs");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
        CatResult expected = CatResult.of(output);

        CatResult actual = Cat.of(input).numberNonblank().showTabs().execute();

        TestUtil.verboseCompare(expected, actual);

    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatResultWithConfigNumberNonblankAndShowEndsToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number-nonblank --show-ends");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
        CatResult expected = CatResult.of(output);

        CatResult actual = Cat.of(input).numberNonblank().showEnds().execute();

        TestUtil.verboseCompare(expected, actual);

    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatResultWithConfigShowNonprintingToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-nonprinting");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
        CatResult expected = CatResult.of(output);

        CatResult actual = Cat.of(input).showNonprinting().execute();

        TestUtil.verboseCompare(expected, actual);

    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatResultWithConfigShowTabsToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-tabs");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
        CatResult expected = CatResult.of(output);

        CatResult actual = Cat.of(input).showTabs().execute();

        TestUtil.verboseCompare(expected, actual);

    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatResultWithConfigShowEndsAndShowNonprintingToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-ends --show-nonprinting");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
        CatResult expected = CatResult.of(output);

        CatResult actual = Cat.of(input).showEnds().showNonprinting().execute();

        TestUtil.verboseCompare(expected, actual);

    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatResultWithConfigShowNonprintingAndSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-nonprinting --squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
        CatResult expected = CatResult.of(output);

        CatResult actual = Cat.of(input).showNonprinting().squeezeBlank().execute();

        TestUtil.verboseCompare(expected, actual);

    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatResultWithConfigShowEndsAndShowNonprintingAndShowTabsToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-ends --show-nonprinting --show-tabs");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
        CatResult expected = CatResult.of(output);

        CatResult actual = Cat.of(input).showEnds().showNonprinting().showTabs().execute();

        TestUtil.verboseCompare(expected, actual);

    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatResultWithConfigUToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("-u");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
        CatResult expected = CatResult.of(output);

        CatResult actual = Cat.of(input).u().execute();

        TestUtil.verboseCompare(expected, actual);

    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatResultWithConfigShowEndsToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-ends");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
        CatResult expected = CatResult.of(output);

        CatResult actual = Cat.of(input).showEnds().execute();

        TestUtil.verboseCompare(expected, actual);

    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatResultWithConfigNumberNonblankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number-nonblank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
        CatResult expected = CatResult.of(output);

        CatResult actual = Cat.of(input).numberNonblank().execute();

        TestUtil.verboseCompare(expected, actual);

    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatResultWithConfigShowNonprintingAndShowTabsToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-nonprinting --show-tabs");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
        CatResult expected = CatResult.of(output);

        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();

        TestUtil.verboseCompare(expected, actual);

    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatResultWithConfigNumberToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
        CatResult expected = CatResult.of(output);

        CatResult actual = Cat.of(input).number().execute();

        TestUtil.verboseCompare(expected, actual);

    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatResultWithConfigSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
        CatResult expected = CatResult.of(output);

        CatResult actual = Cat.of(input).squeezeBlank().execute();

        TestUtil.verboseCompare(expected, actual);

    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatResultWithConfigNumberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number --number-nonblank --show-ends --show-nonprinting --show-tabs --squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
        CatResult expected = CatResult.of(output);

        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();

        TestUtil.verboseCompare(expected, actual);

    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatResultWithConfigNumberAndSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number --squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
        CatResult expected = CatResult.of(output);

        CatResult actual = Cat.of(input).number().squeezeBlank().execute();

        TestUtil.verboseCompare(expected, actual);

    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatResultWithConfigNumberNonblankAndShowNonprintingToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number-nonblank --show-nonprinting");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
        CatResult expected = CatResult.of(output);

        CatResult actual = Cat.of(input).numberNonblank().showNonprinting().execute();

        TestUtil.verboseCompare(expected, actual);

    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatResultWithConfigNumberAndNumberNonblankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number --number-nonblank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
        CatResult expected = CatResult.of(output);

        CatResult actual = Cat.of(input).number().numberNonblank().execute();

        TestUtil.verboseCompare(expected, actual);

    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatResultWithConfigShowEndsAndSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-ends --squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
        CatResult expected = CatResult.of(output);

        CatResult actual = Cat.of(input).showEnds().squeezeBlank().execute();

        TestUtil.verboseCompare(expected, actual);

    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatResultWithConfigNumberNonblankAndSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number-nonblank --squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
        CatResult expected = CatResult.of(output);

        CatResult actual = Cat.of(input).numberNonblank().squeezeBlank().execute();

        TestUtil.verboseCompare(expected, actual);

    }



}
