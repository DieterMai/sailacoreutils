package dev.dietermai.coreutil.cli.cat;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dev.dietermai.coreutil.cli.test.PrinterDummy;

class CatCliAppTest {

	private static final String EXPECTED_HELP_TEXT = """
			Usage: cat [OPTION]... [FILE]...
			Concatenate FILE(s) to standard output.
			
			With no FILE, or when FILE is -, read standard input.
			
			  -A, --show-all           Equivalent to -vET
			  -b, --number-nonblank    Number nonempty output lines, overrides -n
			  -e                       Equivalent to -vE
			  -E, --show-ends          Display $ at end of each line
			  -n, --number             Number all output lines
			  -s, --squeeze-blank      Suppress repeated empty output lines
			  -t                       Equivalent to -vT
			  -T, --show-tabs          Display TAB characters as ^I
			  -v, --show-nonprinting   Use ^ and M- notation, except for LFD and TAB
			      --help               Display this help and exit
			      --version            Output version information and exit
			
			Examples:
			  cat f - g  Output f's contents, then standard input, then g's contents.
			  cat        Copy standard input to standard output.
			
			GNU coreutils online help: <https://www.gnu.org/software/coreutils/>
			Full documentation <https://www.gnu.org/software/coreutils/cat>
			or available locally via: info '(coreutils) cat invocation'""";
	
	private static final String EXPECTED_VERSION_TEXT = """
			Version text of saila cat
			""";
	
	@Test
	void test_helpIsPrinted() {
		// arrange
		PrinterDummy printer = new PrinterDummy();
		String[] input = {"--help"};
		CatCliApp app = new CatCliApp(input, printer);
		
		// act
		app.start();
		
		// assert
		assertEquals(EXPECTED_HELP_TEXT, printer.getContent());
	} 
	
	@Test
	void test_version() {
		// arrange
		PrinterDummy printer = new PrinterDummy();
		String[] input = {"--version"};
		CatCliApp app = new CatCliApp(input, printer);
		
		// act
		app.start();
		
		// assert
		assertEquals(EXPECTED_VERSION_TEXT, printer.getContent());
	} 

}
