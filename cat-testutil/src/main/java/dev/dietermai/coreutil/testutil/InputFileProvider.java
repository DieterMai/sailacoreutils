package dev.dietermai.coreutil.testutil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class InputFileProvider {
	private static final Path INPUT_DIR = Path.of("../cat-testdata/input");
	
	public static String getTextFor(InputCase inputCase) throws IOException {
		Path inputPath = inputPath(inputCase);
		if(!Files.exists(inputPath)) {
			FileWriter.write(inputPath, inputCase);
		}
		return ReadFile.readFile(inputPath);
	}
	
	private static  Path inputPath(InputCase inputCase) {
		return INPUT_DIR.resolve(inputCase.name()+".txt");
	}
}
