package dev.dietermai.coreutil.cat;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class CatTest {

	@Test
	void testRecordOfFile() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		assertEquals(CatRecord.ofFile(supplier), Cat.of(supplier).get());
	}
	
	@Test
	void testRecordOfA() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		assertEquals(CatRecord.ofFile(supplier, false, true, false, false, true, true), Cat.of(supplier).A().get());
	}
	
	@Test
	void testRecordOfShowAll() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		assertEquals(CatRecord.ofFile(supplier, false, true, false, false, true, true), Cat.of(supplier).showAll().get());
	}
	
	@Test
	void testRecordOfb() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		assertEquals(CatRecord.ofFile(supplier, true, false, false, false, false, false), Cat.of(supplier).b().get());
	}

	@Test
	void testRecordOfNumberNonblank() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		assertEquals(CatRecord.ofFile(supplier, true, false, false, false, false, false), Cat.of(supplier).numberNoneblank().get());
	}

	@Test
	void testRecordOf_e() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		assertEquals(CatRecord.ofFile(supplier, false, true, false, false, false, true), Cat.of(supplier).e().get());
	}
	
	@Test
	void testRecordOfE() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		assertEquals(CatRecord.ofFile(supplier, false, true, false, false, false, false), Cat.of(supplier).E().get());
	}

	@Test
	void testRecordOfShowEnds() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		assertEquals(CatRecord.ofFile(supplier, false, true, false, false, false, false), Cat.of(supplier).showEnds().get());
	}
	
	
	@Test
	void testRecordOf_n() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = true;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		CatRecord expected = CatRecord.ofFile(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).n().get();
		assertEquals(expected, actual);
	}
	
	@Test
	void testRecordOfNumber() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = true;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		CatRecord expected = CatRecord.ofFile(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).number().get();
		assertEquals(expected, actual);
	}
	
	@Test
	void testRecordOf_s() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = true;
		boolean showTabs = false;
		boolean showNonprinting = false;
		CatRecord expected = CatRecord.ofFile(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).s().get();
		assertEquals(expected, actual);
	}
	
	@Test
	void testRecordOfSqueezeBlank() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = true;
		boolean showTabs = false;
		boolean showNonprinting = false;
		CatRecord expected = CatRecord.ofFile(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).squeezeBlank().get();
		assertEquals(expected, actual);
	}
	
	@Test
	void testRecordOf_t() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = true;
		boolean showNonprinting = true;
		CatRecord expected = CatRecord.ofFile(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).t().get();
		assertEquals(expected, actual);
	}
	
	@Test
	void testRecordOf_T() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = true;
		boolean showNonprinting = false;
		CatRecord expected = CatRecord.ofFile(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).T().get();
		assertEquals(expected, actual);
	}

	@Test
	void testRecordOfShowTabs() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = true;
		boolean showNonprinting = false;
		CatRecord expected = CatRecord.ofFile(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).showTabs().get();
		assertEquals(expected, actual);
	}
	
	@Test
	void testRecordOf_u() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		CatRecord expected = CatRecord.ofFile(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).u().get();
		assertEquals(expected, actual);
	}
	
	@Test
	void testRecordOf_v() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = true;
		CatRecord expected = CatRecord.ofFile(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).v().get();
		assertEquals(expected, actual);
	}
	
	@Test
	void testRecordOfShowNonprinting() {
		LineSupplier supplier = TextLineSupplier.of("foo");
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = true;
		CatRecord expected = CatRecord.ofFile(supplier, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(supplier).showNonprinting().get();
		assertEquals(expected, actual);
	}
	

	@Test
	void testOutputOfTextDefault() {
		String text = """
				This is a simple text
				second line
				
				
				
				6th line""";
		LineSupplier supplier = new TextLineSupplier(text);
		
		CatResult actual = Cat.of(supplier).showNonprinting().execute();
		
		List<String> exptectedOut = List.of("This is a simple text\n", "second line\n", "\n", "\n", "\n", "6th line");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	
	
	
}
