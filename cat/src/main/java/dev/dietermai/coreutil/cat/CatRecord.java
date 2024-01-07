package dev.dietermai.coreutil.cat;

public record CatRecord(boolean numberNonblank, boolean showEnds, boolean number, boolean squeezeBlank,
		boolean showTabs, boolean showNonprinting) {

	public static CatRecord of(boolean numberNonblank, boolean showEnds, boolean number, boolean squeezeBlank,
			boolean showTabs, boolean showNonprinting) {
		return new CatRecord(numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting);
	}

	public static CatRecord of() {
		return new CatRecord(false, false, false, false, false, false);
	}
}
