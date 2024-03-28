package dev.dietermai.coreutil.cat.testutil;

import java.util.HashMap;
import java.util.Map;
import java.util.function.UnaryOperator;

import dev.dietermai.coreutil.cat.CatBuilder;
import dev.dietermai.coreutil.testutil.ConfigOption;
import dev.dietermai.coreutil.testutil.cat.ConfigOptions;

public class ConfigOptionMethodMap {
	
	private static final Map<ConfigOption, UnaryOperator<CatBuilder>> map = new HashMap<>();
	static {
		map.put(ConfigOptions.defaultt, UnaryOperator.identity());
		map.put(ConfigOptions.showTabs, b -> b.showTabs());
		map.put(ConfigOptions.showNonprinting, b -> b.showNonprinting());
		map.put(ConfigOptions.showEnds, b -> b.showEnds());
		map.put(ConfigOptions.number, b -> b.number());
		map.put(ConfigOptions.numberNonblank, b -> b.numberNonblank());
		map.put(ConfigOptions.squeezeBlank, b -> b.squeezeBlank());
	}
	
	public static UnaryOperator<CatBuilder> get(ConfigOption option){
		return map.get(option);
	}
}
