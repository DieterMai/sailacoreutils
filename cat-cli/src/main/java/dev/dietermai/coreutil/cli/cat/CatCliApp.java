package dev.dietermai.coreutil.cli.cat;

import java.io.PrintWriter;

import org.apache.commons.cli.HelpFormatter;

import dev.dietermai.coreutil.cli.cat.parse.CatCommandLineParser;
import dev.dietermai.coreutil.cli.cat.parse.result.ParsingExecutionResult;
import dev.dietermai.coreutil.cli.cat.parse.result.ParsingHelpResult;
import dev.dietermai.coreutil.cli.cat.parse.result.ParsingResult;
import dev.dietermai.coreutil.cli.cat.parse.result.ParsingVersionResult;


public class CatCliApp {
	public static void main(String[] args) {
		new CatCliApp(args).start();
	}

	

	private final String[] args;

	public CatCliApp(String[] args) {
		this.args = args;
	}

	private void start() {
		try {
			CatCommandLineParser parser = new CatCommandLineParser();
			ParsingResult result = parser.parse(args);
	
			switch(result) {
			case ParsingVersionResult v -> printVersion(); 
			case ParsingHelpResult h -> printHelp();
			case ParsingExecutionResult e -> executeCat();
			}
		}catch(CatCliException e) {
			// TODO error handling
		}
	}
	
	private void executeCat() {
		System.out.println("CatCliApp.executeCat()");
	}

	private void printHelp() {
		HelpFormatter formatter = new HelpFormatter();
		PrintWriter writer = new PrintWriter(System.out);
		formatter.printUsage(writer, 100, "Usage: cat [OPTION]... [FILE]...");
		writer.close();
		
	}
	
	private void printVersion() {
		System.out.println("CatCliApp.printVersion()");
	}
}
