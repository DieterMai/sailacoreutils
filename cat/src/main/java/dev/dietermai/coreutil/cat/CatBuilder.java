package dev.dietermai.coreutil.cat;

import java.io.InputStream;
import java.util.List;

public class CatBuilder {
	private final List<String> files;
	private final InputStream input;
	private boolean numberNoneblank;
	private boolean showEnds;
	private boolean number;
	private boolean squeezeBlank;
	private boolean showTabs;
	private boolean showNoneprinting;
	
	private CatBuilder(List<String> files) {
		this.files = files;
		this.input = null;
	}
	
	public static CatBuilder ofFile(String file) {
		return new CatBuilder(List.of(file));
	}
	
	public CatBuilder A() {
		return showAll();
	}
	
	public CatBuilder showAll() {
		return showNonprinting().showEnds().showTabs();
	}

	public CatBuilder b() {
		return numberNoneblank();
	}

	public CatBuilder numberNoneblank() {
		numberNoneblank = true;
		return this;
	}

	public CatBuilder e() {
		return showNonprinting().showEnds();
	}

	public CatBuilder E() {
		return showEnds();
	}

	public CatBuilder showEnds() {
		showEnds = true;
		return this;
	}

	public CatBuilder n() {
		return number();
	}

	public CatBuilder number() {
		number = true;
		return this;
	}

	public CatBuilder s() {
		return squeezeBlank();
	}

	public CatBuilder squeezeBlank() {
		squeezeBlank = true;
		return this;
	}

	public CatBuilder t() {
		return showNonprinting().showTabs();
	}

	public CatBuilder T() {
		return showTabs();
	}
	
	public CatBuilder showTabs() {
		showTabs = true;
		return this;
	}

	public CatBuilder u() {
		return this;
	}

	public CatBuilder v() {
		showNoneprinting = true;
		return this;
	}

	public CatBuilder showNonprinting() {
		showNoneprinting = true;
		return this;
	}

	public CatRecord get() {
		return new CatRecord(numberNoneblank, showEnds, number, squeezeBlank, showTabs, showNoneprinting, files, input);
	}
}
