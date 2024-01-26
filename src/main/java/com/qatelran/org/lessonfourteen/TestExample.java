package com.qatelran.org.lessonfourteen;

import java.io.FileInputStream;
import java.io.IOException;

public class TestExample {

    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("Example.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
