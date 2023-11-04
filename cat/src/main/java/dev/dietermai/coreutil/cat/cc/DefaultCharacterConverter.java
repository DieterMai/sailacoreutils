package dev.dietermai.coreutil.cat.cc;

public class DefaultCharacterConverter implements CharacterConverter {
	@Override
	public String convert(char c) {
		return Character.toString(c);
	}
}
