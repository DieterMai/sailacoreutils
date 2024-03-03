package dev.dietermai.coreutil.cat;

import java.util.Iterator;
import java.util.stream.Stream;

import dev.dietermai.coreutil.cat.charsupplier.CharSupplier;

public class CatBuilder {
	private boolean numberNoneblank;
	private boolean showEnds;
	private boolean number;
	private boolean squeezeBlank;
	private boolean showTabs;
	private boolean showNoneprinting;

	private CatBuilder() {
	}
	
	public static CatBuilder of() {
		return new CatBuilder();
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

	public CatConfig get() {
		return new CatConfig(numberNoneblank, showEnds, number, squeezeBlank, showTabs, showNoneprinting);
	}

	public String execute(CharSupplier charSupplier) {
		return CatExecuter.execute(get(), charSupplier);
	}
	
	public String execute(String input) {
		return CatExecuter.execute(get(), input);
	}

	public Iterator<String> iterator(CharSupplier charSupplier) {
		return CatExecuter.iterator(get(), charSupplier);
	}
	
	public Iterator<String> iterator(String input) {
		return CatExecuter.iterator(get(), input);
	}

	public Stream<String> stream(CharSupplier charSupplier) {
		return CatExecuter.stream(get(), charSupplier);
	}
	
	public Stream<String> stream(String input) {
		return CatExecuter.stream(get(), input);
	}
}
