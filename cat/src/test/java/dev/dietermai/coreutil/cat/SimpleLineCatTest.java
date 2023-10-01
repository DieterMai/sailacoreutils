package dev.dietermai.coreutil.cat;


import org.junit.jupiter.api.Test;

class SimpleLineCatTest {

	@Test
	void testnumberConfig() {
		LineSupplier supplier = new TextLineSupplier("A Simple Line");
		String exptectedOut = """
        A Simple Lie""";
		CatResult expected = CatResult.of(exptectedOut);

		CatResult actual = Cat.of(supplier).number().execute();

		TestUtil.verboseCompare(expected, actual);
	}

	@Test
	void testsqueezeBlankConfig() {
		LineSupplier supplier = new TextLineSupplier("A Simple Line");
		String exptectedOut = """
        A Simple Lie""";
		CatResult expected = CatResult.of(exptectedOut);

		CatResult actual = Cat.of(supplier).squeezeBlank().execute();

		TestUtil.verboseCompare(expected, actual);
	}

}
