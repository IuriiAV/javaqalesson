package com.qatelran.org.lessonseventeen;

public class WorkApp {

    public static void main(String[] args) {
        solution(10);
    }

    // n = 10 , n = 0, n = 5;
    private static void solution(int n) {
        try {
            int x = 10 / n; // 10 / 10 = 1; // 10/5 = 2; // 10 / 0
            int y[] = new int[n]; // int[10] , int[5]
            y[n + x] = 10; // y[1] = 10; y[2] = 10;
        } catch (Exception exception) {
            if (exception instanceof ArithmeticException) {
                System.out.println("Can't divide by zero " + exception.getCause());
            }
            if (exception instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("Incorrect index " + exception.getCause());
            }
        }
    }
}
