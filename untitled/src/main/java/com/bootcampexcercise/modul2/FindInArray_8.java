package com.bootcampexcercise.modul2;

public class FindInArray_8 {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 7, 30, 18, 44, 9, 21, 56, 3, 17, 28, 39, 10, 67, 25, 14, 50, 8, 33};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest number is: " + largest);
    }
}
