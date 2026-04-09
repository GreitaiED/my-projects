package com.bootcampexcercise.modul3.Car;

public class CarInstance {
    public static void main(String[] args) {
        Car car = new Car();

        car.name = "Toyota";
        car.color = "Black";
        car.modelNo = 2020;

        System.out.println("Car name: " + car.name);
        System.out.println("Car details: " + car.name + " " + car.color + " " + car.modelNo);
    }
}
