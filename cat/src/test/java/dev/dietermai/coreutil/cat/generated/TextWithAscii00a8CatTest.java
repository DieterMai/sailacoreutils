package dev.dietermai.coreutil.cat.generated;


import java.nio.file.Path;

import org.junit.jupiter.api.Test;

import dev.dietermai.coreutil.cat.Cat;
import dev.dietermai.coreutil.cat.CatResult;
import dev.dietermai.coreutil.cat.TestUtil;
import dev.dietermai.coreutil.cat.testutil.ReadFile;

class TextWithAscii00a8CatTest {

    @Test
    void test_defaultConfig_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a8.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00a8_default.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

}
