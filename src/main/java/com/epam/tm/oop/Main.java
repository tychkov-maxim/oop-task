package com.epam.tm.oop;

import com.epam.tm.oop.actions.CountAllCost;
import com.epam.tm.oop.actions.SortByConsuption;

public class Main {
    public static void main(String[] args) {

        TaxiStation taxi = TaxiStation.Builder.CreateTestTaxiStation();
        System.out.println(taxi);

        SortByConsuption s = new SortByConsuption();
        taxi.sort(s);

        System.out.println();
        System.out.println(taxi);

        CountAllCost count = new CountAllCost();
        System.out.println("Сумма всех ТС: " + taxi.getAllCost(count));

    }
}
