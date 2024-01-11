package dev.dietermai.coreutil.cat;

import java.util.List;
import java.util.function.UnaryOperator;

public record ExecuteTestDescription(String input, UnaryOperator<CatBuilder> config, List<String> expectedOutput) {

}
