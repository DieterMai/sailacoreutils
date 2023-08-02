package dev.dietermai.coreutil.cat;

public class Cat {

	public static CatBuilder of(String path) {
		return CatBuilder.ofFile(path);
	}
	
}
