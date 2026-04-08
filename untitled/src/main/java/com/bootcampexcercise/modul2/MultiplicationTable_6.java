package com.bootcampexcercise.modul2;

public class MultiplicationTable_6 {
    public static void main(String[] args) {
        for (int i = 11; i <= 20; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
