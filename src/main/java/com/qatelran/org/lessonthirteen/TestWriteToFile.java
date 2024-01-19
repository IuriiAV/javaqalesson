package com.qatelran.org.lessonthirteen;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class TestWriteToFile {

    public static void main(String[] args) throws Exception {
        String pathOut = "/Volumes/Macintosh HD - Data 1/project/telranqa/src/main/java/com/qatelran/org/lessonthirteen/textWrite";
        OutputStream fileOutputStream = new FileOutputStream(pathOut);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input string : ");
        String inputLine = scanner.nextLine();

        byte[] bytes = inputLine.getBytes();
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }
}
