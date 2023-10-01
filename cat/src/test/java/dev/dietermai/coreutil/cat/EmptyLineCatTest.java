package dev.dietermai.coreutil.cat;


import org.junit.jupiter.api.Test;

class EmptyLineCatTest {

	@Test
	void testnumberConfig() {
		LineSupplier supplier = new TextLineSupplier("");
		String exptectedOut = """
        """;
		CatResult expected = CatResult.of(exptectedOut);

		CatResult actual = Cat.of(supplier).number().execute();

		TestUtil.verboseCompare(expected, actual);
	}

	@Test
	void testsqueezeBlankConfig() {
		LineSupplier supplier = new TextLineSupplier("");
		String exptectedOut = """
        """;
		CatResult expected = CatResult.of(exptectedOut);

		CatResult actual = Cat.of(supplier).squeezeBlank().execute();

		TestUtil.verboseCompare(expected, actual);
	}

}
