package dev.dietermai.coreutil.cat.generated;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

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

class CatIteratorExecutionTest {
	
//    @ParameterizedTest
//    @ArgumentsSource(InputArgumentProvider.class)
//    void testCatResultWithConfigDefaulttToIterator(InputCase inputCase) throws IOException {
//        final ConfigCase CONFIG = ConfigCases.get().get("");
//
//        String input = InputFileProvider.getTextFor(inputCase);
//        String output = OutputFileProvider.getTextFor(inputCase, CONFIG);
//        Iterator<String> expected = TestUtil.toLineIterator(output);
//        
//        
//        Iterator<String> actual = Cat.of(input).iterator();
//        
//        
//        TestUtil.verboseCompare(expected, actual);
//    }
}
