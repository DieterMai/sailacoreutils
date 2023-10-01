package dev.dietermai.coreutil.cat;

import java.util.List;

import org.junit.jupiter.api.Test;

class SimpleLineCatTest_backup {
	
	private static final String INPUT = "A Simple Line";


	@Test
	void testDefaultConfig() {
		LineSupplier supplier = new TextLineSupplier(INPUT);
		
		CatResult actual = Cat.of(supplier).execute();
		
		List<String> exptectedOut = List.of("A Simple Line");
		CatResult expected = CatResult.of(exptectedOut);
		TestUtil.verboseCompare(expected, actual);
	}
	
	@Test
	void testShowAllConfig() {
		LineSupplier supplier = new TextLineSupplier(INPUT);
		
		CatResult actual = Cat.of(supplier).showAll().execute();
		
		List<String> exptectedOut = List.of("A Simple Line");
		CatResult expected = CatResult.of(exptectedOut);
		TestUtil.verboseCompare(expected, actual);
	}
	
	@Test
	void testNumberNonblankConfig() {
		LineSupplier supplier = new TextLineSupplier(INPUT);
		
		CatResult actual = Cat.of(supplier).numberNonblank().execute();
		
		List<String> exptectedOut = List.of("     1	A Simple Line");
		CatResult expected = CatResult.of(exptectedOut);
		TestUtil.verboseCompare(expected, actual);
	}
	
	@Test
	void testShowEndsConfig() {
		LineSupplier supplier = new TextLineSupplier(INPUT);
		
		CatResult actual = Cat.of(supplier).showEnds().execute();
		
		List<String> exptectedOut = List.of("A Simple Line");
		CatResult expected = CatResult.of(exptectedOut);
		TestUtil.verboseCompare(expected, actual);
	}
	
	@Test
	void testNumberConfig() {
		LineSupplier supplier = new TextLineSupplier(INPUT);
		
		CatResult actual = Cat.of(supplier).number().execute();
		
		List<String> exptectedOut = List.of("     1	A Simple Line");
		CatResult expected = CatResult.of(exptectedOut);
		TestUtil.verboseCompare(expected, actual);
	}
	
	@Test
	void testSqueezeBlankConfig() {
		LineSupplier supplier = new TextLineSupplier(INPUT);
		
		CatResult actual = Cat.of(supplier).squeezeBlank().execute();
		
		List<String> exptectedOut = List.of("A Simple Line");
		CatResult expected = CatResult.of(exptectedOut);
		TestUtil.verboseCompare(expected, actual);
	}
	
	@Test
	void testShowTabsConfig() {
		LineSupplier supplier = new TextLineSupplier(INPUT);
		
		CatResult actual = Cat.of(supplier).showTabs().execute();
		
		List<String> exptectedOut = List.of("A Simple Line");
		CatResult expected = CatResult.of(exptectedOut);
		TestUtil.verboseCompare(expected, actual);
	}
	
	@Test
	void testShowNonprintingConfig() {
		LineSupplier supplier = new TextLineSupplier(INPUT);
		
		CatResult actual = Cat.of(supplier).showNonprinting().execute();
		
		List<String> exptectedOut = List.of("A Simple Line");
		CatResult expected = CatResult.of(exptectedOut);
		TestUtil.verboseCompare(expected, actual);
	}
	
	

}
