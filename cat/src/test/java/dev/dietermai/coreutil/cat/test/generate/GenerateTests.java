package dev.dietermai.coreutil.cat.test.generate;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import dev.dietermai.coreutil.cat.test.ConfigCase;
import dev.dietermai.coreutil.cat.test.ConfigCases;
import dev.dietermai.coreutil.cat.test.InputCase;
import dev.dietermai.coreutil.cat.test.InputCases;
import dev.dietermai.coreutil.cat.test.util.FilesUtil;

public class GenerateTests {

	public static void main(String[] args) throws Throwable {
		new GenerateTests().run();
	}

	final Path resourcesDirectory = Path.of(".", "src/testgeneration/resources").toAbsolutePath();
	final Path inputDirectory = resourcesDirectory.resolve("input").toAbsolutePath();
	final Path outputDirectory = resourcesDirectory.resolve("output").toAbsolutePath();
	final Path testDirectory = Path.of(".", "src/test/java/dev/dietermai/coreutil/cat/generated").toAbsolutePath();

	private void run() throws Throwable {
		System.out.println("Start with test generation");

		setupDirectoryStructure();
		var cases = generateTestRecords();
		generateConfigTests(cases);

		System.out.println("Done with test generation");
	}

	private void setupDirectoryStructure() {
		FilesUtil.deleteDir(testDirectory);
		FilesUtil.createDir(testDirectory);
	}

	private List<TestClassRecord> generateTestRecords() throws Throwable {
		List<TestClassRecord> records = new ArrayList<>();
		for (Map.Entry<String, ConfigCase> config : ConfigCases.get().entrySet()) {
			records.add(new TestClassRecord(config.getValue(), config.getKey()));
		}
		return records;
	}

	private void generateConfigTests(List<TestClassRecord> testRecords) throws Throwable {
		for (TestClassRecord testRecord : testRecords) {
			generateConfigTest(testRecord.config(), testRecord.configKey());
		}
	}

	private void generateConfigTest(ConfigCase config, String configKey) throws Throwable {
		Path javaFile = testDirectory.resolve(config.Name() + "CatTest.java");

		try (PrintWriter printWriter = openPrinter(javaFile)) {
			System.out.println("Generate " + javaFile);
			TestClassPerConfigGenerator testClassGenerator = new TestClassPerConfigGenerator(config, configKey);
			testClassGenerator.generate(printWriter);
		}

	}

	private PrintWriter openPrinter(Path file) throws IOException {
		return new PrintWriter(FilesUtil.createFileWriter(file.toString()));
	}
}
