package com.qatelran.org.lessonthirteen;

import java.io.FileInputStream;
import java.io.InputStream;

public class TestReadFile {

    public static void main(String[] args) throws Exception {

        String path = "/Volumes/Macintosh HD - Data 1/project/telranqa/src/main/java/com/qatelran/org/lessonthirteen/text";
        InputStream fileInputStream = new FileInputStream(path); // File + InputStream

        //->Hello world!
        //H->ello world!
        //He->llo world!

        int data = fileInputStream.read();
        while (data != -1) {
            System.out.println("Byte  = " + data + " char = " + (char)(data));
            data = fileInputStream.read();
        }
    }
}
