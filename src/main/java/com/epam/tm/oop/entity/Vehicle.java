package com.epam.tm.oop.entity;

import org.joda.money.Money;

public abstract class Vehicle{


    private int id;
    private String brand;
    private Money cost;
    /** Maximum speed of vehicle in kilometres per hour */
    private int maxSpeed;
    /** Fuel consumption(litres per 100km) */
    private double consumption;

    public Vehicle(int id, String brand, Money cost, int maxSpeed, double consumption) {
        this.id = id;
        this.brand = brand;
        this.cost = cost;
        this.maxSpeed = maxSpeed;
        this.consumption = consumption;
    }


    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Money getCost() {
        return cost;
    }

    public void setCost(Money cost) {
        this.cost = cost;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }



    @Override
    public String toString() {
        return ", brand='" + brand + '\'' +
                ", consumption=" + consumption + "}";
    }
}
