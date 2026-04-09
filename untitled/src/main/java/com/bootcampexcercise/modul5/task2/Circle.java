package com.bootcampexcercise.modul5.task2;

public class Circle extends Shape {
    double radius = 5;

    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}
