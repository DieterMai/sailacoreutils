package dev.dietermai.coreutil.cat;

public class DefaultCharacterConverter {
	public String convert(char c) {
		System.out.println("DefaultCharacterConverter.convert() c: "+c+" ("+((int)c)+")");
		if(c == '\n') {
			return "";
		}
		if(c == '\0') {
			System.out.println("DefaultCharacterConverter.convert() HIT");
		}
		return Character.toString(c);
	}
}
