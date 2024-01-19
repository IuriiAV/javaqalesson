package com.qatelran.org.lessonthirteen;

import java.io.File;

public class TestDeleteDirectory {

    public static void main(String[] args) {
        String pathOut = "/Volumes/Macintosh HD - Data 1/project/telranqa/src/main/java/com/qatelran/org/lessonthirteen/";
        String pathToDeleteDir = pathOut + "testdelete";
        File directory = new File(pathToDeleteDir);
        deleteDirectory(directory);
    }

    private static boolean deleteDirectory(File dir) {
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteDirectory(file);
                } else {
                    System.out.println("File name is " + file.getName());
                    //file.delete();
                }
            }
        }
        //dir.delete();
        System.out.println("Directory name is " + dir.getName());
        return true;
    }

}
