package com.qatelran.org.lessonfifteen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMatcher {

    public static void main(String[] args) {
        String regex = "tel";
        String actual = "telran.de.telran.detelran";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(actual);

        //вернет соответствие шаблона и строки для которой его применяем
        //boolean matches = matcher.matches();

        while (matcher.find()) {
            System.out.println("Pattern found from " + matcher.start() +
                    " to " + matcher.end());
        }
    }
}
