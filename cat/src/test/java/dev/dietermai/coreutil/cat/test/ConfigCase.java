package dev.dietermai.coreutil.cat.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public record ConfigCase(List<ConfigOption> options) {
	public static ConfigCase of(ConfigOption... options) {
		return new ConfigCase(List.of(options));
	}

	public ConfigCase(List<ConfigOption> options) {
		options = new ArrayList<>(options);
		Collections.sort(options);
		this.options = options;
	}

	public String Name() {
		return options.stream().map(ConfigOption::Name).collect(Collectors.joining("And"));
	}

	public String arguments() {
		return options.stream().map(ConfigOption::argument).collect(Collectors.joining(" "));
	}

	public String asCSL() {
		return options.stream().map(option -> "ConfigOptions." + option.name()).collect(Collectors.joining(", "));
	}
}
