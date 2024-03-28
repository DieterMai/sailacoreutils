package dev.dietermai.coreutil.cat.testutil;

import java.util.HashMap;
import java.util.Map;
import java.util.function.UnaryOperator;

import dev.dietermai.coreutil.cat.CatBuilder;
import dev.dietermai.coreutil.testutil.ConfigOption;
import dev.dietermai.coreutil.testutil.cat.CatConfigOptions;

public class ConfigOptionMethodMap {
	
	private static final Map<ConfigOption, UnaryOperator<CatBuilder>> map = new HashMap<>();
	static {
		map.put(CatConfigOptions.defaultt, UnaryOperator.identity());
		map.put(CatConfigOptions.showTabs, b -> b.showTabs());
		map.put(CatConfigOptions.showNonprinting, b -> b.showNonprinting());
		map.put(CatConfigOptions.showEnds, b -> b.showEnds());
		map.put(CatConfigOptions.number, b -> b.number());
		map.put(CatConfigOptions.numberNonblank, b -> b.numberNonblank());
		map.put(CatConfigOptions.squeezeBlank, b -> b.squeezeBlank());
	}
	
	public static UnaryOperator<CatBuilder> get(ConfigOption option){
		return map.get(option);
	}
}
