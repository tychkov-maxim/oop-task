package com.epam.tm.oop.entity;


import org.joda.money.Money;

public class Car extends Vehicle{

    private String segment;

    public Car(int id, String brand, Money cost, int maxSpeed, double consumption, String segment) {
        super(id, brand, cost, maxSpeed, consumption);
        this.segment = segment;
    }

    @Override
    public String toString() {
        return "Car{" +
                "segment='" + segment + '\''
                + super.toString();
    }
}
