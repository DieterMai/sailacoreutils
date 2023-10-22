package dev.dietermai.coreutil.cat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;
import java.util.Objects;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import dev.dietermai.coreutil.cat.provider.ShowNonprintingProvider;
import dev.dietermai.coreutil.cat.provider.SimpleLineConfigProvider;

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

	
	@ParameterizedTest
	@ArgumentsSource(SimpleLineConfigProvider.class)
	void test_execute_SimpleLine(ExecuteTestDescription testConfig) {
		CatResult expected = CatResult.of(testConfig.expectedOutput());

		CatResult actual = testConfig.config().apply(Cat.of(new TextLineSupplier(testConfig.input()))).execute();
		
		verboseCompare(expected, actual);
	}
	
	@Test
	void testOutputOfTextDefaultZeroInMidText() {
		LineSupplier supplier = new TextLineSupplier(textZeroInMidst);
		
		CatResult actual = Cat.of(supplier).execute();
		
		List<String> exptectedOut = List.of("This is a simple text", "second l");
		CatResult expected = CatResult.of(exptectedOut);
		verboseCompare(expected, actual);
	}
	
	@Test
	void testOutputOfTextNumberNonblankZeroInMidText() {
		LineSupplier supplier = new TextLineSupplier(textZeroInMidst);
		
		CatResult actual = Cat.of(supplier).numberNonblank().execute();
		
		List<String> exptectedOut = List.of(
				"     1  This is a simple text", 
				"     2  second l");
		CatResult expected = CatResult.of(exptectedOut);
		verboseCompare(expected, actual);
	}
	
	
	@Test
	void testOutputOfTextNumberNonblankCarrageReturn() {
		StringBuilder sb = new StringBuilder();
		sb.append("first line\r");
		sb.append("\r");
		sb.append("third line\r");
		String input = sb.toString();
		
		List<String> exptectedOut = List.of(
				"     1  first line\r\rthird line\r");
		
		LineSupplier supplier = new TextLineSupplier(input);
		
		CatResult actual = Cat.of(supplier).numberNonblank().execute();
		
		CatResult expected = CatResult.of(exptectedOut);
		verboseCompare(expected, actual);
	}
	
	@Test
	void testOutputOfTextShowEndsZeroInMidText() {
		LineSupplier supplier = new TextLineSupplier(textZeroInMidst);
		
		CatResult actual = Cat.of(supplier).showEnds().execute();
		
		List<String> exptectedOut = List.of("This is a simple text$", "second l");
		CatResult expected = CatResult.of(exptectedOut);
		verboseCompare(expected, actual);
	}
	
	@Test
	void testOutputOfTextShowEndsZeroInMidTextWindowsEndings() {
		LineSupplier supplier = new TextLineSupplier(textZeroInMidst.replaceAll("\n", "\r\n"));
		
		CatResult actual = Cat.of(supplier).showEnds().execute();
		
		List<String> exptectedOut = List.of("This is a simple text^M$", "second l");
		CatResult expected = CatResult.of(exptectedOut);
		verboseCompare(expected, actual);
	}
	
	@Test
	void testOutputOfTextNumberZeroInMidText() {
		LineSupplier supplier = new TextLineSupplier(textZeroInMidst);
		
		CatResult actual = Cat.of(supplier).number().execute();
		
		List<String> exptectedOut = List.of(
				"     1  This is a simple text", 
				"     2  second l");
		CatResult expected = CatResult.of(exptectedOut);
		verboseCompare(expected, actual);
	}
	
	@Test
	void testOutputOfTextSqueezeBlankZeroInMidText() {
		LineSupplier supplier = new TextLineSupplier(textZeroInMidst);
		
		CatResult actual = Cat.of(supplier).squeezeBlank().execute();
		
		List<String> exptectedOut = List.of("This is a simple text", "second l");
		CatResult expected = CatResult.of(exptectedOut);
		verboseCompare(expected, actual);
	}
	
	@Test
	void testOutputOfTextNumberSqueezeBlankZeroInMidText() {
		LineSupplier supplier = new TextLineSupplier(textZeroInMidst);
		
		CatResult actual = Cat.of(supplier).number().squeezeBlank().execute();
		
		List<String> exptectedOut = List.of(
				"     1  This is a simple text", 
				"     2  second l");
		CatResult expected = CatResult.of(exptectedOut);
		verboseCompare(expected, actual);
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
		CatResult expected = CatResult.of(exptectedOut);
		verboseCompare(expected, actual);
	}
	
	@ParameterizedTest
	@ArgumentsSource(ShowNonprintingProvider.class)
	void testOutputOfNonprinting(String expected, String unicode) {
		LineSupplier supplier = new TextLineSupplier(unicode);
		
		CatResult actual = Cat.of(supplier).showNonprinting().execute();
		
		List<String> exptectedOut = List.of(expected);
		CatResult exptected = CatResult.of(exptectedOut);
		verboseCompare(exptected, actual);
	}
	
	
	
	
	
	private void verboseCompare(CatResult exptected, CatResult actual) {
		if(Objects.equals(exptected, actual)) {
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("Actual does not equal expected.\n");
		sb.append("Expexted: ").append(exptected.toString()).append("\n");
		sb.append("Actual:   ").append(actual.toString()).append("\n");
		sb.append("\n");
		sb.append("Detailed compare:\n");
		
		if(exptected.exit() != actual.exit()) {
			sb.append("Exit: Expected ").append(exptected.exit()).append(", actual: ").append(actual.exit()).append("\n");
		}
		
		
		descripeStringArrayDiff(sb, exptected.stdout(), actual.stdout());
		descripeStringArrayDiff(sb, exptected.stderr(), actual.stderr());
		
		fail(sb.toString());
	}
	
	private void descripeStringArrayDiff(StringBuilder sb, List<String> expected, List<String> actual) {
		for(int i = 0; i < Math.max(expected.size(), actual.size()); i++) {
			if(i >= expected.size() && i < actual.size()) {
				sb.append("Line ").append(i).append(": expected missing while actual [").append(actual.get(i)).append("]\n");
			}else if(i < expected.size() && i >= actual.size()) {
				sb.append("Line ").append(i).append(": actual missing while expected [").append(expected.get(i)).append("]\n");
			}else if(!expected.get(i).equals(actual.get(i))) {
				sb.append("Line ").append(i).append(" differs:\n");
				sb.append("Expected: [").append(expected.get(i)).append("]\n");
				sb.append("Actual:   [").append(actual.get(i)).append("]\n");
				describeFirstDiff(sb, expected.get(i), actual.get(i));
			}
		}
	}
	
	private void describeFirstDiff(StringBuilder sb, String expected, String actual) {
		for(int i = 0; i < Math.max(expected.length(), actual.length()); i++) {
			if(i >= expected.length() && i < actual.length()) {
				sb.append("    First diff is at char ").append(i).append(":\n");
				sb.append("    expected has ended but actual has ").append(actual.charAt(i)).append(" [").append((int)actual.charAt(i)).append("]\n");
				break;
			}else if(i >= actual.length() && i < expected.length()) {
				sb.append("    First diff is at char ").append(i).append(":\n");
				sb.append("    actual has ended but expected has ").append(expected.charAt(i)).append(" [").append((int)expected.charAt(i)).append("]\n");
				break;
			}else if(expected.charAt(i) != actual.charAt(i)) {
				sb.append("    First diff is at char ").append(i).append(":\n");
				sb.append("    expected is ").append(expected.charAt(i)).append(" [").append((int)expected.charAt(i)).append("]\n");
				sb.append("    actual   is ").append(actual.charAt(i)).append(" [").append((int)actual.charAt(i)).append("]\n");
				break;
			}
		}
	}
	
	/*
	 * 
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


‘-v’
‘--show-nonprinting’
Display control characters except for LFD and TAB using ‘^’ notation and precede characters that have the high bit set with ‘M-’.

*/
	
	
	
	
}
