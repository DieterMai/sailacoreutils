package dev.dietermai.coreutil.cat.provider;

import java.util.function.UnaryOperator;

import dev.dietermai.coreutil.cat.CatBuilder;

public enum ConfigUsecase {

	_default("Default", b -> b),
	showAll("showAll()", CatBuilder::showAll),
	numberNoneblank("numberNoneblank()", CatBuilder::numberNonblank),
	showEnds("showEnds()", CatBuilder::showEnds),
	number("number()", CatBuilder::number),
	squeezeBlank("squeezeBlank()", CatBuilder::squeezeBlank),
	showTabs("showTabs()", CatBuilder::showTabs),
	showNonprinting("showNonprinting()", CatBuilder::showNonprinting);
	
	public final String name;
	public final UnaryOperator<CatBuilder> config;
	
	private ConfigUsecase(String name, UnaryOperator<CatBuilder> config) {
		this.name = name;
		this.config = config;
	}
}
