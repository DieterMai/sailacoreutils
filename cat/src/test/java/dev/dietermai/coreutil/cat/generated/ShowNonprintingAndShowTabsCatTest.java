package dev.dietermai.coreutil.cat.generated;


import java.nio.file.Path;

import org.junit.jupiter.api.Test;

import dev.dietermai.coreutil.cat.Cat;
import dev.dietermai.coreutil.cat.CatResult;
import dev.dietermai.coreutil.cat.TestUtil;
import dev.dietermai.coreutil.cat.testutil.ReadFile;

class ShowNonprintingAndShowTabsCatTest {

    @Test
    void testWithInputBlankLineSpaces_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/BlankLineSpaces.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_BlankLineSpaces.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputBlankLineTabs_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/BlankLineTabs.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_BlankLineTabs.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputEmptyLine_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/EmptyLine.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_EmptyLine.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputSimpleLine_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/SimpleLine.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_SimpleLine.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputSimpleMultiLineText_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/SimpleMultiLineText.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_SimpleMultiLineText.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithEmptyTrailingLine_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithEmptyTrailingLine.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithEmptyTrailingLine.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithBlankTrailingLineSpaces_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithBlankTrailingLineSpaces.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithBlankTrailingLineSpaces.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithBlankTrailingLineTabs_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithBlankTrailingLineTabs.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithBlankTrailingLineTabs.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithMultipleEmptyLines_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithMultipleEmptyLines.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithMultipleEmptyLines.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithMultipleSegmentsOfBlankLines_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithMultipleSegmentsOfBlankLines.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithMultipleSegmentsOfBlankLines.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWitTextWithNoTrailingEmptyLinehEmptyTrailingLine_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWitTextWithNoTrailingEmptyLinehEmptyTrailingLine.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWitTextWithNoTrailingEmptyLinehEmptyTrailingLine.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0000_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0000.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0000.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0001_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0001.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0001.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0002_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0002.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0002.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0003_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0003.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0003.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0004_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0004.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0004.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0005_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0005.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0005.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0006_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0006.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0006.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0007_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0007.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0007.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0008_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0008.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0008.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0009_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0009.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0009.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii000a_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii000a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii000a.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii000b_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii000b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii000b.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii000c_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii000c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii000c.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii000d_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii000d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii000d.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii000e_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii000e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii000e.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii000f_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii000f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii000f.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0010_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0010.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0010.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0011_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0011.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0011.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0012_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0012.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0012.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0013_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0013.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0013.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0014_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0014.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0014.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0015_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0015.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0015.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0016_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0016.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0016.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0017_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0017.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0017.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0018_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0018.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0018.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0019_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0019.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0019.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii001a_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii001a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii001a.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii001b_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii001b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii001b.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii001c_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii001c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii001c.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii001d_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii001d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii001d.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii001e_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii001e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii001e.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii001f_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii001f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii001f.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0020_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0020.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0020.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0021_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0021.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0021.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0022_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0022.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0022.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0023_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0023.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0023.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0024_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0024.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0024.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0025_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0025.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0025.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0026_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0026.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0026.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0027_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0027.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0027.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0028_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0028.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0028.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0029_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0029.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0029.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii002a_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii002a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii002a.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii002b_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii002b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii002b.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii002c_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii002c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii002c.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii002d_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii002d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii002d.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii002e_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii002e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii002e.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii002f_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii002f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii002f.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0030_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0030.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0030.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0031_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0031.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0031.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0032_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0032.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0032.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0033_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0033.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0033.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0034_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0034.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0034.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0035_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0035.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0035.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0036_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0036.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0036.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0037_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0037.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0037.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0038_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0038.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0038.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0039_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0039.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0039.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii003a_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii003a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii003a.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii003b_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii003b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii003b.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii003c_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii003c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii003c.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii003d_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii003d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii003d.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii003e_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii003e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii003e.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii003f_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii003f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii003f.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0040_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0040.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0040.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0041_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0041.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0041.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0042_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0042.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0042.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0043_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0043.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0043.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0044_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0044.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0044.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0045_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0045.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0045.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0046_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0046.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0046.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0047_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0047.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0047.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0048_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0048.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0048.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0049_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0049.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0049.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii004a_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii004a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii004a.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii004b_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii004b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii004b.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii004c_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii004c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii004c.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii004d_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii004d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii004d.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii004e_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii004e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii004e.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii004f_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii004f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii004f.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0050_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0050.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0050.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0051_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0051.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0051.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0052_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0052.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0052.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0053_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0053.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0053.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0054_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0054.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0054.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0055_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0055.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0055.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0056_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0056.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0056.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0057_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0057.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0057.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0058_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0058.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0058.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0059_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0059.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0059.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii005a_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii005a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii005a.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii005b_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii005b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii005b.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii005c_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii005c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii005c.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii005d_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii005d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii005d.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii005e_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii005e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii005e.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii005f_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii005f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii005f.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0060_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0060.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0060.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0061_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0061.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0061.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0062_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0062.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0062.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0063_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0063.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0063.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0064_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0064.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0064.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0065_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0065.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0065.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0066_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0066.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0066.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0067_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0067.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0067.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0068_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0068.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0068.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0069_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0069.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0069.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii006a_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii006a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii006a.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii006b_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii006b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii006b.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii006c_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii006c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii006c.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii006d_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii006d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii006d.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii006e_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii006e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii006e.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii006f_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii006f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii006f.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0070_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0070.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0070.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0071_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0071.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0071.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0072_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0072.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0072.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0073_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0073.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0073.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0074_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0074.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0074.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0075_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0075.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0075.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0076_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0076.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0076.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0077_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0077.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0077.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0078_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0078.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0078.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0079_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0079.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0079.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii007a_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii007a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii007a.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii007b_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii007b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii007b.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii007c_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii007c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii007c.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii007d_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii007d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii007d.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii007e_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii007e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii007e.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii007f_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii007f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii007f.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0080_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0080.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0080.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0081_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0081.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0081.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0082_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0082.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0082.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0083_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0083.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0083.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0084_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0084.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0084.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0085_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0085.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0085.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0086_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0086.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0086.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0087_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0087.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0087.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0088_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0088.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0088.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0089_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0089.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0089.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii008a_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii008a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii008a.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii008b_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii008b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii008b.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii008c_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii008c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii008c.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii008d_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii008d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii008d.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii008e_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii008e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii008e.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii008f_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii008f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii008f.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0090_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0090.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0090.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0091_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0091.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0091.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0092_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0092.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0092.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0093_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0093.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0093.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0094_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0094.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0094.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0095_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0095.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0095.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0096_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0096.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0096.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0097_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0097.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0097.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0098_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0098.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0098.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0099_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0099.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0099.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii009a_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii009a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii009a.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii009b_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii009b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii009b.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii009c_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii009c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii009c.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii009d_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii009d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii009d.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii009e_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii009e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii009e.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii009f_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii009f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii009f.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a0_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a0.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00a0.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a1_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a1.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00a1.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a2_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a2.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00a2.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a3_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a3.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00a3.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a4_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a4.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00a4.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a5_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a5.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00a5.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a6_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a6.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00a6.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a7_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a7.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00a7.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a8_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a8.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00a8.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a9_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a9.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00a9.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00aa_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00aa.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00aa.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ab_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ab.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00ab.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ac_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ac.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00ac.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ad_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ad.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00ad.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ae_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ae.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00ae.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00af_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00af.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00af.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b0_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b0.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00b0.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b1_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b1.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00b1.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b2_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b2.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00b2.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b3_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b3.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00b3.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b4_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b4.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00b4.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b5_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b5.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00b5.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b6_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b6.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00b6.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b7_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b7.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00b7.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b8_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b8.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00b8.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b9_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b9.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00b9.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ba_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ba.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00ba.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00bb_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00bb.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00bb.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00bc_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00bc.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00bc.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00bd_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00bd.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00bd.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00be_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00be.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00be.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00bf_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00bf.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00bf.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c0_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c0.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00c0.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c1_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c1.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00c1.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c2_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c2.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00c2.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c3_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c3.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00c3.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c4_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c4.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00c4.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c5_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c5.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00c5.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c6_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c6.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00c6.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c7_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c7.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00c7.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c8_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c8.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00c8.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c9_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c9.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00c9.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ca_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ca.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00ca.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00cb_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00cb.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00cb.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00cc_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00cc.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00cc.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00cd_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00cd.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00cd.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ce_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ce.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00ce.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00cf_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00cf.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00cf.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d0_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d0.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00d0.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d1_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d1.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00d1.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d2_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d2.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00d2.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d3_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d3.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00d3.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d4_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d4.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00d4.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d5_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d5.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00d5.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d6_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d6.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00d6.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d7_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d7.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00d7.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d8_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d8.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00d8.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d9_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d9.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00d9.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00da_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00da.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00da.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00db_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00db.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00db.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00dc_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00dc.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00dc.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00dd_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00dd.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00dd.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00de_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00de.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00de.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00df_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00df.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00df.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e0_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e0.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00e0.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e1_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e1.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00e1.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e2_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e2.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00e2.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e3_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e3.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00e3.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e4_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e4.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00e4.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e5_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e5.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00e5.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e6_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e6.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00e6.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e7_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e7.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00e7.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e8_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e8.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00e8.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e9_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e9.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00e9.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ea_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ea.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00ea.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00eb_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00eb.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00eb.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ec_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ec.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00ec.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ed_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ed.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00ed.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ee_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ee.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00ee.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ef_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ef.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00ef.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f0_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f0.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00f0.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f1_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f1.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00f1.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f2_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f2.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00f2.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f3_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f3.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00f3.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f4_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f4.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00f4.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f5_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f5.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00f5.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f6_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f6.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00f6.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f7_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f7.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00f7.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f8_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f8.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00f8.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f9_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f9.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00f9.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00fa_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00fa.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00fa.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00fb_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00fb.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00fb.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00fc_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00fc.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00fc.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00fd_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00fd.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00fd.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00fe_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00fe.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00fe.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ff_result() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ff.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00ff.txt"));
        CatResult expected = CatResult.of(output);
        
        CatResult actual = Cat.of(input).showNonprinting().showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputBlankLineSpaces_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/BlankLineSpaces.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_BlankLineSpaces.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputBlankLineTabs_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/BlankLineTabs.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_BlankLineTabs.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputEmptyLine_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/EmptyLine.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_EmptyLine.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputSimpleLine_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/SimpleLine.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_SimpleLine.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputSimpleMultiLineText_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/SimpleMultiLineText.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_SimpleMultiLineText.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithEmptyTrailingLine_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithEmptyTrailingLine.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithEmptyTrailingLine.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithBlankTrailingLineSpaces_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithBlankTrailingLineSpaces.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithBlankTrailingLineSpaces.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithBlankTrailingLineTabs_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithBlankTrailingLineTabs.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithBlankTrailingLineTabs.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithMultipleEmptyLines_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithMultipleEmptyLines.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithMultipleEmptyLines.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithMultipleSegmentsOfBlankLines_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithMultipleSegmentsOfBlankLines.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithMultipleSegmentsOfBlankLines.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWitTextWithNoTrailingEmptyLinehEmptyTrailingLine_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWitTextWithNoTrailingEmptyLinehEmptyTrailingLine.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWitTextWithNoTrailingEmptyLinehEmptyTrailingLine.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0000_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0000.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0000.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0001_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0001.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0001.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0002_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0002.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0002.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0003_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0003.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0003.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0004_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0004.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0004.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0005_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0005.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0005.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0006_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0006.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0006.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0007_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0007.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0007.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0008_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0008.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0008.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0009_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0009.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0009.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii000a_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii000a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii000a.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii000b_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii000b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii000b.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii000c_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii000c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii000c.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii000d_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii000d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii000d.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii000e_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii000e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii000e.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii000f_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii000f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii000f.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0010_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0010.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0010.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0011_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0011.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0011.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0012_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0012.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0012.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0013_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0013.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0013.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0014_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0014.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0014.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0015_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0015.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0015.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0016_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0016.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0016.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0017_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0017.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0017.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0018_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0018.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0018.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0019_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0019.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0019.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii001a_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii001a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii001a.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii001b_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii001b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii001b.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii001c_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii001c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii001c.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii001d_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii001d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii001d.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii001e_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii001e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii001e.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii001f_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii001f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii001f.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0020_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0020.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0020.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0021_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0021.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0021.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0022_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0022.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0022.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0023_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0023.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0023.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0024_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0024.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0024.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0025_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0025.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0025.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0026_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0026.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0026.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0027_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0027.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0027.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0028_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0028.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0028.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0029_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0029.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0029.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii002a_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii002a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii002a.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii002b_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii002b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii002b.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii002c_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii002c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii002c.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii002d_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii002d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii002d.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii002e_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii002e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii002e.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii002f_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii002f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii002f.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0030_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0030.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0030.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0031_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0031.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0031.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0032_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0032.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0032.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0033_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0033.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0033.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0034_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0034.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0034.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0035_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0035.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0035.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0036_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0036.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0036.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0037_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0037.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0037.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0038_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0038.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0038.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0039_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0039.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0039.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii003a_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii003a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii003a.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii003b_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii003b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii003b.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii003c_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii003c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii003c.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii003d_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii003d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii003d.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii003e_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii003e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii003e.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii003f_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii003f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii003f.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0040_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0040.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0040.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0041_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0041.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0041.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0042_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0042.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0042.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0043_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0043.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0043.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0044_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0044.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0044.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0045_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0045.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0045.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0046_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0046.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0046.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0047_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0047.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0047.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0048_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0048.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0048.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0049_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0049.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0049.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii004a_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii004a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii004a.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii004b_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii004b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii004b.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii004c_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii004c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii004c.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii004d_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii004d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii004d.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii004e_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii004e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii004e.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii004f_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii004f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii004f.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0050_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0050.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0050.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0051_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0051.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0051.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0052_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0052.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0052.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0053_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0053.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0053.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0054_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0054.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0054.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0055_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0055.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0055.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0056_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0056.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0056.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0057_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0057.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0057.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0058_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0058.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0058.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0059_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0059.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0059.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii005a_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii005a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii005a.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii005b_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii005b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii005b.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii005c_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii005c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii005c.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii005d_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii005d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii005d.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii005e_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii005e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii005e.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii005f_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii005f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii005f.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0060_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0060.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0060.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0061_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0061.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0061.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0062_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0062.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0062.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0063_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0063.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0063.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0064_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0064.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0064.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0065_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0065.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0065.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0066_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0066.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0066.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0067_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0067.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0067.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0068_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0068.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0068.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0069_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0069.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0069.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii006a_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii006a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii006a.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii006b_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii006b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii006b.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii006c_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii006c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii006c.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii006d_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii006d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii006d.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii006e_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii006e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii006e.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii006f_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii006f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii006f.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0070_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0070.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0070.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0071_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0071.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0071.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0072_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0072.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0072.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0073_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0073.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0073.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0074_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0074.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0074.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0075_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0075.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0075.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0076_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0076.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0076.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0077_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0077.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0077.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0078_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0078.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0078.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0079_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0079.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0079.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii007a_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii007a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii007a.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii007b_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii007b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii007b.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii007c_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii007c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii007c.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii007d_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii007d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii007d.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii007e_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii007e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii007e.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii007f_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii007f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii007f.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0080_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0080.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0080.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0081_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0081.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0081.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0082_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0082.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0082.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0083_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0083.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0083.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0084_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0084.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0084.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0085_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0085.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0085.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0086_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0086.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0086.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0087_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0087.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0087.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0088_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0088.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0088.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0089_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0089.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0089.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii008a_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii008a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii008a.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii008b_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii008b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii008b.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii008c_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii008c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii008c.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii008d_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii008d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii008d.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii008e_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii008e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii008e.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii008f_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii008f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii008f.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0090_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0090.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0090.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0091_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0091.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0091.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0092_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0092.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0092.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0093_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0093.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0093.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0094_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0094.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0094.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0095_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0095.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0095.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0096_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0096.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0096.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0097_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0097.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0097.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0098_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0098.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0098.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii0099_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii0099.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii0099.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii009a_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii009a.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii009a.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii009b_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii009b.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii009b.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii009c_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii009c.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii009c.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii009d_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii009d.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii009d.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii009e_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii009e.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii009e.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii009f_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii009f.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii009f.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a0_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a0.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00a0.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a1_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a1.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00a1.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a2_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a2.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00a2.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a3_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a3.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00a3.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a4_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a4.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00a4.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a5_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a5.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00a5.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a6_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a6.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00a6.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a7_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a7.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00a7.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a8_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a8.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00a8.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00a9_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00a9.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00a9.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00aa_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00aa.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00aa.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ab_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ab.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00ab.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ac_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ac.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00ac.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ad_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ad.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00ad.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ae_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ae.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00ae.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00af_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00af.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00af.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b0_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b0.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00b0.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b1_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b1.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00b1.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b2_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b2.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00b2.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b3_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b3.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00b3.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b4_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b4.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00b4.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b5_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b5.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00b5.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b6_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b6.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00b6.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b7_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b7.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00b7.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b8_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b8.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00b8.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00b9_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00b9.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00b9.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ba_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ba.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00ba.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00bb_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00bb.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00bb.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00bc_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00bc.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00bc.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00bd_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00bd.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00bd.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00be_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00be.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00be.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00bf_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00bf.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00bf.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c0_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c0.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00c0.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c1_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c1.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00c1.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c2_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c2.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00c2.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c3_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c3.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00c3.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c4_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c4.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00c4.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c5_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c5.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00c5.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c6_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c6.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00c6.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c7_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c7.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00c7.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c8_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c8.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00c8.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00c9_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00c9.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00c9.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ca_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ca.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00ca.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00cb_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00cb.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00cb.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00cc_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00cc.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00cc.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00cd_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00cd.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00cd.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ce_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ce.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00ce.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00cf_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00cf.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00cf.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d0_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d0.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00d0.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d1_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d1.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00d1.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d2_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d2.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00d2.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d3_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d3.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00d3.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d4_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d4.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00d4.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d5_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d5.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00d5.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d6_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d6.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00d6.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d7_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d7.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00d7.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d8_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d8.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00d8.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00d9_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00d9.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00d9.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00da_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00da.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00da.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00db_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00db.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00db.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00dc_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00dc.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00dc.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00dd_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00dd.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00dd.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00de_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00de.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00de.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00df_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00df.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00df.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e0_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e0.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00e0.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e1_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e1.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00e1.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e2_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e2.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00e2.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e3_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e3.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00e3.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e4_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e4.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00e4.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e5_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e5.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00e5.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e6_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e6.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00e6.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e7_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e7.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00e7.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e8_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e8.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00e8.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00e9_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00e9.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00e9.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ea_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ea.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00ea.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00eb_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00eb.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00eb.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ec_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ec.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00ec.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ed_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ed.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00ed.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ee_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ee.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00ee.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ef_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ef.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00ef.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f0_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f0.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00f0.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f1_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f1.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00f1.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f2_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f2.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00f2.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f3_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f3.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00f3.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f4_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f4.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00f4.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f5_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f5.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00f5.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f6_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f6.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00f6.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f7_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f7.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00f7.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f8_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f8.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00f8.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00f9_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00f9.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00f9.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00fa_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00fa.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00fa.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00fb_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00fb.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00fb.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00fc_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00fc.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00fc.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00fd_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00fd.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00fd.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00fe_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00fe.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00fe.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testWithInputTextWithAscii00ff_string() {
        String input = ReadFile.readFile(Path.of("./src/testgeneration/resources/input/TextWithAscii00ff.txt"));
        String output = ReadFile.readFile(Path.of("./src/testgeneration/resources/output/showNonprintingAndShowTabs_TextWithAscii00ff.txt"));
        String expected = output;
        
        String actual = Cat.of(input).showNonprinting().showTabs().executeToString();
        
        TestUtil.verboseCompare(expected, actual);
    }

}
