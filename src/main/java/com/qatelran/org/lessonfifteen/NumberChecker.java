package com.qatelran.org.lessonfifteen;

import java.util.regex.Pattern;

public class NumberChecker {

    private String patternString = "[a-z][a-z]\\d\\d\\d[a-z][a-z][a-z]";

    public NumberChecker() {
        //
    }

    public NumberChecker(String patternString) {
        this.patternString = patternString;
    }

    public boolean isCorrectNumber(String autoNumber) {
        Pattern pattern = Pattern.compile(patternString);
        return pattern.matcher(autoNumber).matches();
    }
}
