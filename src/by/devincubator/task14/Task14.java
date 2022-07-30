package by.devincubator.task14;

import java.util.Map;

public class Task14 {
    private static final String[] ARRAY_PRODUCTS = {"Milk", "Bread", "Salad", "Broccoli", "Pears", "Pineapples", "Butter"};

    public static void main(String[] args) {
        MyHashMap<String, Integer> productMap = initMap();
        displayMap(productMap);
        System.out.println(" Most Frequent Product: " + mostFrequent(productMap));

        MyHashSet<String> productSet = initSet();
        displaySet(productSet);
    }

    private static MyHashMap<String, Integer> initMap() {
        MyHashMap<String, Integer> hashMap = new MyHashMap<>();
        for (String s : ARRAY_PRODUCTS) {
            hashMap.put(s, getRandomInteger(30, 70));
        }
        return hashMap;
    }

    private static MyHashSet<String> initSet() {
        MyHashSet<String> myHashSet = new MyHashSet<>();
        for (String s : ARRAY_PRODUCTS) {
            myHashSet.add(s);
        }
        myHashSet.add("Sweets");
        myHashSet.add("Chocolate");
        myHashSet.add("Cookies");
        myHashSet.add("Marmalade");
        return myHashSet;
    }

    private static String mostFrequent(MyHashMap<String, Integer> myHashMap) {
        int max = 0;
        String mostFrequentProduct = "";
        for (Map.Entry<String, Integer> entry : myHashMap.entrySet()) {
            if (entry.getValue() >= max) {
                max = entry.getValue();
                mostFrequentProduct = entry.getKey();
            }
        }
        return mostFrequentProduct;
    }

    private static int getRandomInteger(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1) + min);
    }

    private static void displayMap(MyHashMap<String, Integer> hashMap) {
        hashMap.forEach((s, integer) -> System.out.println(s));
    }

    private static void displaySet(MyHashSet<String> hashSet) {
        hashSet.forEach(s -> System.out.println(s));
    }
}
