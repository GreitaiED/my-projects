package com.bootcampexcercise.modul10.Act6;

public class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike is ready to ride.");
    }

    @Override
    public void stop() {
        System.out.println("Bike ride is finished.");
    }
}
