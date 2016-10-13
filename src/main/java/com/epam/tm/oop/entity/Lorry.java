package com.epam.tm.oop.entity;

import org.joda.money.Money;

public class Lorry extends Vehicle{
    /** carrying capacity in kilogrammes*/
    private int capacity;

    public Lorry(int id, String brand, Money cost, int maxSpeed, double consumption, int capacity) {
        super(id, brand, cost, maxSpeed, consumption);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
