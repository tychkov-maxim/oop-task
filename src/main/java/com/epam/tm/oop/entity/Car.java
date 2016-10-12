package com.epam.tm.oop.entity;

import com.epam.tm.oop.entity.Vehicle;

public class Car extends Vehicle{

    private String segment;

    public Car(String brand,String segment, int cost, int maxSpeed, double consumption) {
        super(brand, cost, maxSpeed, consumption);

        this.segment = segment;
    }

    @Override
    public String toString() {
        return getBrand();
    }
}
