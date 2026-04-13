package com.bootcampexcercise.modul10.Act3;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Invalid input: cannot divide by zero.");
            return 0;
        }
    }

    public int multiply(int a, int b) {
        try {
            if (a < 0 || b < 0) {
                throw new InvalidInputException("Invalid input: negative values are not allowed for multiplication.");
            }
            return a * b;
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
