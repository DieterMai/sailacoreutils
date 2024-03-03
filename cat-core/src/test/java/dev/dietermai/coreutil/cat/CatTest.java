package dev.dietermai.coreutil.cat;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CatTest {
	String textZeroInMidst = """
			This is a simple text
			second l\0ine
			
			
			
			6th line
			""";
	

	/**
	 * Verifies that the The of() method produces a {@link CatConfig} with no flags enabled.
	 */
	@Test
	void testRecordOfFile() {
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatConfig expected = CatConfig.of(numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatConfig actual = Cat.of().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The A() method produces a {@link CatConfig} with showAll enabled.
	 */
	@Test
	void testRecordOfA() {
		boolean numberNonblank = false;
		boolean showEnds = true;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = true;
		boolean showNonprinting = true;
		
		CatConfig expected = CatConfig.of(numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatConfig actual = Cat.of().A().get();
		
		assertEquals(expected, actual);
	}

	/**
	 * Verifies that the The showAll() method produces a {@link CatConfig} with showAll enabled.
	 */
	@Test
	void testRecordOfShowAll() {
		boolean numberNonblank = false;
		boolean showEnds = true;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = true;
		boolean showNonprinting = true;
		
		CatConfig expected = CatConfig.of(numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatConfig actual = Cat.of().showAll().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The b() method produces a {@link CatConfig} with numberNoneblank enabled.
	 */
	@Test
	void testRecordOfb() {
		boolean numberNonblank = true;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatConfig expected = CatConfig.of(numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatConfig actual = Cat.of().b().get();
		
		assertEquals(expected, actual);
	}

	/**
	 * Verifies that the The numberNoneblank() method produces a {@link CatConfig} with numberNoneblank enabled.
	 */
	@Test
	void testRecordOfNumberNonblank() {
		boolean numberNonblank = true;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatConfig expected = CatConfig.of(numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatConfig actual = Cat.of().numberNonblank().get();
		
		assertEquals(expected, actual);
	}

	/**
	 * Verifies that the The e() method produces a {@link CatConfig} with showEnds and showNonprinting enabled.
	 */
	@Test
	void testRecordOf_e() {
		boolean numberNonblank = false;
		boolean showEnds = true;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = true;
		
		CatConfig expected = CatConfig.of(numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatConfig actual = Cat.of().e().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The E() method produces a {@link CatConfig} with showEnds enabled.
	 */
	@Test
	void testRecordOfE() {
		boolean numberNonblank = false;
		boolean showEnds = true;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatConfig expected = CatConfig.of(numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatConfig actual = Cat.of().E().get();
		
		assertEquals(expected, actual);
	}

	/**
	 * Verifies that the The showEnds() method produces a {@link CatConfig} with showEnds enabled.
	 */
	@Test
	void testRecordOfShowEnds() {
		boolean numberNonblank = false;
		boolean showEnds = true;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatConfig expected = CatConfig.of(numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatConfig actual = Cat.of().showEnds().get();
		
		assertEquals(expected, actual);
	}
	
	
	/**
	 * Verifies that the The n() method produces a {@link CatConfig} with number enabled.
	 */
	@Test
	void testRecordOf_n() {
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = true;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatConfig expected = CatConfig.of(numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatConfig actual = Cat.of().n().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The number() method produces a {@link CatConfig} with number enabled.
	 */
	@Test
	void testRecordOfNumber() {
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = true;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatConfig expected = CatConfig.of(numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatConfig actual = Cat.of().number().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The s() method produces a {@link CatConfig} with squeezeBlank enabled.
	 */
	@Test
	void testRecordOf_s() {
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = true;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatConfig expected = CatConfig.of(numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatConfig actual = Cat.of().s().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The squeezeBlank() method produces a {@link CatConfig} with squeezeBlank enabled.
	 */
	@Test
	void testRecordOfSqueezeBlank() {
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = true;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatConfig expected = CatConfig.of(numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatConfig actual = Cat.of().squeezeBlank().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The t() method produces a {@link CatConfig} with showTabs and showNonprinting enabled.
	 */
	@Test
	void testRecordOf_t() {
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = true;
		boolean showNonprinting = true;
		
		CatConfig expected = CatConfig.of(numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatConfig actual = Cat.of().t().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The T() method produces a {@link CatConfig} with showTabs enabled.
	 */
	@Test
	void testRecordOf_T() {
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = true;
		boolean showNonprinting = false;
		
		CatConfig expected = CatConfig.of(numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatConfig actual = Cat.of().T().get();
		
		assertEquals(expected, actual);
	}

	/**
	 * Verifies that the The showTabs() method produces a {@link CatConfig} with showTabs enabled.
	 */
	@Test
	void testRecordOfShowTabs() {
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = true;
		boolean showNonprinting = false;
		
		CatConfig expected = CatConfig.of(numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatConfig actual = Cat.of().showTabs().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The u() method produces a {@link CatConfig} with no flags enabled.
	 */
	@Test
	void testRecordOf_u() {
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatConfig expected = CatConfig.of(numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatConfig actual = Cat.of().u().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The v() method produces a {@link CatConfig} with showNonprinting enabled.
	 */
	@Test
	void testRecordOf_v() {
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = true;
		
		CatConfig expected = CatConfig.of(numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatConfig actual = Cat.of().v().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The showNonprinting() method produces a {@link CatConfig} with showNonprinting enabled.
	 */
	@Test
	void testRecordOfShowNonprinting() {
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = true;
		
		CatConfig expected = CatConfig.of(numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatConfig actual = Cat.of().showNonprinting().get();
		
		assertEquals(expected, actual);
	}
}
