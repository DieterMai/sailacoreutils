package dev.dietermai.coreutil.cat.generate;

import java.util.ArrayList;
import java.util.List;

public class ConfigCases {
	public static List<ConfigCase> get(){
		List<ConfigCase> cases = new ArrayList<>();
		cases.add(getDefaultConfig());
		cases.add(getShowTabsConfig());
		cases.add(getShowNonprintingConfig());
		
//		cases.add(getShowAllConfig());
//		cases.add(getShowEnds());
			
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

	private static ConfigCase getShowAllConfig() {
		return new ConfigCase("showAll", "--show-all", ".showAll()");
	}

//	numberNoneblank("numberNoneblank", "--number-nonblank", ".numberNonblank()"),
//	showEnds("showEnds", "--show-ends", ".showEnds()"),
//	number("number", "--number", ".number()"),
//	squeezeBlank("squeezeBlank", "--squeeze-blank", ".squeezeBlank()"),
//	showNonprinting("showNonprinting", "--show-nonprinting", ".showNonprinting()")
}
