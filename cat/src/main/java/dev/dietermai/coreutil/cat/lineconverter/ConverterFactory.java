package dev.dietermai.coreutil.cat.lineconverter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

import dev.dietermai.coreutil.cat.CatRecord;

public class ConverterFactory {
	public List<ILineConverter> createConverterList(CatRecord record){
		List<ILineConverter> converters = new ArrayList<>();
		
		add(converters, record::squeezeBlank, SqueezeBlankConverter::new);
		add(converters, record::showNonprinting, ShowNonprintingConverter::new);
		add(converters, record::showTabs, ShowTabsConverter::new);
		add(converters, record::numberNonblank, NumberNonblankConverter::new);
		add(converters, record::showEnds, ShowEndsConverter::new);
		add(converters, () -> record.number() && !record.numberNonblank(), NumberConverter::new);
		
		return List.copyOf(converters);
	}
	
	private void add(List<ILineConverter> converters, BooleanSupplier condition, Supplier<ILineConverter> supplier) {
		if(condition.getAsBoolean()) {
			converters.add(supplier.get());
		}
	}
}
