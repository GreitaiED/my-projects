package com.bootcampexcercise.modul10.Act5;

import java.util.HashMap;

public class ElectronicItemDetails {

    public double returnPriceOfItem(HashMap<String, Double> itemHashMap, String name) {
        if (itemHashMap.containsKey(name)) {
            return itemHashMap.get(name);
        }

        System.out.println("Item not found");
        return 0;
    }

    public static void main(String[] args) {
        HashMap<String, Double> itemHashMap = new HashMap<>();

        itemHashMap.put("TV", 500.0);
        itemHashMap.put("Refrigerator", 800.0);
        itemHashMap.put("Washing Machine", 400.0);
        itemHashMap.put("Laptop", 1000.0);

        ElectronicItemDetails obj = new ElectronicItemDetails();

        System.out.println("Price of TV is " + obj.returnPriceOfItem(itemHashMap, "TV"));
    }
}
