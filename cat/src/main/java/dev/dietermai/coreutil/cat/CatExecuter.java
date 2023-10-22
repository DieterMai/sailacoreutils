package dev.dietermai.coreutil.cat;

public class CatExecuter {
	public static CatResult execute(CatRecord record) {
		return new CatExecution(record).run();
	}
}
