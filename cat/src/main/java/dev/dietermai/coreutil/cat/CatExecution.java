package dev.dietermai.coreutil.cat;

import java.util.List;

import dev.dietermai.coreutil.cat.charsupplier.CharSupplier;
import dev.dietermai.coreutil.cat.lineconverter.ConverterFactory;
import dev.dietermai.coreutil.cat.lineconverter.ILineConverter;

class CatExecution {
	private final CatRecord record;
	private final CatResultConsumer resultConsumer;

	CatExecution(CatRecord record, CatResultConsumer resultConsumer) {
		this.record = record;
		this.resultConsumer = resultConsumer;
	}

	void run() {
		CharSupplier charSupplier = record.charSupplier();
		List<ILineConverter> converters = new ConverterFactory().createConverterList(record);

		while (charSupplier.hasNext()) {
			String line = processLine(converters, getNextRawLine(charSupplier));
			if (line == null) {
				continue;
			}
			resultConsumer.consumeLine(line);
		}
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
