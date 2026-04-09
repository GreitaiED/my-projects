package com.bootcampexcercise.modul3.calculator;

public class CalculatorClient {
    public static void main(String[] args) {
        Calculator normalCalc = new Calculator(Calculator.CALC_TYPE_BASIC);

        System.out.println("Calculator type: " + normalCalc.getCalculatorType());

        int result = normalCalc.add(4, 5);
        System.out.println("Add result: " + result);

        int[] mul = {2, 3, 4};
        result = normalCalc.multiply(mul);
        System.out.println("Multiplication result: " + result);

        result = normalCalc.divide(10, 2);
        System.out.println("Divide result: " + result);

        result = normalCalc.subtract(10, 2);
        System.out.println("Subtract result: " + result);
    }
}
