package com.qatelran.org.lessonfifteen.finder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberFinder {

    private String regex;

    private String originalText;

    public NumberFinder(String regex, String originalText) {
        this.regex = regex;
        this.originalText = originalText;
    }

    public Map<Integer, Integer> getPatternIndexMap() {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(originalText);

        Map<Integer, Integer> indexMap = new HashMap<>();
        while (matcher.find()) {
            indexMap.put(matcher.start(), matcher.end() - 1);
        }
        return indexMap;
    }

    public List<int[]> getPatternIndexList() {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(originalText);

       List<int[]> list = new ArrayList<>();
        while (matcher.find()) {
             int[] index = {matcher.start(), matcher.end() -1};
             list.add(index);
        }
        return list;
    }
}
