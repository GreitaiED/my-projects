package com.bootcampexcercise.modul8.task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetActivity {

    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Disha");
        names.add("Anna");
        names.add("John");
        names.add("Maria");
        names.add("Peter");
        names.add("Kate");
        names.add("Alex");
        names.add("Olivia");
        names.add("Mark");
        names.add("Sofia");

        System.out.println("Original HashSet:");
        print(names);

        // add 2 duplicate val
        names.add("Disha");
        names.add("Anna");

        System.out.println("After adding duplicates:");
        print(names);

        // remove 2 val
        names.remove("Mark");
        names.remove("Kate");

        System.out.println("After removing 2 values:");
        print(names);

        // Find index
        List<String> namesList = new ArrayList<>(names);
        int index = namesList.indexOf("Disha");
        if (index != -1) {
            System.out.println("\nDisha found at index " + index + " in the converted List");
        } else {
            System.out.println("\nDisha not found in the set");
        }

        System.out.println("HashSet does not have a direct index.");
    }

    static void print(HashSet<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}
