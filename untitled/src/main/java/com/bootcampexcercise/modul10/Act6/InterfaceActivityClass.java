package com.bootcampexcercise.modul10.Act6;

public class InterfaceActivityClass {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.start();
        bike.stop();

        System.out.println("-----------");

        Vehicle car = new Car();
        car.start();
        car.stop();
    }
}
