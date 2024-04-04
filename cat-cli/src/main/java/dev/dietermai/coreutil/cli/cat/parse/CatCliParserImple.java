package dev.dietermai.coreutil.cli.cat.parse;

import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import dev.dietermai.coreutil.cat.CatBuilder;
import dev.dietermai.coreutil.cat.CatConfig;
import dev.dietermai.coreutil.cli.cat.CatCliException;
import dev.dietermai.coreutil.cli.cat.CatCliParser;
import dev.dietermai.coreutil.cli.cat.parse.result.ParsingExecutionResult;
import dev.dietermai.coreutil.cli.cat.parse.result.ParsingHelpResult;
import dev.dietermai.coreutil.cli.cat.parse.result.ParsingResult;
import dev.dietermai.coreutil.cli.cat.parse.result.ParsingVersionResult;

public class CatCliParserImple implements CatCliParser{
	//@formatter:off
	private static final Option OPTION_e                = new Option("e",                            "equivalent to -vE");
	private static final Option OPTION_number           = new Option("n", "number",           false, "number all output lines");
	private static final Option OPTION_number_nonblank  = new Option("b", "number-nonblank",  false, "number nonempty output lines, overrides -n");
	private static final Option OPTION_show_all         = new Option("A", "show-all",         false, "equivalent to -vET");
	private static final Option OPTION_show_ends        = new Option("E", "show-ends",        false, "display $ at end of each line");
	private static final Option OPTION_show_nonprinting = new Option("v", "show-nonprinting", false, "use ^ and M- notation, except for LFD and TAB");
	private static final Option OPTION_show_tabs        = new Option("T", "show-tabs",        false, "display TAB characters as ^I");
	private static final Option OPTION_squeeze_blank    = new Option("s", "squeeze-blank",    false, "suppress repeated empty output lines");
	private static final Option OPTION_t                = new Option("t",                            "equivalent to -vT");
	private static final Option OPTION_u                = new Option("u",                            "(ignored)");
	private static final Option OPTION_help             = new Option(null, "help",             false, "display this help and exit");
	private static final Option OPTION_version          = new Option(null, "version",          false, "output version information and exit");
	//@formatter:on

	private final Options options;

	public CatCliParserImple() {
		options = new Options();
		options.addOption(OPTION_e);
		options.addOption(OPTION_help);
		options.addOption(OPTION_number);
		options.addOption(OPTION_number_nonblank);
		options.addOption(OPTION_show_all);
		options.addOption(OPTION_show_ends);
		options.addOption(OPTION_show_nonprinting);
		options.addOption(OPTION_show_tabs);
		options.addOption(OPTION_squeeze_blank);
		options.addOption(OPTION_t);
		options.addOption(OPTION_u);
		options.addOption(OPTION_version);
	}
	
	public Options options() {
		return options;
	}

	
	public ParsingResult parse(String[] args) throws CatCliException {
		CatBuilder builder = CatBuilder.of();

		if(args == null) {
			return ParsingExecutionResult.of();
		}
		
		CommandLine cl = parseToCommandLine(args);

		if(cl.hasOption(OPTION_help)) {
			return ParsingHelpResult.of();
		}
		
		if(cl.hasOption(OPTION_version)) {
			return ParsingVersionResult.of();
		}

		
		//@formatter:off
		if (cl.hasOption(OPTION_e))                builder.e();
		if (cl.hasOption(OPTION_number))           builder.number();
		if (cl.hasOption(OPTION_number_nonblank))  builder.numberNonblank();
		if (cl.hasOption(OPTION_show_all))         builder.showAll();
		if (cl.hasOption(OPTION_show_ends))        builder.showEnds();
		if (cl.hasOption(OPTION_show_nonprinting)) builder.showNonprinting();
		if (cl.hasOption(OPTION_show_tabs))        builder.showTabs();
		if (cl.hasOption(OPTION_squeeze_blank))    builder.squeezeBlank();
		if (cl.hasOption(OPTION_t))                builder.t();
		if (cl.hasOption(OPTION_u))                builder.u();
		//@formatter:on
		
		CatConfig catConfig = builder.get();
		List<String> operands = cl.getArgList().stream().filter(s -> !s.isEmpty()).toList();
		
		return ParsingExecutionResult.of(catConfig, operands);
	}
	
	private CommandLine parseToCommandLine(String[] args) throws CatCliException{
		try {
			return tryToParseToCommandLine(args);
		} catch (ParseException e) {
			throw CatCliException.of(e);
		}
	}
	
	private CommandLine tryToParseToCommandLine(String[] args) throws ParseException {
		return new DefaultParser(true).parse(options, args);
	}
}
