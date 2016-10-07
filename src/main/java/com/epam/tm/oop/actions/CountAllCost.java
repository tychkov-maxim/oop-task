package com.epam.tm.oop.actions;

import com.epam.tm.oop.entities.Vehicle;

import java.util.List;

public class CountAllCost implements Countable{
    @Override
    public int getCost(List<Vehicle> vehicles) {
        int res = 0;
        for (Vehicle r : vehicles)
            res += r.getCost();

        return res;
    }
}
