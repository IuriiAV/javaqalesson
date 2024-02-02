package com.qatelran.org.lessonfifteen.finder;

import java.util.List;
import java.util.Map;

public class TestNumberFinder {

    public static void main(String[] args) {
        String pattern = "[a-z][a-z]\\d\\d\\d[a-z][a-z][a-z]";
        String original = "dfdkfs345sdfsdf345435dfsdf356ddgfd346543dfgdfg435435cxe";

        NumberFinder numberFinder = new NumberFinder(pattern, original);
        Map<Integer, Integer> patternIndexMap = numberFinder.getPatternIndexMap();

        for (Map.Entry<Integer, Integer> pair : patternIndexMap.entrySet()) {
            int start = pair.getKey();
            int end = pair.getValue();
            System.out.println("Start index of number is " + start + " : " +
                    "End index of number is " + end);
            System.out.println("Number is " +
                    original.substring(start, end + 1));
        }

        List<int[]> patternIndexList = numberFinder.getPatternIndexList();
        for (int[] element : patternIndexList) {
            int start = element[0];
            int end = element[1];
            System.out.println("Start index of number is " + start + " : " +
                    "End index of number is " + end);
            System.out.println("Number is " +
                    original.substring(start, end + 1));
        }

    }
}
