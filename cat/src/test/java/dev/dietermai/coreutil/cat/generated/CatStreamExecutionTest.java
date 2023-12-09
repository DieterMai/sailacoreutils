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
class CatStreamExecutionTest {

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStreamWithConfigDefaulttToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Stream<String> expected = TestUtil.toLineStream(output);

        Stream<String> actual = Cat.of(input).stream();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStreamWithConfigShowTabsAndSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-tabs --squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Stream<String> expected = TestUtil.toLineStream(output);

        Stream<String> actual = Cat.of(input).showTabs().squeezeBlank().stream();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStreamWithConfigNumberNonblankAndShowTabsToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number-nonblank --show-tabs");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Stream<String> expected = TestUtil.toLineStream(output);

        Stream<String> actual = Cat.of(input).numberNonblank().showTabs().stream();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStreamWithConfigNumberNonblankAndShowEndsToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number-nonblank --show-ends");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Stream<String> expected = TestUtil.toLineStream(output);

        Stream<String> actual = Cat.of(input).numberNonblank().showEnds().stream();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStreamWithConfigShowNonprintingToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-nonprinting");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Stream<String> expected = TestUtil.toLineStream(output);

        Stream<String> actual = Cat.of(input).showNonprinting().stream();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStreamWithConfigShowTabsToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-tabs");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Stream<String> expected = TestUtil.toLineStream(output);

        Stream<String> actual = Cat.of(input).showTabs().stream();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStreamWithConfigShowEndsAndShowNonprintingToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-ends --show-nonprinting");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Stream<String> expected = TestUtil.toLineStream(output);

        Stream<String> actual = Cat.of(input).showEnds().showNonprinting().stream();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStreamWithConfigShowNonprintingAndSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-nonprinting --squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Stream<String> expected = TestUtil.toLineStream(output);

        Stream<String> actual = Cat.of(input).showNonprinting().squeezeBlank().stream();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStreamWithConfigShowEndsAndShowNonprintingAndShowTabsToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-ends --show-nonprinting --show-tabs");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Stream<String> expected = TestUtil.toLineStream(output);

        Stream<String> actual = Cat.of(input).showEnds().showNonprinting().showTabs().stream();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStreamWithConfigUToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("-u");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Stream<String> expected = TestUtil.toLineStream(output);

        Stream<String> actual = Cat.of(input).u().stream();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStreamWithConfigShowEndsToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-ends");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Stream<String> expected = TestUtil.toLineStream(output);

        Stream<String> actual = Cat.of(input).showEnds().stream();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStreamWithConfigNumberNonblankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number-nonblank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Stream<String> expected = TestUtil.toLineStream(output);

        Stream<String> actual = Cat.of(input).numberNonblank().stream();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStreamWithConfigShowNonprintingAndShowTabsToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-nonprinting --show-tabs");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Stream<String> expected = TestUtil.toLineStream(output);

        Stream<String> actual = Cat.of(input).showNonprinting().showTabs().stream();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStreamWithConfigNumberToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Stream<String> expected = TestUtil.toLineStream(output);

        Stream<String> actual = Cat.of(input).number().stream();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStreamWithConfigSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Stream<String> expected = TestUtil.toLineStream(output);

        Stream<String> actual = Cat.of(input).squeezeBlank().stream();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStreamWithConfigNumberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number --number-nonblank --show-ends --show-nonprinting --show-tabs --squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Stream<String> expected = TestUtil.toLineStream(output);

        Stream<String> actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().stream();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStreamWithConfigNumberAndSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number --squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Stream<String> expected = TestUtil.toLineStream(output);

        Stream<String> actual = Cat.of(input).number().squeezeBlank().stream();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStreamWithConfigNumberNonblankAndShowNonprintingToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number-nonblank --show-nonprinting");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Stream<String> expected = TestUtil.toLineStream(output);

        Stream<String> actual = Cat.of(input).numberNonblank().showNonprinting().stream();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStreamWithConfigNumberAndNumberNonblankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number --number-nonblank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Stream<String> expected = TestUtil.toLineStream(output);

        Stream<String> actual = Cat.of(input).number().numberNonblank().stream();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStreamWithConfigShowEndsAndSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-ends --squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Stream<String> expected = TestUtil.toLineStream(output);

        Stream<String> actual = Cat.of(input).showEnds().squeezeBlank().stream();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatStreamWithConfigNumberNonblankAndSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number-nonblank --squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Stream<String> expected = TestUtil.toLineStream(output);

        Stream<String> actual = Cat.of(input).numberNonblank().squeezeBlank().stream();

        TestUtil.verboseCompare(expected, actual);
    }



}
