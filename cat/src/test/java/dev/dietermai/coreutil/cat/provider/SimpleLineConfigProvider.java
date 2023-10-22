package dev.dietermai.coreutil.cat.provider;

import java.util.List;

public class SimpleLineConfigProvider extends CatUsecaseProvider {

	public static final String INPUT = "Just some words";

	@Override
	protected String getInput() {
		return INPUT;
	}

	@Override
	protected List<String> expectedLinesForDefault() {
		return List.of("Just some words");
	}
	
	@Override
	protected String getTestTitleEmplate() {
		return "Single line with words, %s";
	}

	@Override
	protected List<String> expectedLinesForSqueezeBlank() {
		return List.of("Just some words");
	}

	@Override
	protected List<String> expectedLinesForShowTabs() {
		return List.of("Just some words");
	}

	@Override
	protected List<String> expectedLinesForShowNonprinting() {
 		return List.of("Just some words");
	}

	@Override
	protected List<String> expectedLinesForShowEnds() {
		return List.of("Just some words");
	}

	@Override
	protected List<String> expectedLinesForShowAll() {
		return List.of("Just some words");
	}

	@Override
	protected List<String> expectedLinesForNumberNonblank() {
		return List.of("     1  Just some words");
	}

	@Override
	protected List<String> expectedLinesForNumber() {
		return List.of("     1  Just some words");
	}

	


}
