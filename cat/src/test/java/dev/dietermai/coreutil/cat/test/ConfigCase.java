package dev.dietermai.coreutil.cat.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public record ConfigCase(String name, List<ConfigOption> options) {
	public static ConfigCase of(ConfigOption... options) {
		return new ConfigCase(null, List.of(options));
	}

	public static ConfigCase of(String name, ConfigOption... options) {
		return new ConfigCase(name, List.of(options));
	}

	public ConfigCase(String name, List<ConfigOption> options) {
		options = new ArrayList<>(options);
		Collections.sort(options);
		this.options = options;
		this.name = name;
	}

	public String name() {
		String upperCase = Name();
		return toLowerCase(upperCase);
	}

	public String Name() {
		if (name != null) {
			return toUpperCase(name);
		}

		return options.stream().map(ConfigOption::Name).collect(Collectors.joining("And"));
	}

	public String methods() {
		return options.stream().map(ConfigOption::method).collect(Collectors.joining());
	}

	public String arguments() {
		return options.stream().map(ConfigOption::argument).collect(Collectors.joining(" "));
	}

	private String toUpperCase(String s) {
		return Character.toUpperCase(s.charAt(0)) + s.substring(1);
	}

	private String toLowerCase(String s) {
		return Character.toLowerCase(s.charAt(0)) + s.substring(1);
	}

	public String asCSL() {
		return options.stream().map(option -> "ConfigOptions." + option.name()).collect(Collectors.joining(", "));
	}
}
