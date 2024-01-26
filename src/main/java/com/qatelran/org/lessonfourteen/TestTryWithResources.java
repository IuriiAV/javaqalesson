package com.qatelran.org.lessonfourteen;

import java.io.FileInputStream;
import java.io.InputStream;

public class TestTryWithResources {

    public static void main(String[] args) {
        String path = "/Volumes/Macintosh HD - Data 1/project/telranqa/src/main/java/com/qatelran/org/lessonthirteen/hellohello";
        //try - with resources
        try (InputStream fileInputStream = new FileInputStream(path)) {
            while (fileInputStream.available() > 0) {
                System.out.println(fileInputStream.read());
            }
        } catch (Exception e) {
            System.out.println("We have problem with file " + path);
            System.out.println("Cause " + e.getMessage());
        }
    }
}
