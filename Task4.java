package com.class28HomeWork;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Fanta");
        drinks.add("Coke");
        drinks.add("Pepsi");
        drinks.add("Soda");
        drinks.add("Tea");

        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.set(i, "water");
            }
        }
        System.out.println(drinks);

    }
}
