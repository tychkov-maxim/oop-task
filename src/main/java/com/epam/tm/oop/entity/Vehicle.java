package com.epam.tm.oop.entity;

public abstract class Vehicle{

    private String brand;
    private int cost;
    private int maxSpeed;
    private double consumption;

    public Vehicle(String brand, int cost, int maxSpeed, double consumption) {
        this.brand = brand;
        this.cost = cost;
        this.maxSpeed = maxSpeed;
        this.consumption = consumption;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
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


}
