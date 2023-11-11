package dev.dietermai.coreutil.cat.generate;

public class ConfigOptions {
	public static final ConfigOption defaultt = new ConfigOption("default", "", "");
	public static final ConfigOption showTabs = new ConfigOption("showTabs", "--show-tabs", ".showTabs()");
	public static final ConfigOption showNonprinting = new ConfigOption("showNonprinting", "--show-nonprinting", ".showNonprinting()");
	public static final ConfigOption showEnds = new ConfigOption("showEnds", "--show-ends", ".showEnds()");
	public static final ConfigOption number = new ConfigOption("number", "--number", ".number()");
	public static final ConfigOption numberNonblank = new ConfigOption("numberNonblank", "--number-nonblank", ".numberNonblank()");
	public static final ConfigOption squeezeBlank = new ConfigOption("squeezeBlank", "--squeeze-blank", ".squeezeBlank()");
}
