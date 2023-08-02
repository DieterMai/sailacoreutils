package dev.dietermai.coreutil.cat;

import java.io.InputStream;
import java.util.List;

public record CatRecord(boolean numberNonblank, boolean showEnds, boolean number, boolean squeezeBlank,
		boolean showTabs, boolean showNonprinting, List<String> file, InputStream input) {
	
	public static CatRecord ofFile(String file) {
		return new CatRecord(false, false, false, false, false, false, List.of(file), null);
	}
}
