package com.epam.tm.oop;

import com.epam.tm.oop.actions.SortByConsuption;

public class Main {
    public static void main(String[] args) {

        TaxiStation taxi = TaxiStation.Builder.CreateTestTaxiStation();



        SortByConsuption s = new SortByConsuption();
        taxi.sort(s);

        System.out.println(taxi);
    }
}
