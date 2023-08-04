package dev.dietermai.coreutil.cat;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CatTest {

	@Test
	void testRecordOfFile() {
		String path = "foo";
		assertEquals(CatRecord.ofFile(path), Cat.of(path).get());
	}
	
	@Test
	void testRecordOfA() {
		String path = "foo";
		assertEquals(CatRecord.ofFile(path, false, true, false, false, true, true), Cat.of(path).A().get());
	}
	
	@Test
	void testRecordOfShowAll() {
		String path = "foo";
		assertEquals(CatRecord.ofFile(path, false, true, false, false, true, true), Cat.of(path).showAll().get());
	}
	
	@Test
	void testRecordOfb() {
		String path = "foo";
		assertEquals(CatRecord.ofFile(path, true, false, false, false, false, false), Cat.of(path).b().get());
	}

	@Test
	void testRecordOfNumberNonblank() {
		String path = "foo";
		assertEquals(CatRecord.ofFile(path, true, false, false, false, false, false), Cat.of(path).numberNoneblank().get());
	}

	@Test
	void testRecordOf_e() {
		String path = "foo";
		assertEquals(CatRecord.ofFile(path, false, true, false, false, false, true), Cat.of(path).e().get());
	}
	
	@Test
	void testRecordOfE() {
		String path = "foo";
		assertEquals(CatRecord.ofFile(path, false, true, false, false, false, false), Cat.of(path).E().get());
	}

	@Test
	void testRecordOfShowEnds() {
		String path = "foo";
		assertEquals(CatRecord.ofFile(path, false, true, false, false, false, false), Cat.of(path).showEnds().get());
	}
	
	
	@Test
	void testRecordOf_n() {
		String path = "foo";
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = true;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		CatRecord expected = CatRecord.ofFile(path, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(path).n().get();
		assertEquals(expected, actual);
	}
	
	@Test
	void testRecordOfNumber() {
		String path = "foo";
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = true;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		CatRecord expected = CatRecord.ofFile(path, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(path).number().get();
		assertEquals(expected, actual);
	}
	
	@Test
	void testRecordOf_s() {
		String path = "foo";
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = true;
		boolean showTabs = false;
		boolean showNonprinting = false;
		CatRecord expected = CatRecord.ofFile(path, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(path).s().get();
		assertEquals(expected, actual);
	}
	
	@Test
	void testRecordOfSqueezeBlank() {
		String path = "foo";
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = true;
		boolean showTabs = false;
		boolean showNonprinting = false;
		CatRecord expected = CatRecord.ofFile(path, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(path).squeezeBlank().get();
		assertEquals(expected, actual);
	}
	
	@Test
	void testRecordOf_t() {
		String path = "foo";
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = true;
		boolean showNonprinting = true;
		CatRecord expected = CatRecord.ofFile(path, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(path).t().get();
		assertEquals(expected, actual);
	}
	
	@Test
	void testRecordOf_T() {
		String path = "foo";
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = true;
		boolean showNonprinting = false;
		CatRecord expected = CatRecord.ofFile(path, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(path).T().get();
		assertEquals(expected, actual);
	}

	@Test
	void testRecordOfShowTabs() {
		String path = "foo";
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = true;
		boolean showNonprinting = false;
		CatRecord expected = CatRecord.ofFile(path, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(path).showTabs().get();
		assertEquals(expected, actual);
	}
	
	@Test
	void testRecordOf_u() {
		String path = "foo";
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = false;
		CatRecord expected = CatRecord.ofFile(path, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(path).u().get();
		assertEquals(expected, actual);
	}
	
	@Test
	void testRecordOf_v() {
		String path = "foo";
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = true;
		CatRecord expected = CatRecord.ofFile(path, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(path).v().get();
		assertEquals(expected, actual);
	}
	
	@Test
	void testRecordOfShowNonprinting() {
		String path = "foo";
		boolean numberNonblank = false;
		boolean showEnds = false;
		boolean number = false;
		boolean squeezeBlank = false;
		boolean showTabs = false;
		boolean showNonprinting = true;
		CatRecord expected = CatRecord.ofFile(path, numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
		CatRecord actual = Cat.of(path).showNonprinting().get();
		assertEquals(expected, actual);
	}
}
