package dev.dietermai.coreutil.cat;

import dev.dietermai.coreutil.cat.consumer.ToStringConsumer;

public class CatExecuter {
	public static String execute(CatRecord record) {
		return new ToStringConsumer(new CatExecution(record)).getText();
	}

//	public static Iterator<String> iterator(CatRecord record) {
//		return new CatExecution(record).runIterator(new CatIteratorResult());
//	}
}
