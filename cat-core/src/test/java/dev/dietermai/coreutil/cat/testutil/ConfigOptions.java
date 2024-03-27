package dev.dietermai.coreutil.cat.testutil;

import java.util.function.UnaryOperator;

import dev.dietermai.coreutil.testutil.ConfigOption;

public class ConfigOptions {
	public static final ConfigOption defaultt = new ConfigOption("defaultt", "", UnaryOperator.identity());
	public static final ConfigOption showTabs = new ConfigOption("showTabs", "--show-tabs", b -> b.showTabs());
	public static final ConfigOption showNonprinting = new ConfigOption("showNonprinting", "--show-nonprinting", b -> b.showNonprinting());
	public static final ConfigOption showEnds = new ConfigOption("showEnds", "--show-ends", b -> b.showEnds());
	public static final ConfigOption number = new ConfigOption("number", "--number", b -> b.number());
	public static final ConfigOption numberNonblank = new ConfigOption("numberNonblank", "--number-nonblank", b -> b.numberNonblank());
	public static final ConfigOption squeezeBlank = new ConfigOption("squeezeBlank", "--squeeze-blank", b -> b.squeezeBlank());
}
