package dev.dietermai.coreutil.cat.generated;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import dev.dietermai.coreutil.cat.Cat;
import dev.dietermai.coreutil.cat.CatResult;
import dev.dietermai.coreutil.cat.LineSupplier;
import dev.dietermai.coreutil.cat.TestUtil;
import dev.dietermai.coreutil.cat.TextLineSupplier;

class TextWithMultipleEmptyLinesCatTest {

    @Test
    void test_defaultConfig() {
        List<String> inputLines = new ArrayList<>();
        inputLines.add("This is a text with multiple empty lines");
        inputLines.add("This line is not empty");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("This line is not empty again");
        LineSupplier supplier = new TextLineSupplier(String.join("\n", inputLines));
        
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("This is a text with multiple empty lines");
        expectedLines.add("This line is not empty");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("This line is not empty again");
        String expectedOutput = String.join("\n", expectedLines);
        CatResult expected = CatResult.of(expectedOutput);
        
        CatResult actual = Cat.of(supplier).execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testshowAllConfig() {
        List<String> inputLines = new ArrayList<>();
        inputLines.add("This is a text with multiple empty lines");
        inputLines.add("This line is not empty");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("This line is not empty again");
        LineSupplier supplier = new TextLineSupplier(String.join("\n", inputLines));
        
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("This is a text with multiple empty lines$");
        expectedLines.add("This line is not empty$");
        expectedLines.add("$");
        expectedLines.add("$");
        expectedLines.add("$");
        expectedLines.add("$");
        expectedLines.add("$");
        expectedLines.add("$");
        expectedLines.add("This line is not empty again");
        String expectedOutput = String.join("\n", expectedLines);
        CatResult expected = CatResult.of(expectedOutput);
        
        CatResult actual = Cat.of(supplier).showAll().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testnumberNoneblankConfig() {
        List<String> inputLines = new ArrayList<>();
        inputLines.add("This is a text with multiple empty lines");
        inputLines.add("This line is not empty");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("This line is not empty again");
        LineSupplier supplier = new TextLineSupplier(String.join("\n", inputLines));
        
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("     1	This is a text with multiple empty lines");
        expectedLines.add("     2	This line is not empty");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("     3	This line is not empty again");
        String expectedOutput = String.join("\n", expectedLines);
        CatResult expected = CatResult.of(expectedOutput);
        
        CatResult actual = Cat.of(supplier).numberNonblank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testshowEndsConfig() {
        List<String> inputLines = new ArrayList<>();
        inputLines.add("This is a text with multiple empty lines");
        inputLines.add("This line is not empty");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("This line is not empty again");
        LineSupplier supplier = new TextLineSupplier(String.join("\n", inputLines));
        
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("This is a text with multiple empty lines$");
        expectedLines.add("This line is not empty$");
        expectedLines.add("$");
        expectedLines.add("$");
        expectedLines.add("$");
        expectedLines.add("$");
        expectedLines.add("$");
        expectedLines.add("$");
        expectedLines.add("This line is not empty again");
        String expectedOutput = String.join("\n", expectedLines);
        CatResult expected = CatResult.of(expectedOutput);
        
        CatResult actual = Cat.of(supplier).showEnds().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testnumberConfig() {
        List<String> inputLines = new ArrayList<>();
        inputLines.add("This is a text with multiple empty lines");
        inputLines.add("This line is not empty");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("This line is not empty again");
        LineSupplier supplier = new TextLineSupplier(String.join("\n", inputLines));
        
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("     1	This is a text with multiple empty lines");
        expectedLines.add("     2	This line is not empty");
        expectedLines.add("     3	");
        expectedLines.add("     4	");
        expectedLines.add("     5	");
        expectedLines.add("     6	");
        expectedLines.add("     7	");
        expectedLines.add("     8	");
        expectedLines.add("     9	This line is not empty again");
        String expectedOutput = String.join("\n", expectedLines);
        CatResult expected = CatResult.of(expectedOutput);
        
        CatResult actual = Cat.of(supplier).number().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testsqueezeBlankConfig() {
        List<String> inputLines = new ArrayList<>();
        inputLines.add("This is a text with multiple empty lines");
        inputLines.add("This line is not empty");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("This line is not empty again");
        LineSupplier supplier = new TextLineSupplier(String.join("\n", inputLines));
        
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("This is a text with multiple empty lines");
        expectedLines.add("This line is not empty");
        expectedLines.add("");
        expectedLines.add("This line is not empty again");
        String expectedOutput = String.join("\n", expectedLines);
        CatResult expected = CatResult.of(expectedOutput);
        
        CatResult actual = Cat.of(supplier).squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testshowTabsConfig() {
        List<String> inputLines = new ArrayList<>();
        inputLines.add("This is a text with multiple empty lines");
        inputLines.add("This line is not empty");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("This line is not empty again");
        LineSupplier supplier = new TextLineSupplier(String.join("\n", inputLines));
        
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("This is a text with multiple empty lines");
        expectedLines.add("This line is not empty");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("This line is not empty again");
        String expectedOutput = String.join("\n", expectedLines);
        CatResult expected = CatResult.of(expectedOutput);
        
        CatResult actual = Cat.of(supplier).showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testshowNonprintingConfig() {
        List<String> inputLines = new ArrayList<>();
        inputLines.add("This is a text with multiple empty lines");
        inputLines.add("This line is not empty");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("");
        inputLines.add("This line is not empty again");
        LineSupplier supplier = new TextLineSupplier(String.join("\n", inputLines));
        
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("This is a text with multiple empty lines");
        expectedLines.add("This line is not empty");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("");
        expectedLines.add("This line is not empty again");
        String expectedOutput = String.join("\n", expectedLines);
        CatResult expected = CatResult.of(expectedOutput);
        
        CatResult actual = Cat.of(supplier).showNonprinting().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

}
