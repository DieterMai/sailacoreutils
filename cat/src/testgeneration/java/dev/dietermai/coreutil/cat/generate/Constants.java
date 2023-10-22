package dev.dietermai.coreutil.cat.generate;

import java.nio.file.Path;

public class Constants {
	public static final Path resourcesDirectory = Path.of("src/testgeneration/resources").toAbsolutePath();
	public static final Path inputDirectory = resourcesDirectory.resolve("input").toAbsolutePath();
	
}
