package dev.dietermai.coreutil.cat.consumer;

import dev.dietermai.coreutil.cat.CatResultConsumer;

public class ToStringConsumer implements CatResultConsumer{

	private final StringBuilder sb = new StringBuilder();
	
	@Override
	public void consumeLine(String line) {
		sb.append(line);
	}

	public String getText() {
		return sb.toString();
	}

}
