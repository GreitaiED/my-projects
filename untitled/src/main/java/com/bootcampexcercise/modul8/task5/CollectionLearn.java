package com.bootcampexcercise.modul8.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionLearn {

    private ArrayList<String> list = new ArrayList<>();
    private HashSet<String> set = new HashSet<>();
    private HashMap<Integer, String> map = new HashMap<>();

    public void initialize() {
        for (int i = 1; i <= 10; i++) {
            String value = "Value" + i;
            list.add(value);
            set.add(value);
            map.put(i, value);
        }
    }

    public void printList() {
        System.out.println("ArrayList:");
        for (String value : list) {
            System.out.println(value);
        }
    }

    public void printSet() {
        System.out.println("HashSet:");
        for (String value : set) {
            System.out.println(value);
        }
    }

    public void printMap() {
        System.out.println("HashMap:");
        for (Integer key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }

    public void addToList(String value) {
        if (list.contains(value)) {
            System.out.println("Duplicate not allowed in list: " + value);
            return;
        }
        list.add(value);
    }

    public void addToSet(String value) {
        if (set.contains(value)) {
            System.out.println("Duplicate not allowed in set: " + value);
            return;
        }
        set.add(value);
    }

    public void addToMap(int key, String value) {
        if (map.containsValue(value)) {
            System.out.println("Duplicate not allowed in map: " + value);
            return;
        }
        map.put(key, value);
    }

    public void removeFromList(String value) {
        list.remove(value);
    }

    public void removeFromSet(String value) {
        set.remove(value);
    }

    public void removeFromMap(int key) {
        map.remove(key);
    }

    public void replaceInList(int index, String newValue) {
        if (list.contains(newValue)) {
            System.out.println("Duplicate not allowed in list: " + newValue);
            return;
        }
        if (index >= 0 && index < list.size()) {
            list.set(index, newValue);
        }
    }

    public void replaceInSet(String oldValue, String newValue) {
        if (!set.contains(oldValue)) {
            return;
        }
        if (set.contains(newValue)) {
            System.out.println("Duplicate not allowed in set: " + newValue);
            return;
        }
        set.remove(oldValue);
        set.add(newValue);
    }

    public void replaceInMap(int key, String newValue) {
        if (map.containsValue(newValue)) {
            System.out.println("Duplicate not allowed in map: " + newValue);
            return;
        }
        if (map.containsKey(key)) {
            map.put(key, newValue);
        }
    }

    public static void main(String[] args) {
        CollectionLearn collLearn = new CollectionLearn();

        collLearn.initialize();

        System.out.println("Initial values");
        collLearn.printList();
        collLearn.printSet();
        collLearn.printMap();

        System.out.println();
        System.out.println("After add");
        collLearn.addToList("NewValue");
        collLearn.addToSet("NewValue");
        collLearn.addToMap(11, "NewValue");
        collLearn.printList();
        collLearn.printSet();
        collLearn.printMap();

        System.out.println();
        System.out.println("After remove");
        collLearn.removeFromList("Value3");
        collLearn.removeFromSet("Value5");
        collLearn.removeFromMap(2);
        collLearn.printList();
        collLearn.printSet();
        collLearn.printMap();

        System.out.println();
        System.out.println("After replace");
        collLearn.replaceInList(0, "ChangedValue");
        collLearn.replaceInSet("Value4", "ChangedSetValue");
        collLearn.replaceInMap(3, "ChangedMapValue");
        collLearn.printList();
        collLearn.printSet();
        collLearn.printMap();
    }
}
