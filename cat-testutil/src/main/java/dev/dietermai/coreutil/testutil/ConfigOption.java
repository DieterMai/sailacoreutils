package dev.dietermai.coreutil.testutil;

import java.util.function.UnaryOperator;


public record ConfigOption<T>(String name, String argument, UnaryOperator<T> applier) implements Comparable<ConfigOption> {
	@Override
	public int compareTo(ConfigOption o) {
		return name.compareTo(o.name);
	}
	
	public String Name() {
		return Character.toUpperCase(name.charAt(0))+ name.substring(1);
	}
	
	public T apply(T builder) {
		return applier.apply(builder);
	}
}
