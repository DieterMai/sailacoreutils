package dev.dietermai.coreutil.cat.test;

import static dev.dietermai.coreutil.cat.test.ConfigOptions.defaultt;
import static dev.dietermai.coreutil.cat.test.ConfigOptions.number;
import static dev.dietermai.coreutil.cat.test.ConfigOptions.numberNonblank;
import static dev.dietermai.coreutil.cat.test.ConfigOptions.showEnds;
import static dev.dietermai.coreutil.cat.test.ConfigOptions.showNonprinting;
import static dev.dietermai.coreutil.cat.test.ConfigOptions.showTabs;
import static dev.dietermai.coreutil.cat.test.ConfigOptions.squeezeBlank;

import java.util.HashMap;
import java.util.Map;

public class ConfigCases {
	public static Map<String, ConfigCase> get() {
		Map<String, ConfigCase>  map = new HashMap<>();
		put(map, of(defaultt));
		
		put(map, of(number));
		put(map, of(numberNonblank));
		put(map, of(showNonprinting));
		put(map, of(showEnds));
		put(map, of(showTabs));
		put(map, of(squeezeBlank));
		
		put(map, of(number, numberNonblank));
		put(map, of(number, squeezeBlank));
		put(map, of(numberNonblank, squeezeBlank));
		put(map, of(numberNonblank, showTabs));
		put(map, of(numberNonblank, showNonprinting));
		put(map, of(numberNonblank, showEnds));
		put(map, of(showEnds, showNonprinting));
		put(map, of(showEnds, squeezeBlank));
		put(map, of(showNonprinting, showTabs));
		put(map, of(showNonprinting, squeezeBlank));
		put(map, of(showTabs, squeezeBlank));

		put(map, of(showEnds, showNonprinting, showTabs));
		
		put(map, of(number, numberNonblank, showEnds, showNonprinting, showTabs, squeezeBlank));

		put(map, of(new ConfigOption("u", "-u", ".u()")));

		return map;
	}

	private static void put(Map<String, ConfigCase> map, ConfigCase config) {
		map.put(config.arguments(), config);
		
	}
	
	private static ConfigCase of(ConfigOption... options) {
		return ConfigCase.of(options);
	}
}
