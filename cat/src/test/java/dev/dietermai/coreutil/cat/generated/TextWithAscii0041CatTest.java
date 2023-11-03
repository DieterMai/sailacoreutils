package dev.dietermai.coreutil.cat.generated;


import java.nio.file.Path;

import org.junit.jupiter.api.Test;

import dev.dietermai.coreutil.cat.Cat;
import dev.dietermai.coreutil.cat.CatResult;
import dev.dietermai.coreutil.cat.LineSupplier;
import dev.dietermai.coreutil.cat.TestUtil;
import dev.dietermai.coreutil.cat.TextLineSupplier;
import dev.dietermai.coreutil.cat.testutil.ReadFile;

class TextWithAscii0041CatTest {

    @Test
    void test_defaultConfig_LineSupplier() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0041.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0041_default.txt"));
        LineSupplier supplier = new TextLineSupplier(input);
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(supplier).execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void test_defaultConfig_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0041.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0041_default.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

}
