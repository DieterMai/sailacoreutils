package dev.dietermai.coreutil.cat;

import dev.dietermai.coreutil.cat.consumer.ToStringConsumer;

public class CatExecuter {
	public static String execute(CatRecord record) {
		ToStringConsumer consumer = new ToStringConsumer();
		new CatExecution(record, consumer).run();
		return consumer.getText();
	}

//	public static Iterator<String> iterator(CatRecord record) {
//		return new CatExecution(record).runIterator(new CatIteratorResult());
//	}
}
