package com.epam.tm.oop.entities;

public class Car extends Vehicle {

    private String segment;

    public Car(String brand,String segment, int cost, int maxSpeed, double consuption) {
        super(brand, cost, maxSpeed, consuption);
        this.segment = segment;
    }


    @Override
    public String toString() {
        return getBrand();
    }
}
