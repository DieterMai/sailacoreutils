package dev.dietermai.coreutil.cat;

import java.util.Iterator;
import java.util.stream.Stream;

import dev.dietermai.coreutil.cat.charsupplier.CharSupplier;
import dev.dietermai.coreutil.cat.charsupplier.StringCharSupplier;
import dev.dietermai.coreutil.cat.consumer.ToIteratorConsumer;
import dev.dietermai.coreutil.cat.consumer.ToStringConsumer;
import dev.dietermai.coreutil.cat.consumer.ToStreamConsumer;


public class CatExecuter {
	public static String execute(CatConfig record, CharSupplier charSupplier) {
		return new ToStringConsumer(new CatExecution(record, charSupplier)).getText();
	}
	
	public static String execute(CatConfig record, String input) {
		return new ToStringConsumer(new CatExecution(record, new StringCharSupplier(input))).getText();
	}

	public static Iterator<String> iterator(CatConfig record, CharSupplier charSupplier) {
		return new ToIteratorConsumer(new CatExecution(record, charSupplier));
	}
	
	public static Iterator<String> iterator(CatConfig record, String input) {
		return new ToIteratorConsumer(new CatExecution(record, new StringCharSupplier(input)));
	}

	public static Stream<String> stream(CatConfig record, CharSupplier charSupplier) {
		return new ToStreamConsumer(new CatExecution(record, charSupplier)).stream();
	}
	
	public static Stream<String> stream(CatConfig record, String input) {
		return new ToStreamConsumer(new CatExecution(record, new StringCharSupplier(input))).stream();
	}

}
