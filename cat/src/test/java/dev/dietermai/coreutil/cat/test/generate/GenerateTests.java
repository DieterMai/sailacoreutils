package dev.dietermai.coreutil.cat.test.generate;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
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

	private List<TestCaseRecord> generateTestRecords() throws Throwable {
		List<TestCaseRecord> records = new ArrayList<>();
		for (InputCase input : InputCases.get()) {
			for (ConfigCase config : ConfigCases.get()) {
				records.add(new TestCaseRecord(input, config, null));
			}
		}
		return records;
	}

	private void generateConfigTests(List<TestCaseRecord> cases) throws Throwable {
		var groupted = cases.stream().collect(Collectors.groupingBy(testCase -> testCase.config()));

		for (ConfigCase config : groupted.keySet()) {
			generateConfigTest(config, groupted.get(config));
		}
	}

	private void generateConfigTest(ConfigCase config, List<TestCaseRecord> testRecords) throws Throwable {
		Path javaFile = testDirectory.resolve(Captialize(config.name()) + "CatTest.java");

		try (PrintWriter printWriter = openPrinter(javaFile)) {
			System.out.println("Generate " + javaFile);
			TestClassPerConfigGenerator testClassGenerator = new TestClassPerConfigGenerator(config, testRecords);
			testClassGenerator.generate(printWriter);
		}

	}

	private PrintWriter openPrinter(Path file) throws IOException {
		return new PrintWriter(FilesUtil.createFileWriter(file.toString()));
	}
	
	private String Captialize(String s) {
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}

}
