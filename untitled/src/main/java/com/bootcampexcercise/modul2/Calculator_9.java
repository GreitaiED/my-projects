package com.bootcampexcercise.modul2;

public class Calculator_9 {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 5;

        System.out.println("Sum: " + sum(num1, num2));
        System.out.println("Subtract: " + subtract(num1, num2));
        System.out.println("Multiply: " + multiply(num1, num2));
        System.out.println("Divide: " + divide(num1, num2));
    }
}
