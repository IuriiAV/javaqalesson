package com.qatelran.org.lessonfourteen;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class TestFileReader {

    public static void main(String[] args) {
        //Reader - чтение символьной информации (char,String)
        //Writer - запись символьной информации (char,String)

        String path = "/Volumes/Macintosh HD - Data 1/project/telranqa/src/main/java/com/qatelran/org/lessonthirteen/text";

        try {
            FileReader reader = new FileReader(path);
            char[] chars = new char[20];
            int countOfIterations = 0;
            while (reader.ready()) {
                int count = reader.read(chars);
                System.out.println(Arrays.toString(chars) + " count chars = " + count);
                countOfIterations++;
                chars = new char[20];
            }
            System.out.println("Number of reads " + countOfIterations);
        } catch (IOException exception) {
            System.out.println("We have a problem to read file " + path);
            System.out.println("Problem is " + exception.getMessage());
        }
    }
}
