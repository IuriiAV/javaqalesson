package com.qatelran.org.lessonseventeen;

import java.util.Scanner;

public class ExampleApp {

    public static void main(String[] args) {
        //print();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input digit :");
        int i = scanner.nextInt();

        System.out.println("Digit is = " + i);
        /*
                            Throwable - родительский класс всех исключений(class)
                         /               \
         Error (class)                   Exception (требуют обработки)(class)
         XXXX                             /               \
                                Checked(type)            Unchecked(type) RuntimeException.class

         */
        // Unchecked(type) - исключения возникающие во время выполнения приложения
        // все они наследуются от класса RuntimeException
        // для них никто (компилятор, среда) не подсказывает, что они могут возникнуть

        //Checked(type) - требуют либо try-catch, либо проброс в сигнатуру метода
    }

    //StackOverflowError - Example , Error - не обрабатываем
    private static void print() {
        print();
    }
}
