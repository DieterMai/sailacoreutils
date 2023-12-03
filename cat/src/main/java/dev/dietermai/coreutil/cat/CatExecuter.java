package dev.dietermai.coreutil.cat;

import java.util.Iterator;

import dev.dietermai.coreutil.cat.consumer.CatIteratorResult;

public class CatExecuter {
	public static CatResult execute(CatRecord record) {
		return new CatExecution(record).run();
	}

	public static String executeToString(CatRecord record) {
		return new CatExecution(record).run().stdout();
	}

//	public static Iterator<String> iterator(CatRecord record) {
//		return new CatExecution(record).runIterator(new CatIteratorResult());
//	}
}
