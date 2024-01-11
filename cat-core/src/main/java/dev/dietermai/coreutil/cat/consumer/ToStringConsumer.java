package dev.dietermai.coreutil.cat.consumer;

import dev.dietermai.coreutil.cat.CatExecution;

public class ToStringConsumer{
	private final CatExecution cat;
	
	public ToStringConsumer(CatExecution cat) {
		this.cat = cat;
	}

	public String getText() {
		StringBuilder sb = new StringBuilder();
		while(!cat.isDone()) {
			addNonNullLine(sb, cat.nextLine());
		}
		return sb.toString();
	}
	
	private void addNonNullLine(StringBuilder sb, String line) {
		if(line != null) {
			sb.append(line);
		}
	}

}
