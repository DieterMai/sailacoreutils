package dev.dietermai.coreutil.cat.generate.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public record Execution(String name, String type, String method, UnaryOperator<String> creator) {
	public static List<Execution> getExecutions() {
		List<Execution> executions = new ArrayList<>();

		executions.add(new Execution("result", "CatResult", ".execute()", s -> "CatResult.of(%s)".formatted(s)));
		executions.add(new Execution("string", "String", ".executeToString()", UnaryOperator.identity()));

		return executions;
	}
	
	public String Name() {
		return Character.toUpperCase(name.charAt(0))+ name.substring(1);
	}
}
