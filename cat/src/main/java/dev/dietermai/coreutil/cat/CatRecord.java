package dev.dietermai.coreutil.cat;

public record CatRecord(boolean numberNonblank, boolean showEnds, boolean number, boolean squeezeBlank,
		boolean showTabs, boolean showNonprinting, LineSupplier supplier) {
	
	public static CatRecord ofFile(LineSupplier supplier) {
		return new CatRecord(false, false, false, false, false, false, supplier); // TODO
	}
	
	public static CatRecord ofFile(LineSupplier supplier, boolean numberNonblank, boolean showEnds, boolean number, boolean squeezeBlank,
			boolean showTabs, boolean showNonprinting) {
		return new CatRecord(numberNonblank, showEnds, number, squeezeBlank, showTabs, showNonprinting, supplier); // TODO
	}
}
