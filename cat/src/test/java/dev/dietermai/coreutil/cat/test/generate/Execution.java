package dev.dietermai.coreutil.cat.test.generate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record Execution(String name, String type, String method, UnaryOperator<String> creator) {
	
	public static List<Execution> getExecutions() {
		List<Execution> executions = new ArrayList<>();

		executions.add(new Execution("string", "String", ".executeToString()", UnaryOperator.identity()));
		executions.add(new Execution("iterator", "String", ".executeToString()", UnaryOperator.identity()));

		return executions;
	}
	
	public String Name() {
		return Character.toUpperCase(name.charAt(0))+ name.substring(1);
	}
}
