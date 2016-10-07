package com.epam.tm.oop;

import com.epam.tm.oop.actions.CountAllCost;
import com.epam.tm.oop.actions.FindVehicleBySpeed;
import com.epam.tm.oop.actions.SortByConsuption;

public class Main {
    public static void main(String[] args) {

        TaxiStation taxi = TaxiStation.Builder.CreateTestTaxiStation();
        System.out.println(taxi);

        SortByConsuption sorter = new SortByConsuption();
        taxi.sort(sorter);

        System.out.println();
        System.out.println(taxi);

        CountAllCost count = new CountAllCost();
        System.out.println("Сумма всех ТС: " + taxi.getAllCost(count));

        FindVehicleBySpeed finder = new FindVehicleBySpeed();
        System.out.println("Нашел авто: " + taxi.findVehicle(finder,220));
    }
}
