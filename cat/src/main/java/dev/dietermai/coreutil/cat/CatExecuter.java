package dev.dietermai.coreutil.cat;

import java.util.Iterator;
import java.util.stream.Stream;

import dev.dietermai.coreutil.cat.consumer.ToIteratorConsumer;
import dev.dietermai.coreutil.cat.consumer.ToStringConsumer;
import dev.dietermai.coreutil.cat.consumer.ToStreamConsumer;


public class CatExecuter {
	public static String execute(CatRecord record) {
		return new ToStringConsumer(new CatExecution(record)).getText();
	}

	public static Iterator<String> iterator(CatRecord record) {
		return new ToIteratorConsumer(new CatExecution(record));
	}

	public static Stream<String> stream(CatRecord record) {
		return new ToStreamConsumer(new CatExecution(record)).stream();
	}

}
