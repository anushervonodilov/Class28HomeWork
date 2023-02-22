package com.class28HomeWork;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Chrome");
        words.add("Border");
        words.add("Laptop");
        words.add("Compute");
        words.add("Fire");

        words.removeIf(w -> w.endsWith("e"));
        System.out.println(words);

//        for (int i = 0; i < words.size(); i++) {
//            if (words.get(i).equalsIgnoreCase("e")) {
//                words.remove(i);
//                i--;
//            }
//        }
//        System.out.println(words);

    }
}
