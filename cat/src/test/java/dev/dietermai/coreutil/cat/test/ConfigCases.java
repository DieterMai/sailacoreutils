package dev.dietermai.coreutil.cat.test;

import static dev.dietermai.coreutil.cat.test.ConfigOptions.*;

import java.util.ArrayList;
import java.util.List;

public class ConfigCases {
	public static List<ConfigCase> get() {
		List<ConfigCase> cases = new ArrayList<>();
		cases.add(of(defaultt));
		
		cases.add(of(number));
		cases.add(of(numberNonblank));
		cases.add(of(showNonprinting));
		cases.add(of(showEnds));
		cases.add(of(showTabs));
		cases.add(of(squeezeBlank));
		
		cases.add(of(number, numberNonblank));
		cases.add(of(number, squeezeBlank));
		cases.add(of(numberNonblank, squeezeBlank));
		cases.add(of(numberNonblank, showTabs));
		cases.add(of(numberNonblank, showNonprinting));
		cases.add(of(numberNonblank, showEnds));
		cases.add(of(showEnds, showNonprinting));
		cases.add(of(showEnds, squeezeBlank));
		cases.add(of(showNonprinting, showTabs));
		cases.add(of(showNonprinting, squeezeBlank));
		cases.add(of(showTabs, squeezeBlank));

		cases.add(of(showEnds, showNonprinting, showTabs));
		
		cases.add(of(number, numberNonblank, showEnds, showNonprinting, showTabs, squeezeBlank));

		cases.add(of(new ConfigOption("u", "-u", ".u()")));

		return cases;
	}

	private static ConfigCase of(ConfigOption... options) {
		return ConfigCase.of(options);
	}
}
