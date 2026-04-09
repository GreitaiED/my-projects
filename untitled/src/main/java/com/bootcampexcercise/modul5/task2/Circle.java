package com.bootcampexcercise.modul5.task2;

public class Circle extends Shape {
    private double radius;

    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
