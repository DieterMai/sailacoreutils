package dev.dietermai.coreutil.cat.generate.test;

import dev.dietermai.coreutil.cat.generate.ConfigCase;
import dev.dietermai.coreutil.cat.generate.input.InputCase;

public record TestCaseRecord(InputCase input, ConfigCase config, String expected) {

}
