package dev.dietermai.coreutil.cat.cc;

public class ShowTabsCharacterConverter implements CharacterConverter{

	@Override
	public String convert(char c) {
		return switch(c) {
		case '\t' -> "^I"; 
		default -> Character.toString(c);
		};
	}
}
