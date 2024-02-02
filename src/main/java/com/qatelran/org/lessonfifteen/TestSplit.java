package com.qatelran.org.lessonfifteen;

import java.util.Arrays;
import java.util.regex.Pattern;

public class TestSplit {

    public static void main(String[] args) {
        String text = "I1learned2about3Telran4College5and6now7I'm8studying9Java";
        String delimiter = "[0-9]"; // or \\d
        Pattern pattern = Pattern.compile(delimiter);
        String[] result = pattern.split(text);


        for (String temp : result) {
            System.out.println(temp + " ");
        }

        System.out.println(text.replaceAll(delimiter," "));
        String[] split = text.split(delimiter);
        System.out.println(Arrays.toString(split));

        String textTwo = "IplearnedPaboutpTelranPCollegepandPnowpI'mpstudyingPJava";
        Pattern p = Pattern.compile("p", Pattern.CASE_INSENSITIVE);
        String[] resultTwo = p.split(textTwo);
        System.out.println(Arrays.toString(resultTwo));

        String[] resultThree = textTwo.split("[pP]");
        System.out.println(Arrays.toString(resultThree));

    }
}
