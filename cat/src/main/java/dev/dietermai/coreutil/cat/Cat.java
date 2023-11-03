package dev.dietermai.coreutil.cat;

public class Cat {

	public static CatBuilder of(String text) {
		return CatBuilder.of(TextLineSupplier.of(text));
	}

	public static CatBuilder of(LineSupplier supplier) {
		return CatBuilder.of(supplier);
	}
	
	
	public static CatResult execute(CatRecord record) {
		return CatExecuter.execute(record);
	}
	
}
