package dev.dietermai.coreutil.cat.generated;


import java.nio.file.Path;

import org.junit.jupiter.api.Test;

import dev.dietermai.coreutil.cat.Cat;
import dev.dietermai.coreutil.cat.CatResult;
import dev.dietermai.coreutil.cat.TestUtil;
import dev.dietermai.coreutil.cat.testutil.ReadFile;

class TextWithAscii0092CatTest {

    @Test
    void testdefaultConfig_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0092.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0092_default.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testshowTabsConfig_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0092.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0092_showTabs.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testshowNonprintingConfig_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0092.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0092_showNonprinting.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testshowEndsConfig_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0092.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0092_showEnds.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showEnds().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

}
