package dev.dietermai.coreutil.cat;

import java.util.ArrayList;
import java.util.List;

public class CatExecuter {

	public static CatResult execute(CatRecord record) {
		LineSupplier supplier = record.supplier();
		
		List<String> output = new ArrayList<>();
		String line;
		while(true) {
			line = supplier.next();
			if(line.equals("\0")) {
				break;
			}
			output.add(line);
			if(line.endsWith("\0")) {
				break;
			}
		}
		
		return CatResult.of(output);
	}

}
