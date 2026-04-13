package com.bootcampexcercise.modul10.Act3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void add1() {
        assertEquals(11, calculator.add(6, 5));
    }

    @Test
    public void add2() {
        assertEquals(5, calculator.add(7, -2));
    }

    @Test
    public void add3() {
        assertEquals(5.5, calculator.add(2.5, 3.0));
    }

    @Test
    public void add4() {
        assertEquals(-1.5, calculator.add(-2.5, 1.0));
    }

    @Test
    public void sub1() {
        assertEquals(2, calculator.subtract(22, 20));
    }

    @Test
    public void sub2() {
        assertEquals(-5, calculator.subtract(7, 12));
    }

    @Test
    public void div1() {
        assertEquals(6, calculator.divide(12, 2));
    }

    @Test
    public void div2() {
        assertEquals(0, calculator.divide(10, 0));
    }

    @Test
    public void mul1() {
        assertEquals(36, calculator.multiply(6, 6));
    }

    @Test
    public void mul2() {
        assertEquals(0, calculator.multiply(-4, 5));
    }
}
