package dev.dietermai.coreutil.cat.testutil;

public record InputCase(String name, String text){
	
	public String name() {
		return toLowerCase(name);
	}
	
	public String Name() {
		return toUpperCase(name);
	}
	
	private String toUpperCase(String s) {
		return Character.toUpperCase(s.charAt(0)) + s.substring(1);
	}

	private String toLowerCase(String s) {
		return Character.toLowerCase(s.charAt(0)) + s.substring(1);
	}
}
