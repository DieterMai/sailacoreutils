package dev.dietermai.coreutil.cli.cat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import dev.dietermai.coreutil.cat.CatBuilder;
import dev.dietermai.coreutil.cat.CatConfig;
import dev.dietermai.coreutil.cli.cat.parse.CatCliParserImple;
import dev.dietermai.coreutil.cli.cat.parse.result.ParsingExecutionResult;
import dev.dietermai.coreutil.cli.cat.parse.result.ParsingHelpResult;
import dev.dietermai.coreutil.cli.cat.parse.result.ParsingResult;
import dev.dietermai.coreutil.cli.cat.parse.result.ParsingVersionResult;

class CatCommandLineParserTest {

	private CatCliParserImple parser;

	
	@BeforeEach
	public void beforeEach() {
		parser = new CatCliParserImple();
	}

	@Test
	void testOfNull() throws CatCliException {
		ParsingResult actual = parser.parse(null);

		ParsingResult expected = ParsingExecutionResult.of(CatConfig.of());
		assertEquals(expected, actual);
	}

	@Test
	void testEmptyArray()  throws CatCliException {
		ParsingResult actual = parser.parse(new String[] {});

		ParsingResult expected = ParsingExecutionResult.of(CatConfig.of());
		assertEquals(expected, actual);
	}

	@Test
	void testEmptyArgument()  throws CatCliException {
		ParsingResult actual = parser.parse(new String[] { "", "" });

		ParsingResult expected = ParsingExecutionResult.of(CatConfig.of());
		assertEquals(expected, actual);
	}

	@ParameterizedTest
	@ValueSource(strings = { "--v", "--ve", "--ver", "--vers", "--versi", "--versio", "--version" })
	void testVersion(String partial)  throws CatCliException {
		ParsingResult actual = parser.parse(new String[] { partial });

		ParsingResult expected = ParsingVersionResult.of();
		assertEquals(expected, actual);
	}

	@ParameterizedTest
	@ValueSource(strings = { "--help", "--hel", "--he", "--h" })
	void testHelp(String partial)  throws CatCliException {
		ParsingResult actual = parser.parse(new String[] { partial });

		ParsingResult expected = ParsingHelpResult.of();
		assertEquals(expected, actual);
	}

	@ParameterizedTest
	@ValueSource(strings = { "-A", "--show-all", "--show-al", "--show-a" })
	void testShowAll(String partial)  throws CatCliException {
		ParsingResult actual = parser.parse(new String[] { partial });

		ParsingResult expected = ParsingExecutionResult.of(CatBuilder.of().showAll().get());
		assertEquals(expected, actual);
	}

	@ParameterizedTest
	@ValueSource(strings = { "-b", "--number-nonblank", "--number-nonblan", "--number-nonbla", "--number-nonbl",
			"--number-non", "--number-n", "--number-" })
	void testNumberNonblank(String partial) throws CatCliException  {
		ParsingResult actual = parser.parse(new String[] { partial });

		ParsingResult expected = ParsingExecutionResult.of(CatBuilder.of().numberNonblank().get());
		assertEquals(expected, actual);
	}

	@ParameterizedTest
	@ValueSource(strings = { "-e" })
	void test_e(String partial) throws CatCliException  {
		ParsingResult actual = parser.parse(new String[] { partial });

		ParsingResult expected = ParsingExecutionResult.of(CatBuilder.of().e().get());
		assertEquals(expected, actual);
	}

	@ParameterizedTest
	@ValueSource(strings = { "-E", "--show-ends", "--show-end", "--show-en", "--show-e" })
	void testShowEnds(String partial) throws CatCliException {
		ParsingResult actual = parser.parse(new String[] { partial });

		ParsingResult expected = ParsingExecutionResult.of(CatBuilder.of().showEnds().get());
		assertEquals(expected, actual);
	}

	@ParameterizedTest
	@ValueSource(strings = { "-n", "--number" })
	void testNumber(String partial) throws CatCliException {
		ParsingResult actual = parser.parse(new String[] { partial });

		ParsingResult expected = ParsingExecutionResult.of(CatBuilder.of().number().get());
		assertEquals(expected, actual);
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "-s", "--squeeze-blank", "--squeeze-blan", "--squeeze-bla", "--squeeze-bl", "--squeeze-b", "--squeeze-", "--squeeze", "--squeez", "--squee", "--sque", "--squ", "--sq" })
	void testSqueezeBlank(String partial) throws CatCliException  {
		ParsingResult actual = parser.parse(new String[] { partial });

		ParsingResult expected = ParsingExecutionResult.of(CatBuilder.of().squeezeBlank().get());
		assertEquals(expected, actual);
	}

	@ParameterizedTest
	@ValueSource(strings = { "-t" })
	void test_t(String partial) throws CatCliException {
		ParsingResult actual = parser.parse(new String[] { partial });

		ParsingResult expected = ParsingExecutionResult.of(CatBuilder.of().t().get());
		assertEquals(expected, actual);
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "-T", "--show-tabs", "--show-tab", "--show-ta", "--show-t" })
	void testShowTabs(String partial) throws CatCliException {
		ParsingResult actual = parser.parse(new String[] { partial });

		ParsingResult expected = ParsingExecutionResult.of(CatBuilder.of().showTabs().get());
		assertEquals(expected, actual);
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "-u"})
	void test_u(String partial) throws CatCliException {
		ParsingResult actual = parser.parse(new String[] { partial });

		ParsingResult expected = ParsingExecutionResult.of(CatBuilder.of().get());
		assertEquals(expected, actual);
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "-v", "--show-nonprinting", "--show-nonprintin", "--show-nonprinti", "--show-nonprint", "--show-nonprin", "--show-nonpri", "--show-nonpr", "--show-nonp", "--show-non", "--show-no", "--show-n" })
	void testShowNonprinting(String partial) throws CatCliException {
		ParsingResult actual = parser.parse(new String[] { partial });

		ParsingResult expected = ParsingExecutionResult.of(CatBuilder.of().showNonprinting().get());
		assertEquals(expected, actual);
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "--numbe", "--numb", "--num", "--nu", "--n", })
	void testAmbiguasNumber(String partial) {
		try {
			parser.parse(new String[] { partial });
			fail();
		}catch(CatCliException e) {
//			assertEquals(new CliError.AmbiguasOption(partial), e.getError()); // TODO
		}
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "--show", "--sho", "--sh", "--s" })
	void testAmbiguasShow(String partial) {
		try {
			parser.parse(new String[] { partial });
			fail();
		}catch(CatCliException e) {
//			assertEquals(new CliError.AmbiguasOption(partial), e.getError()); // TODO
		}
	}
	
	@Test
	void testUnrecognizedOption() {
		try {
			parser.parse(new String[] { "--foo" });
			fail();
		}catch(CatCliException e) {
//			assertEquals(new CliError.UnrecognizedOption("--foo"), e.getError()); // TODO
		}
	}
}
