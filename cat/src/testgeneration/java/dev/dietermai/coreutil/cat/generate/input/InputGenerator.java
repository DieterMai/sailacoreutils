package dev.dietermai.coreutil.cat.generate.input;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;

import dev.dietermai.coreutil.cat.generate.FilesUtil;

public class InputGenerator {
	public static void main(String[] args) throws Throwable {
		new InputGenerator().run();
	}
	
	final Path resourcesDirectory = Path.of(".", "src/testgeneration/resources").toAbsolutePath();
	final Path inputDirectory = resourcesDirectory.resolve("input").toAbsolutePath();
	

	private void run() throws IOException {
		System.out.println("Start with input generation");
		
		setupDirectoryStructure();
		generatesInputFiles();
		
		System.out.println("Done with input generation");
	}
	
	private void setupDirectoryStructure() {
		FilesUtil.createDir(resourcesDirectory);
		FilesUtil.deleteDir(inputDirectory);
		FilesUtil.createDir(inputDirectory);
	}
	
	private void generatesInputFiles() throws IOException {
		for(InputCase inputCase : InputCases.get()) {
			generateInputFile(inputCase);
		}
	}

	private void generateInputFile(InputCase inputCase) throws IOException {
		Path inputFile = inputDirectory.resolve(inputCase.name()+".txt");
		try (PrintWriter printWriter = openPrinter(inputFile)) {
			System.out.println("Print file for input case "+inputCase.name());
			printWriter.print(inputCase.text());
		}
	}
	
	private PrintWriter openPrinter(Path file) throws IOException {
		return new PrintWriter(FilesUtil.createFileWriter(file.toString()));
	}
}
