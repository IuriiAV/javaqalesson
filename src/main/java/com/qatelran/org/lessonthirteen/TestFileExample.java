package com.qatelran.org.lessonthirteen;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class TestFileExample {

    public static void main(String[] args) throws IOException {
        String pathOut = "/Volumes/Macintosh HD - Data 1/project/telranqa/src/main/java/com/qatelran/org/lessonthirteen/";
        String pathToFile = pathOut + "fileOut.txt";

        File file = new File(pathToFile);
        boolean exists = file.exists(); // - проверка существования файла на диске
        System.out.println("File exists " + exists);

        String pathToNewDir = pathOut + "newcat";
        File dir = new File(pathToNewDir);
        System.out.println("Exist directory " + pathToNewDir + "\n" + dir.exists());
        boolean wasCreatedNewDir = dir.mkdir(); // - создание нового каталога на диске
        System.out.println("Exist directory " + pathToNewDir + "\n" + dir.exists());

        String pathToNewFile = pathToNewDir + "/" + "newfile.txt";
        File newfile = new File(pathToNewFile);
        boolean result = newfile.createNewFile(); // - создает новый файл на диске
        System.out.println("File exists " + pathToNewFile + " " + newfile.exists());

        long length = newfile.length(); // - возвращает длину файла
        System.out.println("Length of file = " + length);

        boolean success = newfile.delete(); // - удаляет файл с диска
        System.out.println("File " + pathToNewFile + " was delete = " + success);

        boolean directory = dir.isDirectory();
        System.out.println("Is directory " + directory);

        File lessonDirectory = new File(pathOut);
        String[] list = lessonDirectory.list(); // - возвращает список имен файлов
        System.out.println(Arrays.toString(list));

        File[] files = lessonDirectory.listFiles(); // - возвращает список файлов
        for (File currentFile : files) {
            System.out.println("Length file " + currentFile.getName() +
                    " is " + currentFile.length());
        }
    }
}
