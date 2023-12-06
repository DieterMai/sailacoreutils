package dev.dietermai.coreutil.cat.test.generate;

import java.util.List;

public record Execution(String name, String outputType, String transformer, String method) {

	public static final List<Execution> values;
	
	static {
		Execution stringExecution = new Execution("string", "String", "output", ".execute()");
		Execution iteratorExecution = new Execution("iterator", "Iterator<String>", "TestUtil.toLineIterator(output)", ".iterator()");
		Execution streamExecution = new Execution("stream", "Stream<String>", "TestUtil.toLineStream(output)", ".stream()");
		values = List.of(stringExecution, iteratorExecution, streamExecution);
	}
	
	public static List<Execution> values() {
		return values;
	}
	
	public String Name() {
		return Character.toUpperCase(name.charAt(0))+ name.substring(1);
	}
}
