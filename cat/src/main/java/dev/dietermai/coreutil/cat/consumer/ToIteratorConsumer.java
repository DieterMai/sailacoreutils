package dev.dietermai.coreutil.cat.consumer;

import java.util.Iterator;

import dev.dietermai.coreutil.cat.CatExecution;

public class ToIteratorConsumer implements Iterator<String> {
	private final CatExecution cat;

	public ToIteratorConsumer(CatExecution cat) {
		this.cat = cat;
	}

	@Override
	public boolean hasNext() {
		return cat.hasMore();
	}

	@Override
	public String next() {
		return cat.nextLine();
	}
}
