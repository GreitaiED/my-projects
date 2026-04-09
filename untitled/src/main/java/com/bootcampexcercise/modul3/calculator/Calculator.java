package com.bootcampexcercise.modul3.calculator;

public class Calculator {
    public static final String CALC_TYPE_BASIC = "Basic";

    private String calculatorType;

    public Calculator(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    public String getCalculatorType() {
        return calculatorType;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int[] numbers) {
        int result = 1;
        for (int i = 0; i < numbers.length; i++) {
            result = result * numbers[i];
        }
        return result;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
