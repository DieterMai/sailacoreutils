package dev.dietermai.coreutil.cat;

import java.util.Iterator;

import dev.dietermai.coreutil.cat.consumer.ToIteratorConsumer;
import dev.dietermai.coreutil.cat.consumer.ToStringConsumer;

public class CatExecuter {
	public static String execute(CatRecord record) {
		return new ToStringConsumer(new CatExecution(record)).getText();
	}

	public static Iterator<String> iterator(CatRecord record) {
		return new ToIteratorConsumer(new CatExecution(record));
	}

}
