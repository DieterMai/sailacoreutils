package dev.dietermai.coreutil.cat;

public class CatExecuter {
	public static CatResult execute(CatRecord record) {
		return new CatExecution(record).run();
	}

	public static String executeToString(CatRecord record) {
		return new CatExecution(record).run().stdout();
	}
}
