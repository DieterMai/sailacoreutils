package dev.dietermai.coreutil.cat.generated;


import java.nio.file.Path;

import org.junit.jupiter.api.Test;

import dev.dietermai.coreutil.cat.Cat;
import dev.dietermai.coreutil.cat.CatResult;
import dev.dietermai.coreutil.cat.LineSupplier;
import dev.dietermai.coreutil.cat.TestUtil;
import dev.dietermai.coreutil.cat.TextLineSupplier;
import dev.dietermai.coreutil.cat.testutil.ReadFile;

class TextWithAscii00b0CatTest {

    @Test
    void test_defaultConfig() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b0.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00b0_default.txt"));
        LineSupplier supplier = new TextLineSupplier(input);
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(supplier).execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

}
