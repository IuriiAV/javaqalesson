package com.qatelran.org.lessonfifteen;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TestAutoNumber {

    public static void main(String[] args) {
        // ad543zxf - первые 2 символа, далее 3 цифры,3 символа
        //String pattern = "[a-z][a-z]\\d\\d\\d[a-z][a-z][a-z]";  // !!!!!
        //String pattern = "[a-z][a-z][0-9][0-9][0-9][a-z][a-z][a-z]";  // !!!!!
        //[a-zA-Z] - любой символ англ алфавита в верхнем или нижнем регистре
        Scanner scanner = new Scanner(System.in);
        String otherPattern = "[a-z][a-z]\\d\\d\\d[a-z][a-z][a-z][a-z]";
        NumberChecker numberChecker = new NumberChecker();
        while (true) {
            System.out.println("Please input number : ");
            String input = scanner.next();
            if ("exit".equals(input)) {
                break;
            }
            boolean isCorrect = numberChecker.isCorrectNumber(input);
            System.out.println("The number " + input + " is correct = " + isCorrect);
        }
    }
}