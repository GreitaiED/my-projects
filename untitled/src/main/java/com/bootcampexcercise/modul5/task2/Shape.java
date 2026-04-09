package com.bootcampexcercise.modul5.task2;

public abstract class Shape {
    private String color;

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
