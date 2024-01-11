package dev.dietermai.coreutil.cat.testutil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class OutputFileProvider {
	private static final Path OUTPUT_DIR = Path.of("../cat-testdata/output");
	
	public static String getTextFor(InputCase input, ConfigCase config) throws IOException {
		createOutputDir();
		Path path = outputPath(input, config);
		if(!Files.exists(path)) {
			generateOutputFile(input, config, path);
		}
		return ReadFile.readFile(path);
	}
	
	private static Path outputPath(InputCase input, ConfigCase config) {
		return OUTPUT_DIR.resolve(config.Name()+"_"+input.Name()+".txt");
	}
	
	private static void generateOutputFile(InputCase input, ConfigCase config, Path path) {
		String inputFileName = input.name()+".txt";
		String outputFileName = path.getFileName().toString();
		try {
			BashCommandExecutor.execute(OUTPUT_DIR, "cat %3$s ../input/%1$s > %2$s".formatted(inputFileName, outputFileName, config.arguments()));
		} catch (Throwable e) {
			new RuntimeException(e);
		}
	}
	
	private static void createOutputDir() throws IOException {
		if(!Files.exists(OUTPUT_DIR)) {
			Files.createDirectory(OUTPUT_DIR);
		}
	}
}
