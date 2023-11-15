package dev.dietermai.coreutil.cat.testutil;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;

import dev.dietermai.coreutil.cat.generate.FilesUtil;
import dev.dietermai.coreutil.cat.test.InputCase;

public class FileWriter {
	public static void write(Path path, InputCase inputCase) throws IOException{
		try (PrintWriter printWriter = openPrinter(path)) {
			printWriter.print(inputCase.text());
		}
	}
	
	private static PrintWriter openPrinter(Path file) throws IOException {
		return new PrintWriter(FilesUtil.createFileWriter(file.toString()));
	}
}
