package dev.dietermai.coreutil.cat.generate;

import java.util.ArrayList;
import java.util.List;

public class ConfigCases {
	public static List<ConfigCase> get(){
		List<ConfigCase> cases = new ArrayList<>();
		cases.add(getDefaultConfig());
		cases.add(getShowTabsConfig());
		cases.add(getShowNonprintingConfig());
		cases.add(getShowEndsConfig());
		cases.add(getNumbersConfig());
		
		return cases;
	}
	
	
	
	private static ConfigCase getDefaultConfig() {
		return new ConfigCase("default", "", "");
	}
	
	private static ConfigCase getShowTabsConfig() {
		return new ConfigCase("showTabs", "--show-tabs", ".showTabs()");
	}
	
	private static ConfigCase getShowNonprintingConfig() {
		return new ConfigCase("showNonprinting", "--show-nonprinting", ".showNonprinting()");
	}
	
	private static ConfigCase getShowEndsConfig() {
		return new ConfigCase("showEnds", "--show-ends", ".showEnds()");
	}
	
	private static ConfigCase getNumbersConfig() {
		return new ConfigCase("number", "--number", ".number()");
	}


//	numberNoneblank("numberNoneblank", "--number-nonblank", ".numberNonblank()"),
//	number("number", "--number", ".number()"),
//	squeezeBlank("squeezeBlank", "--squeeze-blank", ".squeezeBlank()"),
}
