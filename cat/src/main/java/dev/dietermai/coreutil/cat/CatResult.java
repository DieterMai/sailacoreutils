package dev.dietermai.coreutil.cat;

import java.util.List;

public record CatResult (int exit, List<String> stdout, List<String> stderr){
	public static CatResult of(int exit) {
		return new CatResult(exit, List.of(), List.of());
	}

	public static CatResult of(List<String> stdout) {
		return new CatResult(0, stdout, List.of());
	}
	
	public static CatResult ofError(int exit, List<String> stderr) {
		return new CatResult(exit, List.of(), stderr);
	}

	public static CatResult of(int exit, List<String> stdout, List<String> stderr) {
		return new CatResult(exit, stdout, stderr);
	}

}
