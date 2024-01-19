package com.qatelran.org.lessonthirteen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class TestCopyFilesWithoutList {

    public static void main(String[] args) throws Exception {
        String pathIn = "/Volumes/Macintosh HD - Data 1/project/telranqa/src/main/java/com/qatelran/org/lessonthirteen/text";
        String pathOut = "/Volumes/Macintosh HD - Data 1/project/telranqa/src/main/java/com/qatelran/org/lessonthirteen/textOut";

        //InputStream - чтение байтовой информации (byte), read()
        //OutputStream - запись байтовой информации (byte), write(int)

        InputStream fileInputStream = new FileInputStream(pathIn);
        OutputStream fileOutputStream = new FileOutputStream(pathOut);

        while (fileInputStream.available() > 0) {
            fileOutputStream.write(fileInputStream.read());
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
