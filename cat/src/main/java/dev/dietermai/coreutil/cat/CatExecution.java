package dev.dietermai.coreutil.cat;

import dev.dietermai.coreutil.cat.charsupplier.CharSupplier;
import dev.dietermai.coreutil.cat.lineconverter.ShowEndsConverter;
import dev.dietermai.coreutil.cat.lineconverter.ShowNonprintingConverter;
import dev.dietermai.coreutil.cat.lineconverter.ShowTabsConverter;

class CatExecution {
	private final CatRecord record;
	
	private int number = 1;
	

	CatExecution(CatRecord record) {
		this.record = record;
	}

	CatResult run() {
		CharSupplier charSupplier = record.charSupplier();
		String output = toText(charSupplier);
		return CatResult.of(output);
	}


	private String toText(CharSupplier charSupplier) {
		StringBuilder output = new StringBuilder();
		
		while(charSupplier.hasNext()) {
			String line = processLine(getNextRawLine(charSupplier));
			output.append(line);
		}
		
		
		return output.toString();
	}
	
	private String getNextRawLine(CharSupplier charSupplier) {
		StringBuilder sb = new StringBuilder();
		
		while(charSupplier.hasNext()) {
			char c = charSupplier.next();
			sb.append(c);
			if(c == '\n') {
				break;
			}
		}
		
		return sb.toString();
	}
	
	private String processLine(String rawLine) {
		String line = rawLine;
		String end = "";
//		if(line.endsWith("\n")) {
//			line = line.substring(0, line.length()-1);
//			end = "\n";
//		}
		
		line = handleConversions(line);
		
//		line += end;
		return line;
	}

	
	private String handleConversions(String line) {
		
		String outputLine = line;
		if(record.showNonprinting()) {
			outputLine = new ShowNonprintingConverter().convert(outputLine);
		}
		if(record.showTabs()) {
			outputLine = new ShowTabsConverter().convert(outputLine);
		}
		if(record.showEnds()) {
			outputLine = new ShowEndsConverter().convert(outputLine);
		}
		

		return outputLine;
	}

	private String handleNumbering(String formatted, String original) {
		if(record.numberNonblank()) {
			if(!formatted.isEmpty() || original.endsWith("\r")) {
				formatted = "%1$ 6d\t%2$s".formatted(number++, formatted);
			}
		}else if(record.number()) {
			formatted = "%1$ 6d\t%2$s".formatted(number++, formatted);
		}
		return formatted;
	}
}
