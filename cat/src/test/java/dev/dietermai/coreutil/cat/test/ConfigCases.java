package dev.dietermai.coreutil.cat.test;

import static dev.dietermai.coreutil.cat.test.ConfigOptions.defaultt;
import static dev.dietermai.coreutil.cat.test.ConfigOptions.number;
import static dev.dietermai.coreutil.cat.test.ConfigOptions.numberNonblank;
import static dev.dietermai.coreutil.cat.test.ConfigOptions.showEnds;
import static dev.dietermai.coreutil.cat.test.ConfigOptions.showNonprinting;
import static dev.dietermai.coreutil.cat.test.ConfigOptions.showTabs;
import static dev.dietermai.coreutil.cat.test.ConfigOptions.squeezeBlank;

import java.util.ArrayList;
import java.util.List;

public class ConfigCases {
	public static List<ConfigCase> get() {
		List<ConfigCase> map = new ArrayList<>();
		add(map, of(defaultt));
		
		add(map, of(number));
		add(map, of(numberNonblank));
		add(map, of(showNonprinting));
		add(map, of(showEnds));
		add(map, of(showTabs));
		add(map, of(squeezeBlank));
		
		add(map, of(number, numberNonblank));
		add(map, of(number, squeezeBlank));
		add(map, of(numberNonblank, squeezeBlank));
		add(map, of(numberNonblank, showTabs));
		add(map, of(numberNonblank, showNonprinting));
		add(map, of(numberNonblank, showEnds));
		add(map, of(showEnds, showNonprinting));
		add(map, of(showEnds, squeezeBlank));
		add(map, of(showNonprinting, showTabs));
		add(map, of(showNonprinting, squeezeBlank));
		add(map, of(showTabs, squeezeBlank));

		add(map, of(showEnds, showNonprinting, showTabs));
		
		add(map, of(number, numberNonblank, showEnds, showNonprinting, showTabs, squeezeBlank));

		add(map, of(new ConfigOption("u", "-u", b -> b.u())));

		return map;
	}

	private static void add(List<ConfigCase> map, ConfigCase config) {
		map.add(config);
		
	}
	
	private static ConfigCase of(ConfigOption... options) {
		return ConfigCase.of(options);
	}
}
