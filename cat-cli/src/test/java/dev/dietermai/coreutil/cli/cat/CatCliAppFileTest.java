package dev.dietermai.coreutil.cli.cat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicContainer;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.ThrowingConsumer;

import dev.dietermai.coreutil.cli.test.TestCatContext;
import dev.dietermai.coreutil.testutil.ConfigCase;
import dev.dietermai.coreutil.testutil.InputCase;
import dev.dietermai.coreutil.testutil.InputFileProvider;
import dev.dietermai.coreutil.testutil.OutputFileProvider;
import dev.dietermai.coreutil.testutil.cat.CatConfigCases;
import dev.dietermai.coreutil.testutil.cat.CatInputCases;

class CatCliAppFileTest {
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
    List<DynamicContainer> test_File() {
    	return createTestPermutations(this::executeTest);
	}
	
	private void executeTest(TestPermutation permutation) throws IOException {
		String INPUT = InputFileProvider.getTextFor(permutation.inputCase());
		String EXPECTED_OUTPUT = OutputFileProvider.getTextFor(permutation.inputCase(), permutation.catConfig());
		String FILE_A = permutation.inputCase().Name();
		String[] OPERANDS = {FILE_A};
		String[] OPERATORS = permutation.catConfig.asArray();
		String[] ARGUMENTS = Stream.concat(Arrays.stream(OPERANDS), Arrays.stream(OPERATORS)).toArray(String[]::new);
		
		
		// arrange
		TestCatContext context = new TestCatContext();
		context.addFileCharSupplier(FILE_A, INPUT);
		CatCliApp app = new CatCliApp(ARGUMENTS, context);
		
		// act
		app.start();
		
		// assert
		assertPrintedText(EXPECTED_OUTPUT, context);
	}
	
	private void assertPrintedText(String expected, TestCatContext context) {
		assertEquals(expected, context.getPrinter().getContent());
	}
}
