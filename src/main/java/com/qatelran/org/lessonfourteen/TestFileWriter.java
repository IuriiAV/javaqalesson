package com.qatelran.org.lessonfourteen;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class TestFileWriter {

    public static void main(String[] args) {
        String path = "/Volumes/Macintosh HD - Data 1/project/telranqa/src/main/java/com/qatelran/org/lessonfourteen/outtext.txt";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input something : ");

        String dataFromConsole = "";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path);
        } catch (IOException exception) {
            System.out.println("Incorrect file to write");
            System.exit(0);
        }

        while (!"exit".equals(dataFromConsole)) {
            dataFromConsole = scanner.next();
            writeFileWithAppend(dataFromConsole, fileWriter);
        }

        try {
            fileWriter.close();
        } catch (IOException e) {
            //
        }
    }

    private static void writeFile(String path, String data) {
        try (FileWriter fileWriter = new FileWriter(path)) {
            fileWriter.write(data);
        } catch (IOException exception) {
            System.out.println("Error to write data to file " + path);
        }
    }

    private static void writeFileWithAppend(String data, Writer fileWriter) {
        try {
            fileWriter.append(data);
            fileWriter.append("\n");
            fileWriter.flush();
        } catch (IOException exception) {
            System.out.println("Problem to write file");
        }
    }
}
