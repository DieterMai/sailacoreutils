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
class CatIteratorExecutionTest {

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatIteratorWithConfigDefaulttToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Iterator<String> expected = TestUtil.toLineIterator(output);

        Iterator<String> actual = Cat.of(input).iterator();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatIteratorWithConfigShowTabsAndSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-tabs --squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Iterator<String> expected = TestUtil.toLineIterator(output);

        Iterator<String> actual = Cat.of(input).showTabs().squeezeBlank().iterator();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatIteratorWithConfigNumberNonblankAndShowTabsToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number-nonblank --show-tabs");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Iterator<String> expected = TestUtil.toLineIterator(output);

        Iterator<String> actual = Cat.of(input).numberNonblank().showTabs().iterator();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatIteratorWithConfigNumberNonblankAndShowEndsToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number-nonblank --show-ends");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Iterator<String> expected = TestUtil.toLineIterator(output);

        Iterator<String> actual = Cat.of(input).numberNonblank().showEnds().iterator();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatIteratorWithConfigShowNonprintingToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-nonprinting");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Iterator<String> expected = TestUtil.toLineIterator(output);

        Iterator<String> actual = Cat.of(input).showNonprinting().iterator();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatIteratorWithConfigShowTabsToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-tabs");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Iterator<String> expected = TestUtil.toLineIterator(output);

        Iterator<String> actual = Cat.of(input).showTabs().iterator();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatIteratorWithConfigShowEndsAndShowNonprintingToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-ends --show-nonprinting");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Iterator<String> expected = TestUtil.toLineIterator(output);

        Iterator<String> actual = Cat.of(input).showEnds().showNonprinting().iterator();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatIteratorWithConfigShowNonprintingAndSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-nonprinting --squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Iterator<String> expected = TestUtil.toLineIterator(output);

        Iterator<String> actual = Cat.of(input).showNonprinting().squeezeBlank().iterator();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatIteratorWithConfigShowEndsAndShowNonprintingAndShowTabsToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-ends --show-nonprinting --show-tabs");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Iterator<String> expected = TestUtil.toLineIterator(output);

        Iterator<String> actual = Cat.of(input).showEnds().showNonprinting().showTabs().iterator();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatIteratorWithConfigUToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("-u");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Iterator<String> expected = TestUtil.toLineIterator(output);

        Iterator<String> actual = Cat.of(input).u().iterator();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatIteratorWithConfigShowEndsToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-ends");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Iterator<String> expected = TestUtil.toLineIterator(output);

        Iterator<String> actual = Cat.of(input).showEnds().iterator();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatIteratorWithConfigNumberNonblankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number-nonblank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Iterator<String> expected = TestUtil.toLineIterator(output);

        Iterator<String> actual = Cat.of(input).numberNonblank().iterator();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatIteratorWithConfigShowNonprintingAndShowTabsToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-nonprinting --show-tabs");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Iterator<String> expected = TestUtil.toLineIterator(output);

        Iterator<String> actual = Cat.of(input).showNonprinting().showTabs().iterator();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatIteratorWithConfigNumberToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Iterator<String> expected = TestUtil.toLineIterator(output);

        Iterator<String> actual = Cat.of(input).number().iterator();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatIteratorWithConfigSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Iterator<String> expected = TestUtil.toLineIterator(output);

        Iterator<String> actual = Cat.of(input).squeezeBlank().iterator();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatIteratorWithConfigNumberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number --number-nonblank --show-ends --show-nonprinting --show-tabs --squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Iterator<String> expected = TestUtil.toLineIterator(output);

        Iterator<String> actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().iterator();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatIteratorWithConfigNumberAndSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number --squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Iterator<String> expected = TestUtil.toLineIterator(output);

        Iterator<String> actual = Cat.of(input).number().squeezeBlank().iterator();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatIteratorWithConfigNumberNonblankAndShowNonprintingToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number-nonblank --show-nonprinting");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Iterator<String> expected = TestUtil.toLineIterator(output);

        Iterator<String> actual = Cat.of(input).numberNonblank().showNonprinting().iterator();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatIteratorWithConfigNumberAndNumberNonblankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number --number-nonblank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Iterator<String> expected = TestUtil.toLineIterator(output);

        Iterator<String> actual = Cat.of(input).number().numberNonblank().iterator();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatIteratorWithConfigShowEndsAndSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--show-ends --squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Iterator<String> expected = TestUtil.toLineIterator(output);

        Iterator<String> actual = Cat.of(input).showEnds().squeezeBlank().iterator();

        TestUtil.verboseCompare(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(InputArgumentProvider.class)
    void testCatIteratorWithConfigNumberNonblankAndSqueezeBlankToResult(InputCase inputCase) throws IOException {
        final ConfigCase CONFIG = ConfigCases.get().get("--number-nonblank --squeeze-blank");

        String input = InputFileProvider.getTextFor(inputCase);
        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);

        Iterator<String> expected = TestUtil.toLineIterator(output);

        Iterator<String> actual = Cat.of(input).numberNonblank().squeezeBlank().iterator();

        TestUtil.verboseCompare(expected, actual);
    }



}
