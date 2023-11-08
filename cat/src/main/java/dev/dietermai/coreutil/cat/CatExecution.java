package dev.dietermai.coreutil.cat;

import dev.dietermai.coreutil.cat.charsupplier.CharSupplier;
import dev.dietermai.coreutil.cat.lineconverter.NumberConverter;
import dev.dietermai.coreutil.cat.lineconverter.NumberNonblankConverter;
import dev.dietermai.coreutil.cat.lineconverter.ShowEndsConverter;
import dev.dietermai.coreutil.cat.lineconverter.ShowNonprintingConverter;
import dev.dietermai.coreutil.cat.lineconverter.ShowTabsConverter;

class CatExecution {
	private final CatRecord record;
	
	private int number = 1;
	
	private ShowNonprintingConverter showNonprintingConverter = new ShowNonprintingConverter();
	private ShowTabsConverter showTabsConverter = new ShowTabsConverter();
	private ShowEndsConverter showEndsConverter = new ShowEndsConverter();
	private NumberConverter numberConverter = new NumberConverter();
	private NumberNonblankConverter numberNonblankConverter = new NumberNonblankConverter();
	

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
		line = handleConversions(line);
		return line;
	}

	
	private String handleConversions(String line) {
		String outputLine = line;
		if(record.showNonprinting()) {
			outputLine = showNonprintingConverter.convert(outputLine);
		}
		if(record.showTabs()) {
			outputLine = showTabsConverter.convert(outputLine);
		}
		if(record.showEnds()) {
			outputLine = showEndsConverter.convert(outputLine);
		}
		if(record.number()) {
			outputLine = numberConverter.convert(outputLine);
		}
		if(record.numberNonblank()) {
			outputLine = numberNonblankConverter.convert(outputLine);
		}

		return outputLine;
	}
}
