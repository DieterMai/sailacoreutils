package dev.dietermai.coreutil.cat.testutil;

import java.nio.file.Path;
import java.util.Arrays;

public class BashCommandExecutor {

	public static void execute(Path wd, String shCommand) throws Throwable {
		ProcessBuilder builder = new ProcessBuilder();
		
		
		String[] args = new String[3];
		args[0] = "C:\\Program Files\\Git\\usr\\bin\\bash.exe";
		args[1] = "-c";
		args[2] = shCommand;
		
		System.out.println("Executing: "+Arrays.toString(args));
		
		builder.command(args);
		builder.directory(wd.toFile());
		
		var process = builder.start();
		process.waitFor();
		int val = process.exitValue();
		if(val != 0) {
			System.err.println("Exit value was "+val);
		}
	}
	
}
