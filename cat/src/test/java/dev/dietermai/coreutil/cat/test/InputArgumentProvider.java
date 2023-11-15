package dev.dietermai.coreutil.cat.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Named;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class InputArgumentProvider implements ArgumentsProvider {

	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
		List<Arguments> arguments = new ArrayList<>();
		
		for(InputCase inputCase : InputCases.get()) {
			arguments.add(of(inputCase));
		}
		
		return arguments.stream();
	}

	private Arguments of(InputCase inputCase) {
		return Arguments.of(Named.of(inputCase.name(), inputCase));
	}
}
