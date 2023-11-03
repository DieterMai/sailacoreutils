package dev.dietermai.coreutil.cat;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dev.dietermai.coreutil.cat.charsupplier.StringCharSupplier;

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
		StringCharSupplier supplier = StringCharSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of("foo").get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The A() method produces a {@link CatRecord} with showAll enabled.
	 */
	@Test
	void testRecordOfA() {
		StringCharSupplier supplier = StringCharSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = true;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = true;
		boolean showNonprinting = true;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of("foo").A().get();
		
		assertEquals(expected, actual);
	}

	/**
	 * Verifies that the The showAll() method produces a {@link CatRecord} with showAll enabled.
	 */
	@Test
	void testRecordOfShowAll() {
		StringCharSupplier supplier = StringCharSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = true;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = true;
		boolean showNonprinting = true;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of("foo").showAll().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The b() method produces a {@link CatRecord} with numberNoneblank enabled.
	 */
	@Test
	void testRecordOfb() {
		StringCharSupplier supplier = StringCharSupplier.of("foo");
		boolean numberNonblank = true;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of("foo").b().get();
		
		assertEquals(expected, actual);
	}

	/**
	 * Verifies that the The numberNoneblank() method produces a {@link CatRecord} with numberNoneblank enabled.
	 */
	@Test
	void testRecordOfNumberNonblank() {
		StringCharSupplier supplier = StringCharSupplier.of("foo");
		boolean numberNonblank = true;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of("foo").numberNonblank().get();
		
		assertEquals(expected, actual);
	}

	/**
	 * Verifies that the The e() method produces a {@link CatRecord} with showEnds and showNonprinting enabled.
	 */
	@Test
	void testRecordOf_e() {
		StringCharSupplier supplier = StringCharSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = true;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = true;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of("foo").e().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The E() method produces a {@link CatRecord} with showEnds enabled.
	 */
	@Test
	void testRecordOfE() {
		StringCharSupplier supplier = StringCharSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = true;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of("foo").E().get();
		
		assertEquals(expected, actual);
	}

	/**
	 * Verifies that the The showEnds() method produces a {@link CatRecord} with showEnds enabled.
	 */
	@Test
	void testRecordOfShowEnds() {
		StringCharSupplier supplier = StringCharSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = true;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of("foo").showEnds().get();
		
		assertEquals(expected, actual);
	}
	
	
	/**
	 * Verifies that the The n() method produces a {@link CatRecord} with number enabled.
	 */
	@Test
	void testRecordOf_n() {
		StringCharSupplier supplier = StringCharSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = true;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of("foo").n().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The number() method produces a {@link CatRecord} with number enabled.
	 */
	@Test
	void testRecordOfNumber() {
		StringCharSupplier supplier = StringCharSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = true;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of("foo").number().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The s() method produces a {@link CatRecord} with squeezeBlank enabled.
	 */
	@Test
	void testRecordOf_s() {
		StringCharSupplier supplier = StringCharSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = true;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of("foo").s().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The squeezeBlank() method produces a {@link CatRecord} with squeezeBlank enabled.
	 */
	@Test
	void testRecordOfSqueezeBlank() {
		StringCharSupplier supplier = StringCharSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = true;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of("foo").squeezeBlank().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The t() method produces a {@link CatRecord} with showTabs and showNonprinting enabled.
	 */
	@Test
	void testRecordOf_t() {
		StringCharSupplier supplier = StringCharSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = true;
		boolean showNonprinting = true;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of("foo").t().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The T() method produces a {@link CatRecord} with showTabs enabled.
	 */
	@Test
	void testRecordOf_T() {
		StringCharSupplier supplier = StringCharSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = true;
		boolean showNonprinting = false;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of("foo").T().get();
		
		assertEquals(expected, actual);
	}

	/**
	 * Verifies that the The showTabs() method produces a {@link CatRecord} with showTabs enabled.
	 */
	@Test
	void testRecordOfShowTabs() {
		StringCharSupplier supplier = StringCharSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = true;
		boolean showNonprinting = false;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of("foo").showTabs().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The u() method produces a {@link CatRecord} with no flags enabled.
	 */
	@Test
	void testRecordOf_u() {
		StringCharSupplier supplier = StringCharSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of("foo").u().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The v() method produces a {@link CatRecord} with showNonprinting enabled.
	 */
	@Test
	void testRecordOf_v() {
		StringCharSupplier supplier = StringCharSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = true;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of("foo").v().get();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Verifies that the The showNonprinting() method produces a {@link CatRecord} with showNonprinting enabled.
	 */
	@Test
	void testRecordOfShowNonprinting() {
		StringCharSupplier supplier = StringCharSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = true;
		
		CatRecord expected = CatRecord.of(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of("foo").showNonprinting().get();
		
		assertEquals(expected, actual);
	}
}
