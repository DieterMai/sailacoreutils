package dev.dietermai.coreutil.cat;

public class CatBuilder {
	private final LineSupplier supplier;
	private boolean numberNoneblank;
	private boolean showEnds;
	private boolean number;
	private boolean squeezeBlank;
	private boolean showTabs;
	private boolean showNoneprinting;
	
	private CatBuilder(LineSupplier supplier) {
		this.supplier = supplier;
	}
	
	public static CatBuilder of(LineSupplier supplier) {
		return new CatBuilder(supplier);
	}
	
	public CatBuilder A() {
		return showAll();
	}
	
	public CatBuilder showAll() {
		return showNonprinting().showEnds().showTabs();
	}

	public CatBuilder b() {
		return numberNonblank();
	}

	public CatBuilder numberNonblank() {
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
		return new CatRecord(numberNoneblank, showEnds, number, squeezeBlank, showTabs, showNoneprinting, supplier);
	}

	public CatResult execute() {
		return CatExecuter.execute(get());
	}
}
