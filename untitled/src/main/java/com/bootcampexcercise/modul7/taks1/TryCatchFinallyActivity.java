package com.bootcampexcercise.modul7.taks1;

public class TryCatchFinallyActivity {
    public static void main(String[] args) {
        new TryCatchFinallyActivity().catchMeIfYouCan();
    }

    void catchMeIfYouCan() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds for the array.");
        } finally {
            System.out.println("This message is printed whether an error occurred or not.");
        }
    }
}
