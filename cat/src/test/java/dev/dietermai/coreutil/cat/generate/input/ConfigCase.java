package dev.dietermai.coreutil.cat.generate.input;

public enum ConfigCase {
//	_default("default", "", ""),
//	showAll("showAll", "--show-all", ".showAll()"),
//	numberNoneblank("numberNoneblank", "--number-nonblank", ".numberNonblank()"),
//	showEnds("showEnds", "--show-ends", ".showEnds()"),
	number("number", "--number", ".number()"),
	squeezeBlank("squeezeBlank", "--squeeze-blank", ".squeezeBlank()"),
//	showTabs("showTabs", "--show-tabs", ".showTabs()"),
//	showNonprinting("showNonprinting", "--show-nonprinting", ".showNonprinting()")
	;
	
	public final String name;
	public final String options;
	public final String mOptions;
	
	
	private ConfigCase(String name, String cliOptions, String mOptions) {
		this.name = name;
		this.options = cliOptions;
		this.mOptions = mOptions;
	}
}
