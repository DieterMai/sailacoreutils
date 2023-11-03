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
	 * Verifies that the The of() method produces a {@link CatRecord} with no flags enabled.
	 */
	@Test
	void testRecordOfFile() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The A() method produces a {@link CatRecord} with showAll enabled.
	 */
	@Test
	void testRecordOfA() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = true;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = true;
		boolean showNonprinting = true;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).A().get();
		
		assertEquals(expected, actual);
	}

	/**
	 * Verifies that the The showAll() method produces a {@link CatRecord} with showAll enabled.
	 */
	@Test
	void testRecordOfShowAll() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = true;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = true;
		boolean showNonprinting = true;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).showAll().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The b() method produces a {@link CatRecord} with numberNoneblank enabled.
	 */
	@Test
	void testRecordOfb() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = true;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).b().get();
		
		assertEquals(expected, actual);
	}

	/**
	 * Verifies that the The numberNoneblank() method produces a {@link CatRecord} with numberNoneblank enabled.
	 */
	@Test
	void testRecordOfNumberNonblank() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = true;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).numberNonblank().get();
		
		assertEquals(expected, actual);
	}

	/**
	 * Verifies that the The e() method produces a {@link CatRecord} with showEnds and showNonprinting enabled.
	 */
	@Test
	void testRecordOf_e() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = true;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = true;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).e().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The E() method produces a {@link CatRecord} with showEnds enabled.
	 */
	@Test
	void testRecordOfE() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = true;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).E().get();
		
		assertEquals(expected, actual);
	}

	/**
	 * Verifies that the The showEnds() method produces a {@link CatRecord} with showEnds enabled.
	 */
	@Test
	void testRecordOfShowEnds() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = true;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).showEnds().get();
		
		assertEquals(expected, actual);
	}
	
	
	/**
	 * Verifies that the The n() method produces a {@link CatRecord} with number enabled.
	 */
	@Test
	void testRecordOf_n() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = true;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).n().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The number() method produces a {@link CatRecord} with number enabled.
	 */
	@Test
	void testRecordOfNumber() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = true;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).number().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The s() method produces a {@link CatRecord} with squeezeBlank enabled.
	 */
	@Test
	void testRecordOf_s() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = true;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).s().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The squeezeBlank() method produces a {@link CatRecord} with squeezeBlank enabled.
	 */
	@Test
	void testRecordOfSqueezeBlank() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = true;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).squeezeBlank().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The t() method produces a {@link CatRecord} with showTabs and showNonprinting enabled.
	 */
	@Test
	void testRecordOf_t() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = true;
		boolean showNonprinting = true;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).t().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The T() method produces a {@link CatRecord} with showTabs enabled.
	 */
	@Test
	void testRecordOf_T() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = true;
		boolean showNonprinting = false;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).T().get();
		
		assertEquals(expected, actual);
	}

	/**
	 * Verifies that the The showTabs() method produces a {@link CatRecord} with showTabs enabled.
	 */
	@Test
	void testRecordOfShowTabs() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = true;
		boolean showNonprinting = false;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).showTabs().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The u() method produces a {@link CatRecord} with no flags enabled.
	 */
	@Test
	void testRecordOf_u() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).u().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The v() method produces a {@link CatRecord} with showNonprinting enabled.
	 */
	@Test
	void testRecordOf_v() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = true;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).v().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The showNonprinting() method produces a {@link CatRecord} with showNonprinting enabled.
	 */
	@Test
	void testRecordOfShowNonprinting() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = true;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).showNonprinting().get();
		
		assertEquals(expected, actual);
	}
}
