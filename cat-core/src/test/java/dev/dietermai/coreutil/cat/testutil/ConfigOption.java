package dev.dietermai.coreutil.cat.testutil;

import java.util.function.UnaryOperator;

import dev.dietermai.coreutil.cat.CatBuilder;

// TODO remove "method"
public record ConfigOption(String name, String argument, UnaryOperator<CatBuilder> applier) implements Comparable<ConfigOption> {
	@Override
	public int compareTo(ConfigOption o) {
		return name.compareTo(o.name);
	}
	
	public String Name() {
		return Character.toUpperCase(name.charAt(0))+ name.substring(1);
	}
	
	public CatBuilder apply(CatBuilder builder) {
		return applier.apply(builder);
	}
}
