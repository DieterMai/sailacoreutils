package dev.dietermai.coreutil.cat.test;

public record ConfigOption(String name, String argument, String method) implements Comparable<ConfigOption> {
	@Override
	public int compareTo(ConfigOption o) {
		return name.compareTo(o.name);
	}
	
	public String Name() {
		return Character.toUpperCase(name.charAt(0))+ name.substring(1);
	}
	
}
