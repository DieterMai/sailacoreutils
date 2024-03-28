package dev.dietermai.coreutil.testutil.cat;

import static dev.dietermai.coreutil.testutil.cat.CatConfigOptions.defaultt;
import static dev.dietermai.coreutil.testutil.cat.CatConfigOptions.number;
import static dev.dietermai.coreutil.testutil.cat.CatConfigOptions.numberNonblank;
import static dev.dietermai.coreutil.testutil.cat.CatConfigOptions.showEnds;
import static dev.dietermai.coreutil.testutil.cat.CatConfigOptions.showNonprinting;
import static dev.dietermai.coreutil.testutil.cat.CatConfigOptions.showTabs;
import static dev.dietermai.coreutil.testutil.cat.CatConfigOptions.squeezeBlank;

import java.util.ArrayList;
import java.util.List;

import dev.dietermai.coreutil.testutil.ConfigCase;
import dev.dietermai.coreutil.testutil.ConfigOption;

public class CatConfigCases {
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

		add(map, of(new ConfigOption("u", "-u")));

		return map;
	}

	private static void add(List<ConfigCase> map, ConfigCase config) {
		map.add(config);
		
	}
	
	private static ConfigCase of(ConfigOption... options) {
		return ConfigCase.of(options);
	}
}
