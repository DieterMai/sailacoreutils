package dev.dietermai.coreutil.cat.generated;


import java.nio.file.Path;

import org.junit.jupiter.api.Test;

import dev.dietermai.coreutil.cat.Cat;
import dev.dietermai.coreutil.cat.CatResult;
import dev.dietermai.coreutil.cat.TestUtil;
import dev.dietermai.coreutil.cat.testutil.ReadFile;

class TextWithAscii001eCatTest {

    @Test
    void testdefaultConfig_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii001e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii001e_default.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testshowTabsConfig_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii001e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii001e_showTabs.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testshowNonprintingConfig_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii001e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii001e_showNonprinting.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testshowEndsConfig_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii001e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii001e_showEnds.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showEnds().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

}
