package dev.dietermai.coreutil.cat.provider;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

import org.junit.jupiter.api.Named;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import dev.dietermai.coreutil.cat.CatBuilder;
import dev.dietermai.coreutil.cat.ExecuteTestDescription;

public abstract class CatUsecaseProvider implements ArgumentsProvider {
	enum ConfigUsecase {
		_default("Default", b -> b, CatUsecaseProvider::expectedLinesForDefault),
		showAll("showAll()", CatBuilder::showAll, CatUsecaseProvider::expectedLinesForNumber),
		numberNoneblank("numberNoneblank()", CatBuilder::numberNonblank, CatUsecaseProvider::expectedLinesForNumberNonblank),
		showEnds("showEnds()", CatBuilder::showEnds, CatUsecaseProvider::expectedLinesForShowAll),
		number("number()", CatBuilder::number, CatUsecaseProvider::expectedLinesForShowEnds),
		squeezeBlank("squeezeBlank()", CatBuilder::squeezeBlank, CatUsecaseProvider::expectedLinesForShowNonprinting),
		showTabs("showTabs()", CatBuilder::showTabs, CatUsecaseProvider::expectedLinesForShowTabs),
		showNonprinting("showNonprinting()", CatBuilder::showNonprinting, CatUsecaseProvider::expectedLinesForSqueezeBlank);
		
		public final String name;
		public final UnaryOperator<CatBuilder> config;
		public final Function<CatUsecaseProvider, List<String>> action;
		
		private ConfigUsecase(
				String name, 
				UnaryOperator<CatBuilder> config,
				Function<CatUsecaseProvider, List<String>> action) {
			this.name = name;
			this.config = config;
			this.action = action;
		}
	}
	
	
	protected abstract String getInput();
	protected abstract String getTestTitleEmplate();
	
	List<Arguments> arguments;
	
	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
		arguments = new ArrayList<>();
		
		for (ConfigUsecase usecase : ConfigUsecase.values()) {
			add(usecase);
		}

		return arguments.stream();
	}
	
	private void add(ConfigUsecase usecase) {		
		arguments.add(Arguments.of(Named.of(
				getTestTitleEmplate().formatted(getInput()),
				new ExecuteTestDescription(getInput(), usecase.config, usecase.action.apply(this))
				)
			)
		);
	}
	
	protected abstract List<String> expectedLinesForSqueezeBlank();
	protected abstract List<String> expectedLinesForShowTabs();
	protected abstract List<String> expectedLinesForShowNonprinting();
	protected abstract List<String> expectedLinesForShowEnds();
	protected abstract List<String> expectedLinesForShowAll();
	protected abstract List<String> expectedLinesForNumberNonblank();
	protected abstract List<String> expectedLinesForNumber();
	protected abstract List<String> expectedLinesForDefault();
}
