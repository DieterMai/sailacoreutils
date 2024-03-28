package dev.dietermai.coreutil.testutil.cat;

import dev.dietermai.coreutil.testutil.ConfigOption;

public class CatConfigOptions {
	public static final ConfigOption defaultt = new ConfigOption("defaultt", "");
	public static final ConfigOption showTabs = new ConfigOption("showTabs", "--show-tabs");
	public static final ConfigOption showNonprinting = new ConfigOption("showNonprinting", "--show-nonprinting");
	public static final ConfigOption showEnds = new ConfigOption("showEnds", "--show-ends");
	public static final ConfigOption number = new ConfigOption("number", "--number");
	public static final ConfigOption numberNonblank = new ConfigOption("numberNonblank", "--number-nonblank");
	public static final ConfigOption squeezeBlank = new ConfigOption("squeezeBlank", "--squeeze-blank");
	public static final ConfigOption u = new ConfigOption("u", "-u");
}
