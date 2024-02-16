package com.qatelran.org.lessonseventeen;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExampleChecked {

    public static void main(String[] args) {
        //Checked exception
        try {
            FileReader reader = new FileReader("test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Problem cause " + e.getMessage());
        }
    }
}
