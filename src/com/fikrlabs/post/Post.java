package com.fikrlabs.post;

import java.util.HashMap;
import java.util.Map;

public class Post {
    private static double total;
    private static Map<String,Double> inventory = new HashMap<String,Double>();

    public static void scan(String upc) {
        total += inventory.get(upc).doubleValue();
    }

    public static double getTotal() {
        return total;
    }

    public static void addItemToInventory(String upc , double cost) {
        inventory.put(upc, new Double(cost));
    }
}
