package dev.dietermai.coreutil.cat.gentest;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import dev.dietermai.coreutil.cat.Cat;
import dev.dietermai.coreutil.cat.CatResult;
import dev.dietermai.coreutil.cat.LineSupplier;
import dev.dietermai.coreutil.cat.TestUtil;
import dev.dietermai.coreutil.cat.TextLineSupplier;

class BlankLineSpacesCatTest {

    @Test
    void test_defaultConfig() {
        LineSupplier supplier = new TextLineSupplier("      ");
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("      ");
        String expectedOutput = String.join("\n", expectedLines);
        CatResult expected = CatResult.of(expectedOutput);
        
        CatResult actual = Cat.of(supplier).execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testshowAllConfig() {
        LineSupplier supplier = new TextLineSupplier("      ");
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("      ");
        String expectedOutput = String.join("\n", expectedLines);
        CatResult expected = CatResult.of(expectedOutput);
        
        CatResult actual = Cat.of(supplier).showAll().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testnumberNoneblankConfig() {
        LineSupplier supplier = new TextLineSupplier("      ");
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("     1	      ");
        String expectedOutput = String.join("\n", expectedLines);
        CatResult expected = CatResult.of(expectedOutput);
        
        CatResult actual = Cat.of(supplier).numberNonblank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testshowEndsConfig() {
        LineSupplier supplier = new TextLineSupplier("      ");
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("      ");
        String expectedOutput = String.join("\n", expectedLines);
        CatResult expected = CatResult.of(expectedOutput);
        
        CatResult actual = Cat.of(supplier).showEnds().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testnumberConfig() {
        LineSupplier supplier = new TextLineSupplier("      ");
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("     1	      ");
        String expectedOutput = String.join("\n", expectedLines);
        CatResult expected = CatResult.of(expectedOutput);
        
        CatResult actual = Cat.of(supplier).number().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testsqueezeBlankConfig() {
        LineSupplier supplier = new TextLineSupplier("      ");
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("      ");
        String expectedOutput = String.join("\n", expectedLines);
        CatResult expected = CatResult.of(expectedOutput);
        
        CatResult actual = Cat.of(supplier).squeezeBlank().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testshowTabsConfig() {
        LineSupplier supplier = new TextLineSupplier("      ");
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("      ");
        String expectedOutput = String.join("\n", expectedLines);
        CatResult expected = CatResult.of(expectedOutput);
        
        CatResult actual = Cat.of(supplier).showTabs().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

    @Test
    void testshowNonprintingConfig() {
        LineSupplier supplier = new TextLineSupplier("      ");
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("      ");
        String expectedOutput = String.join("\n", expectedLines);
        CatResult expected = CatResult.of(expectedOutput);
        
        CatResult actual = Cat.of(supplier).showNonprinting().execute();
        
        TestUtil.verboseCompare(expected, actual);
    }

}
