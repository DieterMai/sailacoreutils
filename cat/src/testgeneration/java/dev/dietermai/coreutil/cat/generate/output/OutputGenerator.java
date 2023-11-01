package dev.dietermai.coreutil.cat.generate.output;

import java.nio.file.Path;

import dev.dietermai.coreutil.cat.generate.BashCommandExecutor;
import dev.dietermai.coreutil.cat.generate.ConfigCase;
import dev.dietermai.coreutil.cat.generate.FilesUtil;
import dev.dietermai.coreutil.cat.generate.input.InputCase;
import dev.dietermai.coreutil.cat.generate.input.InputCases;

public class OutputGenerator {
	public static void main(String[] args) {
		new OutputGenerator().run();
	}
	
	public static final Path resourcesDirectory = Path.of(".", "src/testgeneration/resources").toAbsolutePath();
	public static final Path outputDirectory = resourcesDirectory.resolve("output").toAbsolutePath();

	private void run() {
		System.out.println("Start with output generation");
		
		setupDirectoryStructure();
		generateOutputFiles();
		
		System.out.println("Done with output generation");
		
	}

	private void setupDirectoryStructure() {
		FilesUtil.createDir(resourcesDirectory);
		FilesUtil.deleteDir(outputDirectory);
		FilesUtil.createDir(outputDirectory);
	}

	private void generateOutputFiles() {
		var inputCases = InputCases.get();
		int inputCount = inputCases.size();
		int configCount = ConfigCase.values().length;
		System.out.println("There are %s input cases and %s output cases. This results in %s outputs".formatted(inputCount, configCount, (inputCount*configCount)));
		
		for(InputCase input : inputCases) {
			for(ConfigCase config : ConfigCase.values()) {
				generateOutputFile(input, config);
			}
		}
	}

	private void generateOutputFile(InputCase input, ConfigCase config) {
		String inputFileName = input.name()+".txt";
		String outputFileName = outputFileNameFor(input, config);
		
		try {
			BashCommandExecutor.execute(outputDirectory, "cat %3$s ../input/%1$s > %2$s".formatted(inputFileName, outputFileName, config.options));
		} catch (Throwable e) {
			new RuntimeException(e);
		}
	}
	
	public static String outputFileNameFor(InputCase input, ConfigCase config) {
		return input.name()+"_"+config.name+".txt";
	}

	public static Path outputFileFor(InputCase input, ConfigCase config) {
		return outputDirectory.resolve(outputFileNameFor(input, config));
	}
}
