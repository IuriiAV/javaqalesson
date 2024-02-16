package com.qatelran.org.lessonseventeen;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExampleCheckedTwo {

    public static void main(String[] args) {
        String path = "file.txt";
        try {
            getInfoFromFile(path);
        } catch (FileNotFoundException e) {
            System.out.println("Incorrect file path " + e.getMessage());
        }
    }

    private static void getInfoFromFile(String pathToFile) throws FileNotFoundException {
        //Checked exception
        FileReader reader = new FileReader(pathToFile);
    }
}
