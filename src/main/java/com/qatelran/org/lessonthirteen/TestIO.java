package com.qatelran.org.lessonthirteen;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class TestIO {

    public static void main(String[] args) {
        //InputStream - чтение байтовой информации (byte)
        //OutputStream - запись байтовой информации (byte)

        //Reader - чтение символьной информации (char,String)
        //Writer - запись символьной информации (char,String)

        String hello = "Hello";
        byte[] bytes = "Hello".getBytes();
        System.out.println(Arrays.toString(bytes));

        //1 стандартный поток вывода информации в консоль
        PrintStream out = System.out;
        System.out.print("One ");
        System.out.println("Two ");
        System.out.printf("%B%n", 2);
        System.out.printf("%2.2s", "Hello class");
        System.out.println();
        System.out.println(new Date());
        System.out.printf("%tT%n", new Date());
        Date date = new Date();
        System.out.printf("Hours %tH minutes %tM second %tS%n", date, date, date);

        //2 - стандартный поток ввода информации с консоли
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a+b);

        //3 - стандартный поток для ошибок
        PrintStream err = System.err;
        System.out.println("simple message");
        System.err.println("error message");
    }
}
