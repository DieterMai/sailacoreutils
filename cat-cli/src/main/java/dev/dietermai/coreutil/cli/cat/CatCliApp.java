package dev.dietermai.coreutil.cli.cat;

import java.io.FileNotFoundException;
import java.util.Iterator;

import dev.dietermai.coreutil.cat.CatExecuter;
import dev.dietermai.coreutil.cli.cat.parse.CatCommandLineParser;
import dev.dietermai.coreutil.cli.cat.parse.result.ParsingExecutionResult;
import dev.dietermai.coreutil.cli.cat.parse.result.ParsingHelpResult;
import dev.dietermai.coreutil.cli.cat.parse.result.ParsingResult;
import dev.dietermai.coreutil.cli.cat.parse.result.ParsingVersionResult;


public class CatCliApp {
	public static void main(String[] args) {
		new CatCliApp(args).start();
	}
	
	private static final String HELP_TEXT = """
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
	
	private static final String VERSION_TEXT = """
			Version text of saila cat
			""";
	

	private final String[] args;
	private final CatContext context;
	private final IPrinter printer;

	public CatCliApp(String[] args) {
		this(args, new DefaultCatContext());
	}
	
	public CatCliApp(String[] args, CatContext context) {
		this.args = args;
		this.context = context;
		this.printer = context.getPrinter();
	}

	public void start() {
		try {
			CatCommandLineParser parser = new CatCommandLineParser();
			ParsingResult result = parser.parse(args);
	
			switch(result) {
			case ParsingVersionResult v   -> printVersion(v); 
			case ParsingHelpResult h      -> printHelp(h);
			case ParsingExecutionResult e -> executeCat(e);
			}
		}catch(CatCliException e) {
			// TODO error handling
		}
	}
	
	private void executeCat(ParsingExecutionResult parseResult) {
		for(String fileName : parseResult.operands()) {
			try (IFileCharSupplier supplier = context.newFileCharSupplier(fileName)) {
				Iterator<String> iter = CatExecuter.iterator(parseResult.catConfig(), supplier);
				while(iter.hasNext()) {
					printer.print(iter.next());
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
			} catch (Exception closeException) {
				// TODO Auto-generated catch block
			}
		}
		
		
		
	}

	
	
	private void printHelp(ParsingHelpResult parseResult) {
		printer.print(HELP_TEXT);
	}
	
	private void printVersion(ParsingVersionResult parseResult) {
		printer.print(VERSION_TEXT);
	}
}
