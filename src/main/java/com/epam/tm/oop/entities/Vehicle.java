package com.epam.tm.oop.entities;

public abstract class Vehicle {

    private String brand;
    private int cost;
    private int maxSpeed;
    private double consuption;

    public Vehicle(String brand, int cost, int maxSpeed, double consuption) {
        this.brand = brand;
        this.cost = cost;
        this.maxSpeed = maxSpeed;
        this.consuption = consuption;
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

    public double getConsuption() {
        return consuption;
    }

    public void setConsuption(int consuption) {
        this.consuption = consuption;
    }


}
