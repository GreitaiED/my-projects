package com.bootcampexcercise.modul5.task2;

public class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
