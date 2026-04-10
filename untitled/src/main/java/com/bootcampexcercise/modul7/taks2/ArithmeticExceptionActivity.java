package com.bootcampexcercise.modul7.taks2;

public class ArithmeticExceptionActivity {
    public static void main(String[] args) {
        ArithmeticExceptionActivity activity = new ArithmeticExceptionActivity();
        activity.catchMe(10, 0);
        activity.catchMe(10, 2);
    }

    void catchMe(int num1, int num2) {
        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException a) {
            System.out.println("ArithmeticException: cannot divide by zero.");
        } finally {
            System.out.println("Thank you for using this program.");
        }
    }
}
