package dev.dietermai.coreutil.cat;

import java.util.List;

import dev.dietermai.coreutil.cat.charsupplier.CharSupplier;
import dev.dietermai.coreutil.cat.lineconverter.ConverterFactory;
import dev.dietermai.coreutil.cat.lineconverter.ILineConverter;

public class CatExecution {
	private final CatConfig record;
	private final CharSupplier charSupplier;
	private final List<ILineConverter> converters;

	CatExecution(CatConfig record, CharSupplier charSupplier) {
		this.record = record;
		this.charSupplier = charSupplier;
		this.converters = new ConverterFactory().createConverterList(record);
	}
	
	public boolean isDone() {
		return !hasMore();
	}
	
	public boolean hasMore() {
		return charSupplier.hasNext();
	}

	void run() {
		List<ILineConverter> converters = new ConverterFactory().createConverterList(record);

		while (charSupplier.hasNext()) {
			String line = processLine(converters, getNextRawLine(charSupplier));
			if (line == null) {
				continue;
			}
		}
	}
	
	public String nextLine() {
		String line;
		do {
			line = processLine(converters, getNextRawLine(charSupplier));
		}while(line == null);
		return line;
	}

	private String getNextRawLine(CharSupplier charSupplier) {
		StringBuilder sb = new StringBuilder();

		while (charSupplier.hasNext()) {
			char c = charSupplier.next();
			sb.append(c);
			if (c == '\n') {
				break;
			}
		}

		return sb.toString();
	}

	private String processLine(List<ILineConverter> converters, String rawLine) {
		String outputLine = rawLine;
		for (ILineConverter converter : converters) {
			outputLine = converter.convert(outputLine);
			if (outputLine == null) {
				break;
			}
		}

		return outputLine;
	}
}
