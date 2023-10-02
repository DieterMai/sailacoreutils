package dev.dietermai.coreutil.cat.generate;

import dev.dietermai.coreutil.cat.generate.input.InputGenerator;
import dev.dietermai.coreutil.cat.generate.output.OutputGenerator;
import dev.dietermai.coreutil.cat.generate.test.GenerateTests;

public class GenerateAll {
	public static void main(String[] args) throws Throwable {
		new GenerateAll().run();
	}
	
	

	private void run() throws Throwable {
		InputGenerator.main(null);
		OutputGenerator.main(null);
		GenerateTests.main(null);
	}
	
}
