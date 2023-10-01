package dev.dietermai.coreutil.cat.generate.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import dev.dietermai.coreutil.cat.generate.ConfigCase;
import dev.dietermai.coreutil.cat.generate.FilesUtil;
import dev.dietermai.coreutil.cat.generate.input.InputCase;
import dev.dietermai.coreutil.cat.generate.output.OutputGenerator;

public class GenerateTests {

	public static void main(String[] args) throws Throwable {
		new GenerateTests().run();
	}
	
	final Path resourcesDirectory = Path.of(".", "src/test/resources").toAbsolutePath();
	final Path inputDirectory = resourcesDirectory.resolve("input").toAbsolutePath();
	final Path outputDirectory = resourcesDirectory.resolve("output").toAbsolutePath();
	final Path testDirectory = Path.of(".", "src/test/java/dev/dietermai/coreutil/cat/gentest").toAbsolutePath();

	
	private void run() throws Throwable {
		System.out.println("Start with test generation");
		
		setupDirectoryStructure();
		var cases = generateTestRecords();
		generateTests(cases);
		
		System.out.println("Done with test generation");
	}

	private void setupDirectoryStructure() {
		FilesUtil.deleteDir(testDirectory);
		FilesUtil.createDir(testDirectory);
	}

	private List<TestCaseRecord> generateTestRecords() throws Throwable {
		List<TestCaseRecord> records = new ArrayList<>();
		for(InputCase input : InputCase.values()) {
			for(ConfigCase config : ConfigCase.values()) {
				Path outputFile = OutputGenerator.outputFileFor(input, config);
				records.add(new TestCaseRecord(input, config, Files.readString(outputFile)));
			}
		}
		return records;
	}
	
	private void generateTests(List<TestCaseRecord> cases) throws IOException {
		Map<InputCase, List<TestCaseRecord>> groupted =
				cases.stream().collect(Collectors.groupingBy(testCase -> testCase.input()));
		
		for(InputCase input : groupted.keySet()) {
			generateTest(input, groupted.get(input));
		}
	}
	
	private void generateTest(InputCase input, List<TestCaseRecord> testRecords) throws IOException {
		Path javaFile = testDirectory.resolve(input.name() + "CatTest.java");
		
		try (PrintWriter printWriter = openPrinter(javaFile)) {
			System.out.println("Generate "+javaFile);
			TestClassGenerator testClassGenerator = new TestClassGenerator(input.name(), testRecords);
			testClassGenerator.generate(printWriter);
		}
		
	}
	
	private PrintWriter openPrinter(Path file) throws IOException {
		return new PrintWriter(FilesUtil.createFileWriter(file.toString()));
	}

}
