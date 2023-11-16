package dev.dietermai.coreutil.cat.test.generate;

import dev.dietermai.coreutil.cat.test.ConfigCase;
import dev.dietermai.coreutil.cat.test.InputCase;

public record TestCaseRecord(InputCase input, ConfigCase config, String expected) {

}
