package dev.dietermai.coreutil.cat.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import dev.dietermai.coreutil.cat.test.util.FileWriter;
import dev.dietermai.coreutil.cat.test.util.ReadFile;

public class InputFileProvider {
	private static final Path INPUT_DIR = Path.of("./src/testgeneration/resources/input");
	
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
