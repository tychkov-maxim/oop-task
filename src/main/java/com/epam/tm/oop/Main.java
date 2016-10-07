package com.epam.tm.oop;

import com.epam.tm.oop.actions.SortByConsuption;

public class Main {
    public static void main(String[] args) {

        TaxiStation taxi = TaxiStation.Builder.CreateTestTaxiStation("Maxim");

        SortByConsuption s = new SortByConsuption();
        taxi.sort(s);

        System.out.println(taxi.getAllCost());




        System.out.println(taxi.cars.get(0).getBrand());





    }
}
