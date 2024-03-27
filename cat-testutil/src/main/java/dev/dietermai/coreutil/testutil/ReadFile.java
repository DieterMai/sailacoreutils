package dev.dietermai.coreutil.testutil;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class ReadFile {

	public static String readFile(Path p) {
		try (var reader = new FileReader(p.toFile())) {
			int c;
			StringBuilder sb = new StringBuilder();
			while ((c = reader.read()) != -1) {
				sb.append((char)c);
			}
			return sb.toString();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
