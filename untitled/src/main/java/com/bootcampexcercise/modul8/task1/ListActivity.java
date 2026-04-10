package com.bootcampexcercise.modul8.task1;

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Edvards");
        names.add("Jana");
        names.add("Kira");
        names.add("Tatjana");

        print(names);
    }

    static void print(List list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }
}