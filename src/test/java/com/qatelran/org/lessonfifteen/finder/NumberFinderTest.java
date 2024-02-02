package com.qatelran.org.lessonfifteen.finder;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class NumberFinderTest {

    @Test
    public void testNumberFinderWhenNumberExistsOneInOriginalText() {
        String pattern = "[a-z][a-z]\\d\\d\\d[a-z][a-z][a-z]";
        String original = "dffs345sdfsdf34"; // 2 - 9
        NumberFinder numberFinder = new NumberFinder(pattern, original);
        Map<Integer, Integer> patternIndexMap = numberFinder.getPatternIndexMap();

        assertEquals(1, patternIndexMap.size());
        for (Map.Entry<Integer, Integer> pair : patternIndexMap.entrySet()) {
            assertEquals(Integer.valueOf(2), pair.getKey());
            assertEquals(Integer.valueOf(9),pair.getValue());
        }
    }
}