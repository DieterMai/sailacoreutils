package dev.dietermai.coreutil.cat;

import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicContainer;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.ThrowingConsumer;

import dev.dietermai.coreutil.cat.testutil.ConfigOptionMethodMap;
import dev.dietermai.coreutil.testutil.ConfigCase;
import dev.dietermai.coreutil.testutil.InputCase;
import dev.dietermai.coreutil.testutil.InputFileProvider;
import dev.dietermai.coreutil.testutil.OutputFileProvider;
import dev.dietermai.coreutil.testutil.cat.CatConfigCases;
import dev.dietermai.coreutil.testutil.cat.CatInputCases;

@SuppressWarnings("unused")
class CatExecutorTest {
	/**
	 * The input of a test
	 */
    record TestPermutation(InputCase inputCase, ConfigCase catConfig) {
    }
    
    private List<DynamicContainer> createTestPermutations(ThrowingConsumer<TestPermutation> testImple){
    	List<ConfigCase> configs = CatConfigCases.get();
    	List<DynamicContainer> containers = new ArrayList<>();
    	
    	for(ConfigCase config: configs) {
    		containers.add(dynamicContainer("Config: "+config.Name(), createTestPermutations(testImple, config)));
    	}
    	
    	return containers;
    }
    
    private List<DynamicTest> createTestPermutations(ThrowingConsumer<TestPermutation> testImple, ConfigCase catConfig){
    	List<InputCase> inputs = CatInputCases.get();
    	
    	List<DynamicTest> tests = new ArrayList<>();
    	for(InputCase input : inputs) {
    		TestPermutation permutation = new TestPermutation(input, catConfig);
    		tests.add(DynamicTest.dynamicTest("Input: "+input.Name(), () -> testImple.accept(permutation)));
    	}
    	return tests;
    }
	
	
    @TestFactory
    List<DynamicContainer> testCatExecutorToStringWithSupplier(){
    	return createTestPermutations(this::executeCarExecutorToStringWithSupplierImple);
    }
    
    @TestFactory
    List<DynamicContainer> testCatExecutionIterator(){
    	return createTestPermutations(this::executeCarToIteratorWithSupplierImple);
    }
    
    @TestFactory
    List<DynamicContainer> testCatExecutionStream(){
    	return createTestPermutations(this::executeCarToStreamWithSupplierImple);
    }
    
    private void executeCarExecutorToStringWithSupplierImple(TestPermutation permutation) throws IOException {
    	// Prepare input
        String input = InputFileProvider.getTextFor(permutation.inputCase());
        CatBuilder builder = Cat.of();
        permutation.catConfig().options().forEach(o -> ConfigOptionMethodMap.get(o).apply(builder));

        // Fetch expected output
        String expected = OutputFileProvider.getTextFor(permutation.inputCase, permutation.catConfig());

        // Act
        String actual = CatExecuter.execute(builder.get(), input);

        // Assert
        TestUtil.verboseCompare(expected, actual);
    }
    
    private void executeCarToIteratorWithSupplierImple(TestPermutation permutation) throws IOException {
    	// Prepare input
        String input = InputFileProvider.getTextFor(permutation.inputCase());
        CatBuilder builder = Cat.of();
        permutation.catConfig().options().forEach(o -> ConfigOptionMethodMap.get(o).apply(builder));

        // Fetch expected output
        String rawOutput = OutputFileProvider.getTextFor(permutation.inputCase, permutation.catConfig());
        Iterator<String> expected = TestUtil.toLineIterator(rawOutput);
        
        // Act
        Iterator<String> actual = CatExecuter.iterator(builder.get(), input);

        // Assert
        TestUtil.verboseCompare(expected, actual);
    }
    
    
    private void executeCarToStreamWithSupplierImple(TestPermutation permutation) throws IOException {
    	// Prepare input
        String input = InputFileProvider.getTextFor(permutation.inputCase());
        CatBuilder builder = Cat.of();
        permutation.catConfig().options().forEach(o -> ConfigOptionMethodMap.get(o).apply(builder));

        // Fetch expected output
        String rawOutput = OutputFileProvider.getTextFor(permutation.inputCase, permutation.catConfig());
        Stream<String> expected = TestUtil.toLineStream(rawOutput);
        
        // Act
        Stream<String> actual = CatExecuter.stream(builder.get(), input);

        // Assert
        TestUtil.verboseCompare(expected, actual);
    }
}
