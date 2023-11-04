package dev.dietermai.coreutil.cat;

public record CatResult (int exit, String stdout, String stderr){
	public static CatResult of(int exit) {
		return new CatResult(exit, "", "");
	}

	public static CatResult of(String stdout) {
		return new CatResult(0, stdout, "");
	}
	
	public static CatResult ofError(int exit, String stderr) {
		return new CatResult(exit, "", stderr);
	}

	public static CatResult of(int exit, String stdout, String stderr) {
		return new CatResult(exit, stdout, stderr);
	}
}
