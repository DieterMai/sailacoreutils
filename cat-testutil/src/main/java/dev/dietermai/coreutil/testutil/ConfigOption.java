package dev.dietermai.coreutil.testutil;

public record ConfigOption(String name, String argument) implements Comparable<ConfigOption> {
	@Override
	public int compareTo(ConfigOption o) {
		return name.compareTo(o.name);
	}
	
	public String Name() {
		return Character.toUpperCase(name.charAt(0))+ name.substring(1);
	}
}
