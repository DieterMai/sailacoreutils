package dev.dietermai.coreutil.cat.cc;

import dev.dietermai.coreutil.cat.CatRecord;

public class CharacterConverterFactory {
	public static CharacterConverter get(CatRecord catRecord) {
		if(catRecord.showTabs()) {
			return new ShowTabsCharacterConverter();
		}
		
		return new DefaultCharacterConverter();
	}
}
