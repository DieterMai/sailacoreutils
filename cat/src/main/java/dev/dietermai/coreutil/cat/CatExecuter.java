package dev.dietermai.coreutil.cat;

public class CatExecuter {
	public static String execute(CatRecord record) {
		return new CatExecution(record).run();
	}

//	public static Iterator<String> iterator(CatRecord record) {
//		return new CatExecution(record).runIterator(new CatIteratorResult());
//	}
}
