package com.bootcampexcercise.modul10.Act6;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car is now moving.");
    }

    @Override
    public void stop() {
        System.out.println("Car is parked now.");
    }
}
