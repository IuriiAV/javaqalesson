package com.qatelran.org.lessonfourteen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestTryCatch {

    public static void main(String[] args) {

        String path = "/Volumes/Macintosh HD - Data 1/project/telranqa/src/main/java/com/qatelran/org/lessonthirteen/hellohello";

        readFileThree(path);

        System.out.println("End of application");
    }

    private static void readFile(String path) {
        try {
            InputStream fileInputStream = new FileInputStream(path); // File + InputStream
            while (fileInputStream.available() > 0) {
                System.out.println(fileInputStream.read());
            }
        } catch (FileNotFoundException e) { // Exception
            System.out.println("File with path " + path + " not found");
            System.out.println("Try another path to file");
        } catch (IOException exception) {
            System.out.println("Error read file");
        }
    }

    private static void readFileTwo(String path) {
        try {
            InputStream fileInputStream = new FileInputStream(path); // File + InputStream
            while (fileInputStream.available() > 0) {
                System.out.println(fileInputStream.read());
            }
        } catch (IOException e) { // handle FileNotFoundException, IOException
            if (e instanceof FileNotFoundException) {
                System.out.println("File with path " + path + " not found");
                System.out.println("Try another path to file");
            } else {
                System.out.println("We have trouble to read file");
            }
        }
    }

    private static void readFileThree(String path) {
        try {
            InputStream fileInputStream = new FileInputStream(path); // File + InputStream
            while (fileInputStream.available() > 0) {
                System.out.println(fileInputStream.read());
            }
        } catch (Exception e) { // handle FileNotFoundException, IOException
            System.out.println("Try another file");
            System.out.println(e.getMessage());
        }
    }
}
