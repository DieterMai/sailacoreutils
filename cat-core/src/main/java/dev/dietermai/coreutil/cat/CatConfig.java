package dev.dietermai.coreutil.cat;

public record CatConfig(boolean numberNonblank, boolean showEnds, boolean number, boolean squeezeBlank,
		boolean showTabs, boolean showNonprinting) {

	public static CatConfig of(boolean numberNonblank, boolean showEnds, boolean number, boolean squeezeBlank,
			boolean showTabs, boolean showNonprinting) {
		return new CatConfig(numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
	}

	public static CatConfig of() {
		return new CatConfig(false, false, false, false, false, false);
	}
}
