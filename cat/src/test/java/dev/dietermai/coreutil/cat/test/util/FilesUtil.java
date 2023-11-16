package dev.dietermai.coreutil.cat.test.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;

public class FilesUtil {
	public static void createDir(Path path) {
		if (!Files.exists(path)) {
			toRuntimeException(() -> Files.createDirectories(path));
		}
	}

	public static void deleteDir(Path dir) {
		if (Files.exists(dir)) {
			toRuntimeException(
				() -> Files.walk(dir).sorted(Comparator.reverseOrder()).map(Path::toFile).forEach(File::delete));
		}
	}
	
	public static FileWriter createFileWriter(String s) throws IOException {
		return new FileWriter(s);
	}

	interface IoMethod<T> {
		T invoke() throws IOException;
	}

	interface IoVoidMethod {
		void invoke() throws IOException;
	}

	private static <T> T toRuntimeException(IoMethod<T> method) {
		try {
			return method.invoke();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private static void toRuntimeException(IoVoidMethod method) {
		try {
			method.invoke();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
