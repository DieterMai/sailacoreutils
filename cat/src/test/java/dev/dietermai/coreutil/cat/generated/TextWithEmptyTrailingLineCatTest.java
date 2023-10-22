package dev.dietermai.coreutil.cat.generated;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import dev.dietermai.coreutil.cat.Cat;
import dev.dietermai.coreutil.cat.CatResult;
import dev.dietermai.coreutil.cat.LineSupplier;
import dev.dietermai.coreutil.cat.TestUtil;
import dev.dietermai.coreutil.cat.TextLineSupplier;

class TextWithEmptyTrailingLineCatTest {

    @Test
    void test_defaultConfig() {
        List<String> inputLines = new ArrayList<>();
        inputLines.add("This is a simple text");
        inputLines.add("second line");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("6th line");
        LineSupplier supplier = new TextLineSupplier(String.join("\n", inputLines));
        
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("This is a simple text");
        expectedLines.add("second line");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("6th line");
        String expectedOutput = String.join("\n", expectedLines);
        CatResult expected = CatResult.of(expectedOutput);
        
        CatResult actual = Cat.of(supplier).execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testshowAllConfig() {
        List<String> inputLines = new ArrayList<>();
        inputLines.add("This is a simple text");
        inputLines.add("second line");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("6th line");
        LineSupplier supplier = new TextLineSupplier(String.join("\n", inputLines));
        
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("This is a simple text$");
        expectedLines.add("second line$");
        expectedLines.add("$");
        expectedLines.add("$");
        expectedLines.add("$");
        expectedLines.add("6th line$");
        String expectedOutput = String.join("\n", expectedLines);
        CatResult expected = CatResult.of(expectedOutput);
        
        CatResult actual = Cat.of(supplier).showAll().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testnumberNoneblankConfig() {
        List<String> inputLines = new ArrayList<>();
        inputLines.add("This is a simple text");
        inputLines.add("second line");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("6th line");
        LineSupplier supplier = new TextLineSupplier(String.join("\n", inputLines));
        
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("     1	This is a simple text");
        expectedLines.add("     2	second line");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("     3	6th line");
        String expectedOutput = String.join("\n", expectedLines);
        CatResult expected = CatResult.of(expectedOutput);
        
        CatResult actual = Cat.of(supplier).numberNonblank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testshowEndsConfig() {
        List<String> inputLines = new ArrayList<>();
        inputLines.add("This is a simple text");
        inputLines.add("second line");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("6th line");
        LineSupplier supplier = new TextLineSupplier(String.join("\n", inputLines));
        
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("This is a simple text$");
        expectedLines.add("second line$");
        expectedLines.add("$");
        expectedLines.add("$");
        expectedLines.add("$");
        expectedLines.add("6th line$");
        String expectedOutput = String.join("\n", expectedLines);
        CatResult expected = CatResult.of(expectedOutput);
        
        CatResult actual = Cat.of(supplier).showEnds().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testnumberConfig() {
        List<String> inputLines = new ArrayList<>();
        inputLines.add("This is a simple text");
        inputLines.add("second line");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("6th line");
        LineSupplier supplier = new TextLineSupplier(String.join("\n", inputLines));
        
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("     1	This is a simple text");
        expectedLines.add("     2	second line");
        expectedLines.add("     3	");
        expectedLines.add("     4	");
        expectedLines.add("     5	");
        expectedLines.add("     6	6th line");
        String expectedOutput = String.join("\n", expectedLines);
        CatResult expected = CatResult.of(expectedOutput);
        
        CatResult actual = Cat.of(supplier).number().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testsqueezeBlankConfig() {
        List<String> inputLines = new ArrayList<>();
        inputLines.add("This is a simple text");
        inputLines.add("second line");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("6th line");
        LineSupplier supplier = new TextLineSupplier(String.join("\n", inputLines));
        
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("This is a simple text");
        expectedLines.add("second line");
        expectedLines.add("");
        expectedLines.add("6th line");
        String expectedOutput = String.join("\n", expectedLines);
        CatResult expected = CatResult.of(expectedOutput);
        
        CatResult actual = Cat.of(supplier).squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testshowTabsConfig() {
        List<String> inputLines = new ArrayList<>();
        inputLines.add("This is a simple text");
        inputLines.add("second line");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("6th line");
        LineSupplier supplier = new TextLineSupplier(String.join("\n", inputLines));
        
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("This is a simple text");
        expectedLines.add("second line");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("6th line");
        String expectedOutput = String.join("\n", expectedLines);
        CatResult expected = CatResult.of(expectedOutput);
        
        CatResult actual = Cat.of(supplier).showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testshowNonprintingConfig() {
        List<String> inputLines = new ArrayList<>();
        inputLines.add("This is a simple text");
        inputLines.add("second line");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("6th line");
        LineSupplier supplier = new TextLineSupplier(String.join("\n", inputLines));
        
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("This is a simple text");
        expectedLines.add("second line");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("6th line");
        String expectedOutput = String.join("\n", expectedLines);
        CatResult expected = CatResult.of(expectedOutput);
        
        CatResult actual = Cat.of(supplier).showNonprinting().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

}
