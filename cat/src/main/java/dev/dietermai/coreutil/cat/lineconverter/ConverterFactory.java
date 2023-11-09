package dev.dietermai.coreutil.cat.lineconverter;

import java.util.ArrayList;
import java.util.List;

import dev.dietermai.coreutil.cat.CatRecord;

public class ConverterFactory {
	public List<ILineConverter> createConverterList(CatRecord record){
		List<ILineConverter> converters = new ArrayList<>();
		
		if (record.showNonprinting()) {
			converters.add(new ShowNonprintingConverter());
		}
		if (record.showTabs()) {
			converters.add(new ShowTabsConverter());
		}
		if (record.showEnds()) {
			converters.add(new ShowEndsConverter());
		}
		if (record.number()) {
			converters.add(new NumberConverter());
		}
		if (record.numberNonblank()) {
			converters.add(new NumberNonblankConverter());
		}
		if (record.squeezeBlank()) {
			converters.add(new SqueezeBlankConverter());
		}
		
		return List.copyOf(converters);
	}
}
