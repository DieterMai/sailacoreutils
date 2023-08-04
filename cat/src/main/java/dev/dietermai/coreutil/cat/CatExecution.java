package dev.dietermai.coreutil.cat;

import java.util.ArrayList;
import java.util.List;

class CatExecution {
	private final CatRecord record;
	private int number = 1;
	
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
				break;
			}
			
			if(addLine(output, line)) {
				break;
			}
		}
		
		return CatResult.of(output);
	}
	
	private boolean addLine(List<String> output, String line) {
		if(line.endsWith("\0")) {
			output.add(formatLine(line.substring(0, line.length()-1)));
			return true;
		}else {
			output.add(formatLine(line));
			return false;
		}
	}
	
	private String formatLine(String line) {
		String formatted = line;
		if(record.numberNonblank()) {
			if(line.isBlank()) {
				formatted = "        %1$s".formatted("", line);				
			}else {
				formatted = "%1$ 6d  %2$s".formatted(number++, line);
			}
		}
		return formatted.stripTrailing();
	}
}
