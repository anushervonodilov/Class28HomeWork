package com.class28HomeWork;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("Tesla");
        cars.add("Porsche");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        for (String car : cars) {
            System.out.println(car);
        }

        cars.forEach((car) -> {
            System.out.println(car);
        });

    }
}
