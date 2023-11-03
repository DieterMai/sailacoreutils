package dev.dietermai.coreutil.cat;

import dev.dietermai.coreutil.cat.charsupplier.CharSupplier;

public record CatRecord(boolean numberNonblank, boolean showEnds, boolean number, boolean squeezeBlank,
		boolean showTabs, boolean showNonprinting, LineSupplier supplier, CharSupplier charSupplier) {
	
	public static CatRecord of(LineSupplier supplier) {
		return new CatRecord(false, false, false, false, false, false, supplier, null); // TODO
	}
	
	public static CatRecord of(LineSupplier supplier, boolean numberNonblank, boolean showEnds, boolean number, boolean squeezeBlank,
			boolean showTabs, boolean showNonprinting) {
		return new CatRecord(numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting, supplier, null); // TODO
	}
}
