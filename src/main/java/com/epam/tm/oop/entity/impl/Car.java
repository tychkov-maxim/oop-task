package com.epam.tm.oop.entity.impl;

import com.epam.tm.oop.entity.Vehicle;

public class Car extends Vehicle implements Cloneable {

    private String segment;

    public Car(String brand,String segment, int cost, int maxSpeed, double consumption) {
        super(brand, cost, maxSpeed, consumption);

        this.segment = segment;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return getBrand();
    }
}
