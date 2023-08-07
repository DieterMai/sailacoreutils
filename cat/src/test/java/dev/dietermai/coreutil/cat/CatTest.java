package dev.dietermai.coreutil.cat;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class CatTest {
	String textNoTrailingBlankLine = """
			This is a simple text
			second line
			
			
			
			6th line""";
	String textTrailingBlankLine = """
			This is a simple text
			second line
			
			
			
			6th line
			""";
	
	String textTrailingZeroLine = """
			This is a simple text
			second line
			
			
			
			6th line
			\0""";
	
	String textZeroInMidst = """
			This is a simple text
			second l\0ine
			
			
			
			6th line
			""";
	

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
	void testOutputOfTextDefaultNoTrailingBlankLine() {
		LineSupplier supplier = new TextLineSupplier(textNoTrailingBlankLine);
		
		CatResult actual = Cat.of(supplier).execute();
		
		List<String> exptectedOut = List.of("This is a simple text", "second line", "", "", "", "6th line");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	@Test
	void testOutputOfTextDefaultTailingBlankLine() {
		LineSupplier supplier = new TextLineSupplier(textTrailingBlankLine);
		
		CatResult actual = Cat.of(supplier).execute();
		
		List<String> exptectedOut = List.of("This is a simple text", "second line", "", "", "", "6th line", "");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	@Test
	void testOutputOfTextDefaultTrailingZeroEnding() {
		LineSupplier supplier = new TextLineSupplier(textTrailingZeroLine);
		
		CatResult actual = Cat.of(supplier).execute();
		
		List<String> exptectedOut = List.of("This is a simple text", "second line", "", "", "", "6th line", "");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	@Test
	void testOutputOfTextDefaultZeroInMidText() {
		LineSupplier supplier = new TextLineSupplier(textZeroInMidst);
		
		CatResult actual = Cat.of(supplier).execute();
		
		List<String> exptectedOut = List.of("This is a simple text", "second l");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	

	
	@Test
	void testOutputOfTextNumberNonblank() {
		LineSupplier supplier = new TextLineSupplier(textNoTrailingBlankLine);
		
		CatResult actual = Cat.of(supplier).numberNoneblank().execute();
		
		List<String> exptectedOut = List.of(
				"     1  This is a simple text", 
				"     2  second line", 
				"", 
				"", 
				"", 
				"     3  6th line");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	@Test
	void testOutputOfTextNumberNonblankNoTrailingBlankLine() {
		LineSupplier supplier = new TextLineSupplier(textNoTrailingBlankLine);
		
		CatResult actual = Cat.of(supplier).numberNoneblank().execute();
		
		List<String> exptectedOut = List.of(
				"     1  This is a simple text", 
				"     2  second line", 
				"", 
				"", 
				"", 
				"     3  6th line");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	@Test
	void testOutputOfTextNumberNonblankTailingBlankLine() {
		LineSupplier supplier = new TextLineSupplier(textTrailingBlankLine);
		
		CatResult actual = Cat.of(supplier).numberNoneblank().execute();
		
		List<String> exptectedOut = List.of(
				"     1  This is a simple text", 
				"     2  second line", 
				"", 
				"", 
				"", 
				"     3  6th line",
				"");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	@Test
	void testOutputOfTextNumberNonblankTrailingZeroEnding() {
		LineSupplier supplier = new TextLineSupplier(textTrailingZeroLine);
		
		CatResult actual = Cat.of(supplier).numberNoneblank().execute();
		
		List<String> exptectedOut = List.of(
				"     1  This is a simple text", 
				"     2  second line", 
				"", 
				"", 
				"", 
				"     3  6th line", 
				"");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	@Test
	void testOutputOfTextNumberNonblankZeroInMidText() {
		LineSupplier supplier = new TextLineSupplier(textZeroInMidst);
		
		CatResult actual = Cat.of(supplier).numberNoneblank().execute();
		
		List<String> exptectedOut = List.of(
				"     1  This is a simple text", 
				"     2  second l");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	
	
	@Test
	void testOutputOfTextShowEndsNoTrailingBlankLine() {
		LineSupplier supplier = new TextLineSupplier(textNoTrailingBlankLine);
		
		CatResult actual = Cat.of(supplier).showEnds().execute();
		
		List<String> exptectedOut = List.of("This is a simple text$", "second line$", "$", "$", "$", "6th line");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	@Test
	void testOutputOfTextShowEndsTailingBlankLine() {
		LineSupplier supplier = new TextLineSupplier(textTrailingBlankLine);
		
		CatResult actual = Cat.of(supplier).showEnds().execute();
		
		List<String> exptectedOut = List.of("This is a simple text$", "second line$", "$", "$", "$", "6th line$", "");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	@Test
	void testOutputOfTextShowEndsTrailingZeroEnding() {
		LineSupplier supplier = new TextLineSupplier(textTrailingZeroLine);
		
		CatResult actual = Cat.of(supplier).showEnds().execute();
		
		List<String> exptectedOut = List.of("This is a simple text$", "second line$", "$", "$", "$", "6th line$", "");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	@Test
	void testOutputOfTextShowEndsZeroInMidText() {
		LineSupplier supplier = new TextLineSupplier(textZeroInMidst);
		
		CatResult actual = Cat.of(supplier).showEnds().execute();
		
		List<String> exptectedOut = List.of("This is a simple text$", "second l");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	
	@Test
	void testOutputOfTextShowEndsNoTrailingBlankLineWindowsEndings() {
		LineSupplier supplier = new TextLineSupplier(textNoTrailingBlankLine.replaceAll("\n", "\r\n"));
		
		CatResult actual = Cat.of(supplier).showEnds().execute();
		
		List<String> exptectedOut = List.of("This is a simple text^M$", "second line^M$", "^M$", "^M$", "^M$", "6th line");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	@Test
	void testOutputOfTextShowEndsTailingBlankLineWindowsEndings() {
		LineSupplier supplier = new TextLineSupplier(textTrailingBlankLine.replaceAll("\n", "\r\n"));
		
		CatResult actual = Cat.of(supplier).showEnds().execute();
		
		List<String> exptectedOut = List.of("This is a simple text^M$", "second line^M$", "^M$", "^M$", "^M$", "6th line^M$", "");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	@Test
	void testOutputOfTextShowEndsTrailingZeroEndingWindowsEndings() {
		LineSupplier supplier = new TextLineSupplier(textTrailingZeroLine.replaceAll("\n", "\r\n"));
		
		CatResult actual = Cat.of(supplier).showEnds().execute();
		
		List<String> exptectedOut = List.of("This is a simple text^M$", "second line^M$", "^M$", "^M$", "^M$", "6th line^M$", "");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	@Test
	void testOutputOfTextShowEndsZeroInMidTextWindowsEndings() {
		LineSupplier supplier = new TextLineSupplier(textZeroInMidst.replaceAll("\n", "\r\n"));
		
		CatResult actual = Cat.of(supplier).showEnds().execute();
		
		List<String> exptectedOut = List.of("This is a simple text^M$", "second l");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	
	
	@Test
	void testOutputOfTextNumber() {
		LineSupplier supplier = new TextLineSupplier(textNoTrailingBlankLine);
		
		CatResult actual = Cat.of(supplier).number().execute();
		
		List<String> exptectedOut = List.of(
				"     1  This is a simple text", 
				"     2  second line", 
				"     3  ", 
				"     4  ", 
				"     5  ", 
				"     6  6th line");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	@Test
	void testOutputOfTextNumberNoTrailingBlankLine() {
		LineSupplier supplier = new TextLineSupplier(textNoTrailingBlankLine);
		
		CatResult actual = Cat.of(supplier).number().execute();
		
		List<String> exptectedOut = List.of(
				"     1  This is a simple text", 
				"     2  second line", 
				"     3  ", 
				"     4  ", 
				"     5  ", 
				"     6  6th line");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	@Test
	void testOutputOfTextNumberTailingBlankLine() {
		LineSupplier supplier = new TextLineSupplier(textTrailingBlankLine);
		
		CatResult actual = Cat.of(supplier).number().execute();
		
		List<String> exptectedOut = List.of(
				"     1  This is a simple text", 
				"     2  second line", 
				"     3  ", 
				"     4  ", 
				"     5  ", 
				"     6  6th line",
				"");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	@Test
	void testOutputOfTextNumberTrailingZeroEnding() {
		LineSupplier supplier = new TextLineSupplier(textTrailingZeroLine);
		
		CatResult actual = Cat.of(supplier).number().execute();
		
		List<String> exptectedOut = List.of(
				"     1  This is a simple text", 
				"     2  second line", 
				"     3  ", 
				"     4  ", 
				"     5  ", 
				"     6  6th line", 
				"     7  ");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	@Test
	void testOutputOfTextNumberZeroInMidText() {
		LineSupplier supplier = new TextLineSupplier(textZeroInMidst);
		
		CatResult actual = Cat.of(supplier).number().execute();
		
		List<String> exptectedOut = List.of(
				"     1  This is a simple text", 
				"     2  second l");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	
	
	@Test
	void testOutputOfTextSqueezeBlankNoTrailingBlankLine() {
		LineSupplier supplier = new TextLineSupplier(textNoTrailingBlankLine);
		
		CatResult actual = Cat.of(supplier).squeezeBlank().execute();
		
		List<String> exptectedOut = List.of("This is a simple text", "second line", "", "6th line");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	@Test
	void testOutputOfTextSqueezeBlankTailingBlankLine() {
		LineSupplier supplier = new TextLineSupplier(textTrailingBlankLine);
		
		CatResult actual = Cat.of(supplier).squeezeBlank().execute();
		
		List<String> exptectedOut = List.of("This is a simple text", "second line", "", "6th line", "");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	@Test
	void testOutputOfTextSqueezeBlankTrailingZeroEnding() {
		LineSupplier supplier = new TextLineSupplier(textTrailingZeroLine);
		
		CatResult actual = Cat.of(supplier).squeezeBlank().execute();
		
		List<String> exptectedOut = List.of("This is a simple text", "second line", "", "6th line", "");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	@Test
	void testOutputOfTextSqueezeBlankZeroInMidText() {
		LineSupplier supplier = new TextLineSupplier(textZeroInMidst);
		
		CatResult actual = Cat.of(supplier).squeezeBlank().execute();
		
		List<String> exptectedOut = List.of("This is a simple text", "second l");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	
	
	@Test
	void testOutputOfTextNumberSqueezeBlankNoTrailingBlankLine() {
		LineSupplier supplier = new TextLineSupplier(textNoTrailingBlankLine);
		
		CatResult actual = Cat.of(supplier).number().squeezeBlank().execute();
		
		List<String> exptectedOut = List.of(
				"     1  This is a simple text", 
				"     2  second line", 
				"     3  ", 
				"     4  6th line");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	@Test
	void testOutputOfTextNumberSqueezeBlankTailingBlankLine() {
		LineSupplier supplier = new TextLineSupplier(textTrailingBlankLine);
		
		CatResult actual = Cat.of(supplier).number().squeezeBlank().execute();
		
		List<String> exptectedOut = List.of(
				"     1  This is a simple text", 
				"     2  second line", 
				"     3  ", 
				"     4  6th line",
				"");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	@Test
	void testOutputOfTextNumberSqueezeBlankTrailingZeroEnding() {
		LineSupplier supplier = new TextLineSupplier(textTrailingZeroLine);
		
		CatResult actual = Cat.of(supplier).number().squeezeBlank().execute();
		
		List<String> exptectedOut = List.of(
				"     1  This is a simple text", 
				"     2  second line", 
				"     3  ", 
				"     4  6th line", 
				"     5  ");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	@Test
	void testOutputOfTextNumberSqueezeBlankZeroInMidText() {
		LineSupplier supplier = new TextLineSupplier(textZeroInMidst);
		
		CatResult actual = Cat.of(supplier).number().squeezeBlank().execute();
		
		List<String> exptectedOut = List.of(
				"     1  This is a simple text", 
				"     2  second l");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	
	
	
	@Test
	void testOutputOfTextShowTabsNoTrailingBlankLine() {
		LineSupplier supplier = new TextLineSupplier("""
				first\tline\t\s
				spaces     \s
				tabs\t\t\t\t
				\t\t
				""");
		
		CatResult actual = Cat.of(supplier).showTabs().execute();
		
		List<String> exptectedOut = List.of("first^Iline^I ", "spaces     \s", "tabs^I^I^I^I", "^I^I", "");
		CatResult extected = CatResult.of(exptectedOut);
		assertEquals(extected, actual);
	}
	
	
	
	/*
	 * 
	 * To test
	 * 
‘-A’
‘--show-all’
Equivalent to -vET.

‘-e’
Equivalent to -vE.

‘-t’
Equivalent to -vT.

‘-T’
‘--show-tabs’
Display TAB characters as ‘^I’.

‘-u’
Ignored; for POSIX compatibility.

‘-v’
‘--show-nonprinting’
Display control characters except for LFD and TAB using ‘^’ notation and precede characters that have the high bit set with ‘M-’.

*/
	
	
	
	
}
