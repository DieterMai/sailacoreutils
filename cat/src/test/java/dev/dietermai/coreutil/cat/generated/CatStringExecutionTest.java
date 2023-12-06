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

class CatStringExecutionTest {

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStringWithConfigDefaulttToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        String expected = output;

        String actual = Cat.of(input).execute();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStringWithConfigShowTabsAndSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-tabs --squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        String expected = output;

        String actual = Cat.of(input).showTabs().squeezeBlank().execute();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStringWithConfigNumberNonblankAndShowTabsToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number-nonblank --show-tabs");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        String expected = output;

        String actual = Cat.of(input).numberNonblank().showTabs().execute();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStringWithConfigNumberNonblankAndShowEndsToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number-nonblank --show-ends");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        String expected = output;

        String actual = Cat.of(input).numberNonblank().showEnds().execute();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStringWithConfigShowNonprintingToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-nonprinting");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        String expected = output;

        String actual = Cat.of(input).showNonprinting().execute();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStringWithConfigShowTabsToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-tabs");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        String expected = output;

        String actual = Cat.of(input).showTabs().execute();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStringWithConfigShowEndsAndShowNonprintingToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-ends --show-nonprinting");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        String expected = output;

        String actual = Cat.of(input).showEnds().showNonprinting().execute();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStringWithConfigShowNonprintingAndSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-nonprinting --squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        String expected = output;

        String actual = Cat.of(input).showNonprinting().squeezeBlank().execute();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStringWithConfigShowEndsAndShowNonprintingAndShowTabsToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-ends --show-nonprinting --show-tabs");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        String expected = output;

        String actual = Cat.of(input).showEnds().showNonprinting().showTabs().execute();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStringWithConfigUToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("-u");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        String expected = output;

        String actual = Cat.of(input).u().execute();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStringWithConfigShowEndsToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-ends");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        String expected = output;

        String actual = Cat.of(input).showEnds().execute();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStringWithConfigNumberNonblankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number-nonblank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        String expected = output;

        String actual = Cat.of(input).numberNonblank().execute();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStringWithConfigShowNonprintingAndShowTabsToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-nonprinting --show-tabs");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        String expected = output;

        String actual = Cat.of(input).showNonprinting().showTabs().execute();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStringWithConfigNumberToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        String expected = output;

        String actual = Cat.of(input).number().execute();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStringWithConfigSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        String expected = output;

        String actual = Cat.of(input).squeezeBlank().execute();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStringWithConfigNumberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number --number-nonblank --show-ends --show-nonprinting --show-tabs --squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        String expected = output;

        String actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStringWithConfigNumberAndSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number --squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        String expected = output;

        String actual = Cat.of(input).number().squeezeBlank().execute();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStringWithConfigNumberNonblankAndShowNonprintingToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number-nonblank --show-nonprinting");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        String expected = output;

        String actual = Cat.of(input).numberNonblank().showNonprinting().execute();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStringWithConfigNumberAndNumberNonblankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number --number-nonblank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        String expected = output;

        String actual = Cat.of(input).number().numberNonblank().execute();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStringWithConfigShowEndsAndSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-ends --squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        String expected = output;

        String actual = Cat.of(input).showEnds().squeezeBlank().execute();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStringWithConfigNumberNonblankAndSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number-nonblank --squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        String expected = output;

        String actual = Cat.of(input).numberNonblank().squeezeBlank().execute();

        TestUtil.verboseCompare(expected, actual);
    }



}
