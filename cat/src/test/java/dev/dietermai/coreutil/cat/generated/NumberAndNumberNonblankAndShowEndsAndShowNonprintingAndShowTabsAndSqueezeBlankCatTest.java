package dev.dietermai.coreutil.cat.generated;


import java.nio.file.Path;

import org.junit.jupiter.api.Test;

import dev.dietermai.coreutil.cat.Cat;
import dev.dietermai.coreutil.cat.CatResult;
import dev.dietermai.coreutil.cat.TestUtil;
import dev.dietermai.coreutil.cat.testutil.ReadFile;

class NumberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlankCatTest {

    @Test
    void testWithInputBlankLineSpaces_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/BlankLineSpaces.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/BlankLineSpaces_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputBlankLineTabs_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/BlankLineTabs.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/BlankLineTabs_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputEmptyLine_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/EmptyLine.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/EmptyLine_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputSimpleLine_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/SimpleLine.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/SimpleLine_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputSimpleMultiLineText_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/SimpleMultiLineText.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/SimpleMultiLineText_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithEmptyTrailingLine_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithEmptyTrailingLine.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithEmptyTrailingLine_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithBlankTrailingLineSpaces_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithBlankTrailingLineSpaces.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithBlankTrailingLineSpaces_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithBlankTrailingLineTabs_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithBlankTrailingLineTabs.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithBlankTrailingLineTabs_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithMultipleEmptyLines_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithMultipleEmptyLines.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithMultipleEmptyLines_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithMultipleSegmentsOfBlankLines_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithMultipleSegmentsOfBlankLines.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithMultipleSegmentsOfBlankLines_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWitTextWithNoTrailingEmptyLinehEmptyTrailingLine_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWitTextWithNoTrailingEmptyLinehEmptyTrailingLine.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWitTextWithNoTrailingEmptyLinehEmptyTrailingLine_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0000_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0000.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0000_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0001_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0001.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0001_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0002_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0002.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0002_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0003_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0003.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0003_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0004_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0004.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0004_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0005_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0005.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0005_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0006_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0006.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0006_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0007_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0007.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0007_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0008_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0008.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0008_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0009_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0009.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0009_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii000a_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii000a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii000a_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii000b_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii000b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii000b_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii000c_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii000c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii000c_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii000d_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii000d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii000d_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii000e_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii000e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii000e_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii000f_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii000f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii000f_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0010_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0010.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0010_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0011_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0011.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0011_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0012_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0012.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0012_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0013_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0013.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0013_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0014_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0014.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0014_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0015_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0015.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0015_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0016_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0016.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0016_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0017_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0017.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0017_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0018_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0018.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0018_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0019_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0019.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0019_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii001a_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii001a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii001a_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii001b_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii001b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii001b_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii001c_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii001c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii001c_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii001d_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii001d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii001d_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii001e_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii001e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii001e_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii001f_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii001f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii001f_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0020_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0020.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0020_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0021_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0021.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0021_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0022_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0022.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0022_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0023_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0023.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0023_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0024_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0024.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0024_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0025_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0025.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0025_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0026_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0026.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0026_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0027_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0027.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0027_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0028_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0028.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0028_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0029_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0029.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0029_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii002a_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii002a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii002a_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii002b_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii002b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii002b_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii002c_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii002c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii002c_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii002d_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii002d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii002d_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii002e_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii002e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii002e_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii002f_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii002f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii002f_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0030_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0030.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0030_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0031_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0031.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0031_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0032_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0032.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0032_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0033_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0033.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0033_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0034_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0034.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0034_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0035_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0035.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0035_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0036_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0036.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0036_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0037_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0037.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0037_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0038_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0038.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0038_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0039_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0039.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0039_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii003a_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii003a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii003a_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii003b_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii003b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii003b_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii003c_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii003c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii003c_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii003d_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii003d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii003d_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii003e_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii003e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii003e_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii003f_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii003f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii003f_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0040_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0040.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0040_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0041_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0041.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0041_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0042_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0042.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0042_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0043_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0043.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0043_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0044_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0044.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0044_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0045_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0045.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0045_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0046_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0046.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0046_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0047_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0047.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0047_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0048_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0048.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0048_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0049_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0049.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0049_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii004a_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii004a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii004a_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii004b_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii004b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii004b_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii004c_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii004c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii004c_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii004d_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii004d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii004d_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii004e_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii004e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii004e_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii004f_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii004f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii004f_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0050_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0050.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0050_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0051_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0051.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0051_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0052_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0052.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0052_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0053_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0053.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0053_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0054_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0054.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0054_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0055_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0055.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0055_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0056_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0056.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0056_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0057_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0057.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0057_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0058_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0058.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0058_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0059_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0059.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0059_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii005a_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii005a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii005a_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii005b_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii005b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii005b_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii005c_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii005c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii005c_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii005d_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii005d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii005d_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii005e_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii005e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii005e_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii005f_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii005f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii005f_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0060_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0060.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0060_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0061_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0061.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0061_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0062_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0062.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0062_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0063_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0063.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0063_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0064_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0064.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0064_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0065_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0065.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0065_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0066_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0066.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0066_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0067_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0067.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0067_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0068_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0068.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0068_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0069_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0069.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0069_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii006a_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii006a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii006a_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii006b_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii006b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii006b_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii006c_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii006c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii006c_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii006d_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii006d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii006d_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii006e_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii006e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii006e_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii006f_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii006f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii006f_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0070_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0070.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0070_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0071_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0071.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0071_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0072_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0072.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0072_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0073_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0073.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0073_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0074_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0074.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0074_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0075_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0075.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0075_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0076_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0076.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0076_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0077_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0077.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0077_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0078_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0078.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0078_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0079_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0079.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0079_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii007a_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii007a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii007a_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii007b_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii007b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii007b_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii007c_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii007c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii007c_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii007d_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii007d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii007d_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii007e_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii007e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii007e_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii007f_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii007f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii007f_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0080_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0080.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0080_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0081_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0081.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0081_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0082_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0082.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0082_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0083_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0083.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0083_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0084_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0084.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0084_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0085_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0085.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0085_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0086_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0086.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0086_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0087_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0087.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0087_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0088_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0088.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0088_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0089_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0089.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0089_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii008a_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii008a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii008a_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii008b_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii008b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii008b_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii008c_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii008c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii008c_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii008d_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii008d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii008d_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii008e_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii008e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii008e_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii008f_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii008f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii008f_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0090_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0090.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0090_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0091_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0091.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0091_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0092_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0092.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0092_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0093_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0093.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0093_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0094_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0094.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0094_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0095_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0095.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0095_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0096_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0096.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0096_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0097_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0097.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0097_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0098_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0098.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0098_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0099_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0099.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii0099_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii009a_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii009a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii009a_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii009b_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii009b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii009b_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii009c_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii009c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii009c_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii009d_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii009d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii009d_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii009e_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii009e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii009e_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii009f_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii009f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii009f_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a0_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a0.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00a0_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a1_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a1.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00a1_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a2_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a2.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00a2_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a3_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a3.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00a3_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a4_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a4.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00a4_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a5_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a5.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00a5_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a6_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a6.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00a6_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a7_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a7.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00a7_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a8_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a8.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00a8_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a9_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a9.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00a9_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00aa_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00aa.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00aa_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ab_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ab.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00ab_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ac_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ac.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00ac_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ad_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ad.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00ad_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ae_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ae.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00ae_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00af_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00af.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00af_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b0_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b0.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00b0_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b1_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b1.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00b1_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b2_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b2.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00b2_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b3_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b3.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00b3_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b4_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b4.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00b4_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b5_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b5.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00b5_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b6_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b6.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00b6_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b7_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b7.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00b7_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b8_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b8.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00b8_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b9_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b9.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00b9_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ba_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ba.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00ba_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00bb_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00bb.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00bb_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00bc_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00bc.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00bc_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00bd_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00bd.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00bd_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00be_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00be.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00be_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00bf_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00bf.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00bf_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c0_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c0.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00c0_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c1_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c1.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00c1_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c2_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c2.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00c2_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c3_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c3.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00c3_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c4_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c4.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00c4_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c5_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c5.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00c5_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c6_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c6.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00c6_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c7_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c7.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00c7_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c8_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c8.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00c8_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c9_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c9.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00c9_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ca_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ca.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00ca_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00cb_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00cb.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00cb_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00cc_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00cc.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00cc_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00cd_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00cd.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00cd_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ce_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ce.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00ce_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00cf_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00cf.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00cf_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d0_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d0.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00d0_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d1_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d1.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00d1_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d2_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d2.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00d2_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d3_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d3.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00d3_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d4_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d4.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00d4_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d5_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d5.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00d5_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d6_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d6.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00d6_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d7_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d7.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00d7_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d8_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d8.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00d8_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d9_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d9.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00d9_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00da_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00da.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00da_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00db_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00db.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00db_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00dc_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00dc.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00dc_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00dd_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00dd.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00dd_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00de_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00de.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00de_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00df_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00df.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00df_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e0_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e0.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00e0_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e1_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e1.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00e1_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e2_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e2.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00e2_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e3_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e3.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00e3_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e4_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e4.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00e4_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e5_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e5.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00e5_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e6_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e6.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00e6_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e7_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e7.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00e7_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e8_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e8.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00e8_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e9_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e9.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00e9_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ea_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ea.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00ea_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00eb_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00eb.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00eb_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ec_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ec.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00ec_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ed_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ed.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00ed_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ee_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ee.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00ee_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ef_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ef.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00ef_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f0_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f0.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00f0_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f1_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f1.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00f1_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f2_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f2.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00f2_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f3_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f3.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00f3_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f4_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f4.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00f4_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f5_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f5.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00f5_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f6_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f6.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00f6_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f7_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f7.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00f7_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f8_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f8.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00f8_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f9_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f9.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00f9_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00fa_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00fa.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00fa_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00fb_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00fb.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00fb_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00fc_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00fc.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00fc_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00fd_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00fd.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00fd_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00fe_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00fe.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00fe_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ff_String() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ff.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/TextWithAscii00ff_numberAndNumberNonblankAndShowEndsAndShowNonprintingAndShowTabsAndSqueezeBlank.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).number().numberNonblank().showEnds().showNonprinting().showTabs().squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

}
