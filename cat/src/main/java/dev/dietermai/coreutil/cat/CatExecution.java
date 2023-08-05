package dev.dietermai.coreutil.cat;

import java.util.ArrayList;
import java.util.List;

class CatExecution {
	private final CatRecord record;
	private int number = 1;
	private boolean pendingNewLine;

	CatExecution(CatRecord record) {
		this.record = record;
	}

	CatResult run() {
		LineSupplier supplier = record.supplier();
		
		List<String> output = new ArrayList<>();
		String line;
		while(true) {
			line = supplier.next();
			if(line == null) {
				if(pendingNewLine) {
					output.add("");
				}
				break;
			}
			
			if(addLine(output, line)) {
				break;
			}
		}
		
		return CatResult.of(output);
	}

	/**
	 * @return true if this line ended with a null character
	 */
	private boolean addLine(List<String> output, String line) {
		if (line.endsWith("\0")) {
			output.add(formatLine(line.substring(0, line.length() - 1)));
			return true;
		} else {
			output.add(formatLine(line));
			return false;
		}
	}

	private String formatLine(String line) {
		String formatted = line;
		
		// check how the line ends
		boolean trailingN = line.endsWith("\n");
		boolean trailingRN = line.endsWith("\r\n");

		// remove line ending
		if(trailingRN) {
			formatted = formatted.substring(0, formatted.length()-2);
		}else if(trailingN) {
			formatted = formatted.substring(0, formatted.length()-1);
		}

		// Add non blank numbers
		if(record.numberNonblank()) {
			if(!formatted.isBlank()) {
				formatted = "%1$ 6d  %2$s".formatted(number++, formatted);
			}
		}
		
		// remember new lines
		pendingNewLine = trailingN;
		return formatted;
	}
}
