package com.epam.tm.oop.service;

import com.epam.tm.oop.entity.TaxiStation;
import com.epam.tm.oop.entity.Vehicle;

import java.util.List;

public class CountCostService{

    public int getTotalCostofCars(TaxiStation station) {
        int res = 0;
        for (Vehicle r : station.getVehicles())
            res += r.getCost();

        return res;
    }
}
