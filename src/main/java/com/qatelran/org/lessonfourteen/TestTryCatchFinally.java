package com.qatelran.org.lessonfourteen;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestTryCatchFinally {

    public static void main(String[] args) {
        String path = "/Volumes/Macintosh HD - Data 1/project/telranqa/src/main/java/com/qatelran/org/lessonthirteen/hellohello";
        InputStream fileInputStream = null;
        //try -catch,
        //try-catch-catch...,
        //try-catch-finally,
        //try-finally
        try {
            fileInputStream = new FileInputStream(path); // File + InputStream
            while (fileInputStream.available() > 0) {
                System.out.println(fileInputStream.read());
            }

        } catch (Exception exception) {
            System.out.println("We have problem with file " + path);
            System.out.println("Cause " + exception.getMessage());
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
