package com.class28HomeWork;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("John");
        names.add("Casey");
        names.add("Jordan");
        names.add("Seth");

        if (names.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println("Not Empty");
        }

        if (names.contains("Alex")) {
            System.out.println("Yes Alex is present");
        } else {
            System.out.println("Alex is not present");
        }

        int size = names.size();
        System.out.println(size);

        for (String name : names) {
            System.out.println(name);
        }

    }
}
