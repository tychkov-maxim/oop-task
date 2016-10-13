package com.epam.tm.oop.entity;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

import java.util.ArrayList;
import java.util.List;

public class TaxiStation {
    private List<Vehicle> cars;
    private String name;

    public TaxiStation(String name, List<Vehicle> cars) {
        this.name = name;
        this.cars = cars;
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




    public static class Builder{
        public  static TaxiStation CreateTestTaxiStation(){


            Car car1 = new Car(1,"Toyota",Money.of(CurrencyUnit.USD, 1000), 110,5.0,4,Car.EuroCarSegment.S);
            Car car2 = new Car(2,"Mercedes",Money.of(CurrencyUnit.USD, 2000),100,2.0,4,Car.EuroCarSegment.S);
            Car car3 = new Car(3,"Ferrari",Money.of(CurrencyUnit.USD, 3000),220,8.0,4,Car.EuroCarSegment.S);
            Car car4 = new Car(4,"Kia",Money.of(CurrencyUnit.USD, 3000),125,1.6,4,Car.EuroCarSegment.B);

            List<Vehicle> cars = new ArrayList<>();

            cars.add(car1);
            cars.add(car2);
            cars.add(car3);
            cars.add(car4);

            return new TaxiStation("test",cars);
        }
    }


    @Override
    public String toString() {
        return "Name of taxi station: " + name + "\nAmount of Vehicle: " + cars.size();
    }
}
