package dev.dietermai.coreutil.cat;

import dev.dietermai.coreutil.cat.charsupplier.CharSupplier;

public record CatRecord(boolean numberNonblank, boolean showEnds, boolean number, boolean squeezeBlank,
		boolean showTabs, boolean showNonprinting, CharSupplier charSupplier) {
	
	public static CatRecord of(CharSupplier supplier) {
		return new CatRecord(false, false, false, false, false, false, supplier); // TODO
	}
	
	public static CatRecord of(CharSupplier supplier, boolean numberNonblank, boolean showEnds, boolean number, boolean squeezeBlank,
			boolean showTabs, boolean showNonprinting) {
		return new CatRecord(numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting, supplier); // TODO
	}
}
