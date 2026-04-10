package com.bootcampexcercise.modul8.task3;

import java.util.HashMap;
import java.util.Map;

public class MapActivity {
    public static void main(String[] args) {

        Map<String, String> names = new HashMap<>();
        names.put("1", "Edvards");
        names.put("2", "Tatjana");
        names.put("3", "Arina");
        names.put("4", "Jana");
        names.put("5", "Kira");

        new MapActivity().print(names);
    }

    void print(Map map) {
        for (Object item : map.entrySet()) {
            System.out.println(item);
        }
    }
}
