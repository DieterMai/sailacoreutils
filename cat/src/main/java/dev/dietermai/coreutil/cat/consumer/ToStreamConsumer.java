package dev.dietermai.coreutil.cat.consumer;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import dev.dietermai.coreutil.cat.CatExecution;

public class ToStreamConsumer implements Spliterator<String> {
	private static final int CHARACTERISTIC = Spliterator.ORDERED | Spliterator.NONNULL | Spliterator.IMMUTABLE;
	private final CatExecution cat;

	public ToStreamConsumer(CatExecution cat) {
		this.cat = cat;
	}
	
	public Stream<String> stream(){
		return StreamSupport.stream(this, false);
	}

	@Override
	public boolean tryAdvance(Consumer<? super String> action) {
		if(cat.hasMore()) {
			action.accept(cat.nextLine());
			return true;
		}
		return false;
	}

	@Override
	public Spliterator<String> trySplit() {
		return null;
	}

	@Override
	public long estimateSize() {
		return Long.MAX_VALUE;
	}

	@Override
	public int characteristics() {
		return CHARACTERISTIC;
	}
}
