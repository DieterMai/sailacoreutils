package dev.dietermai.coreutil.cat;

public class Cat {

	public static CatBuilder ofText(String path) {
		return CatBuilder.of(TextLineSupplier.of(path));
	}

	public static CatBuilder of(LineSupplier supplier) {
		return CatBuilder.of(supplier);
	}
	
	
	public static CatResult execute(CatRecord record) {
		return CatExecuter.execute(record);
	}
	
}
