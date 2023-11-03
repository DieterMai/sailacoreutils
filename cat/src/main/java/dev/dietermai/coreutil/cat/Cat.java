package dev.dietermai.coreutil.cat;

import dev.dietermai.coreutil.cat.charsupplier.StringCharSupplier;

public class Cat {

	public static CatBuilder of(String text) {
		return CatBuilder.of(new StringCharSupplier(text));
	}

	public static CatResult execute(CatRecord record) {
		return CatExecuter.execute(record);
	}
	
}
