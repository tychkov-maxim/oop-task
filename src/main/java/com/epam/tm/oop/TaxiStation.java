package com.epam.tm.oop;

import com.epam.tm.oop.actions.Countable;
import com.epam.tm.oop.entities.Car;
import com.epam.tm.oop.entities.Vehicle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaxiStation {
    public List<Vehicle> cars;
    private String name;
    //private Countable countCost;



    public TaxiStation(String name, List<Vehicle> cars) {
        this.name = name;
        this.cars = cars;

    }


    public void sort(Comparator<Vehicle> comparatorForSort){
        cars.sort(comparatorForSort);
    }

    public Vehicle findVehicle(){

        return null;
    }

    public int getAllCost(){
        int res = 0;

        for(Vehicle r : cars){
           res += r.getCost();
        }

        return res;
    }



    public static class Builder{
        public  static TaxiStation CreateTestTaxiStation(String name){


            Car car1 = new Car("Toyota","S",1100,110,5.0);
            Car car2 = new Car("Mercedes","S",2000,100,2.0);
            Car car3 = new Car("Ferrari","S",3300,220,8.0);

            List<Vehicle> cars = new ArrayList<Vehicle>();

            cars.add(car1);
            cars.add(car2);
            cars.add(car3);

            return new TaxiStation(name,cars);
        }

    }

}
