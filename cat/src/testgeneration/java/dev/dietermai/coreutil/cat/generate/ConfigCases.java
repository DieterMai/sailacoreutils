package dev.dietermai.coreutil.cat.generate;

import java.util.ArrayList;
import java.util.List;

public class ConfigCases {
	public static List<ConfigCase> get() {
		List<ConfigCase> cases = new ArrayList<>();
		cases.add(getDefaultConfig());
		cases.add(getShowTabsConfig());
		cases.add(getShowNonprintingConfig());
		cases.add(getShowEndsConfig());
		cases.add(getNumbersConfig());
		cases.add(getNumbersNoneblankConfig());
		cases.add(getSqueezeBlankConfig());
		cases.add(getShowAllConfig());
		cases.add(getEConfig());
		cases.add(getTConfig());
		cases.add(getUConfig());
		cases.add(getNumbersAndNumbersNoneblankConfig());
		cases.add(getNumbersAndSqueezeBlankConfig());
		cases.add(getNumbersNoneblankAndSqueezeBlankConfig());
		cases.add(getNumbersNoneblankAndShowTabsConfig());
		cases.add(getNumbersNoneblankAndShowNonprintingConfig());
		cases.add(getNumbersNoneblankAndShowEndsConfig());
		cases.add(getSqueezeBlankAndShowTabsConfig());
		cases.add(getSqueezeBlankAndShowNonprintingConfig());
		cases.add(getSqueezeBlankAndShowEndsConfig());
		cases.add(getAllConfig());

		return cases;
	}

	private static ConfigCase getDefaultConfig() {
		return new ConfigCase(
				"default",
				"",
				"");
	}

	private static ConfigCase getShowTabsConfig() {
		return new ConfigCase(
				"showTabs",
				"--show-tabs",
				".showTabs()");
	}

	private static ConfigCase getShowNonprintingConfig() {
		return new ConfigCase(
				"showNonprinting",
				"--show-nonprinting",
				".showNonprinting()");
	}

	private static ConfigCase getShowEndsConfig() {
		return new ConfigCase(
				"showEnds",
				"--show-ends",
				".showEnds()");
	}

	private static ConfigCase getNumbersConfig() {
		return new ConfigCase(
				"number",
				"--number",
				".number()");
	}

	private static ConfigCase getNumbersNoneblankConfig() {
		return new ConfigCase(
				"numberNoneblank",
				"--number-nonblank",
				".numberNonblank()");
	}

	private static ConfigCase getSqueezeBlankConfig() {
		return new ConfigCase(
				"squeezeBlank",
				"--squeeze-blank",
				".squeezeBlank()");
	}

	private static ConfigCase getShowAllConfig() {
		return new ConfigCase(
				"showAll",
				"--show-all",
				".showAll()");
	}

	private static ConfigCase getEConfig() {
		return new ConfigCase(
				"e",
				"-e",
				".e()");
	}

	private static ConfigCase getTConfig() {
		return new ConfigCase(
				"t",
				"-t",
				".t()");
	}

	private static ConfigCase getUConfig() {
		return new ConfigCase(
				"u",
				"-u",
				".u()");
	}

	private static ConfigCase getNumbersAndNumbersNoneblankConfig() {
		return new ConfigCase(
				"NumbersAndNumbersNoneblank",
				"--number --number-nonblank",
				".number().numberNonblank()");
	}

	private static ConfigCase getNumbersAndSqueezeBlankConfig() {
		return new ConfigCase(
				"NumbersAndSqueezeBlank",
				"--number --squeeze-blank",
				".number().squeezeBlank()");
	}

	private static ConfigCase getNumbersNoneblankAndSqueezeBlankConfig() {
		return new ConfigCase(
				"NumbersNoneblankAndSqueezeBlank",
				" --number-nonblank --squeeze-blank",
				".numberNonblank().squeezeBlank()");
	}

	private static ConfigCase getNumbersNoneblankAndShowTabsConfig() {
		return new ConfigCase(
				"numbersNoneblankAndShowTabs",
				"--show-tabs",
				".showTabs()");
	}

	private static ConfigCase getNumbersNoneblankAndShowNonprintingConfig() {
		return new ConfigCase(
				"numbersNoneblankAndshowNonprinting",
				"--number-nonblank --show-nonprinting",
				".numberNonblank().showNonprinting()");
	}

	private static ConfigCase getNumbersNoneblankAndShowEndsConfig() {
		return new ConfigCase(
				"numbersNoneblankAndShowEnds",
				"--number-nonblank --show-ends",
				".numberNonblank().showEnds()");
	}

	private static ConfigCase getSqueezeBlankAndShowTabsConfig() {
		return new ConfigCase(
				"squeezeBlankAndShowTabs",
				"--squeeze-blank --show-tabs",
				".squeezeBlank().showTabs()");
	}

	private static ConfigCase getSqueezeBlankAndShowNonprintingConfig() {
		return new ConfigCase(
				"squeezeBlankAndShowNonprinting",
				"--squeeze-blank --show-nonprinting",
				".squeezeBlank().showNonprinting()");
	}

	private static ConfigCase getSqueezeBlankAndShowEndsConfig() {
		return new ConfigCase(
				"squeezeBlankAndShowEnds",
				"--squeeze-blank --show-ends",
				".squeezeBlank().showEnds()");
	}
	
	private static ConfigCase getAllConfig() {
		return new ConfigCase(
				"all",
				"--number-nonblank --show-ends --number --squeeze-blank --show-tabs --show-nonprinting",
				".numberNonblank().showEnds().number().squeezeBlank().showTabs().showNonprinting()");
	}
}
