package com.epam.tm.oop.entity;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

import java.util.ArrayList;
import java.util.List;

public class TaxiStation {
    private List<Vehicle> cars;
    private String name;

    public TaxiStation(String name) {
        this.name = name;
        cars = new ArrayList<>();
    }


    public boolean addVehicle(Vehicle vehicle){
        if (vehicle != null) {
            cars.add(vehicle);
            return true;
        }else
            return false;
    }

    public List<Vehicle> getVehicles(){

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.addAll(cars);

        return vehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name of taxi station: " + name + "\nAmount of Vehicle: " + cars.size();
    }
}
