package com.qatelran.org.lessonfourteen;

import java.io.FileReader;
import java.io.IOException;

public class TestFileReaderTwo {

    public static void main(String[] args) {
        String path = "/Volumes/Macintosh HD - Data 1/project/telranqa/src/main/java/com/qatelran/org/lessonthirteen/text";

        String stringFromFile = readDataFromFile(path);
        System.out.println(stringFromFile);
    }

    private static String readDataFromFile(String path) {
        StringBuilder sb = new StringBuilder();

        try {
            FileReader reader = new FileReader(path);
            char[] chars = new char[20];
            while (reader.ready()) {
                int count = reader.read(chars);
                for (int i = 0; i < count; i++) {
                    char currentChar = chars[i];
                    sb.append(currentChar);
                }
            }
        } catch (IOException exception) {
            System.out.println("We have a problem to read file " + path);
            System.out.println("Problem is " + exception.getMessage());
        }

        return sb.toString();
    }


}
