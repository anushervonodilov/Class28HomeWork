package com.class28HomeWork;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Insurance {

    private String insuranceName;
    abstract void getQuote();
    abstract void cancelInsurance();

    Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public String getInsuranceName() {
        return insuranceName;
    }
}

class Car extends Insurance {

    private String carModel;

    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }

    @Override
    void getQuote() {
        System.out.println("Car class quote");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Car class insurance");
    }
}

class Pet extends Insurance {
    private String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }

    public String getPetType() {
        return petType;
    }

    public void getQuote() {
        System.out.println("Getting a pet insurance quote for " + getInsuranceName() + " - " + petType);
    }

    public void cancelInsurance() {
        System.out.println("Canceling pet insurance for " + getInsuranceName() + " - " + petType);
    }
}

class Health extends Insurance {

    public Health(String insuranceName) {
        super(insuranceName);
    }

    public void getQuote() {
        System.out.println("Getting a health insurance quote for " + getInsuranceName());
    }

    public void cancelInsurance() {
        System.out.println("Canceling health insurance for " + getInsuranceName());
    }

    public static void main(String[] args) {

        ArrayList<Insurance> insurances = new ArrayList<>();
        insurances.add(new Car("Car Insurance", "Toyota"));
        insurances.add(new Pet("Pet Insurance", "Dog"));
        insurances.add(new Health("Health Insurance"));

        for (int i = 0; i < insurances.size(); i++) {
            Insurance insurance = insurances.get(i);
            insurance.getQuote();
            insurance.cancelInsurance();
        }
        for (Insurance insurance : insurances) {
            System.out.println(insurance.getInsuranceName());
            insurance.getQuote();
            insurance.cancelInsurance();
            System.out.println();
        }

        // Access methods using iterator
        Iterator<Insurance> iterator = insurances.iterator();
        while (iterator.hasNext()) {
            Insurance insurance = iterator.next();
            System.out.println(insurance.getInsuranceName());
            insurance.getQuote();
            insurance.cancelInsurance();
            System.out.println();
        }

    }

}

