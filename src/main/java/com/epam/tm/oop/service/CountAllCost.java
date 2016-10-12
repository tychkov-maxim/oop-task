package com.epam.tm.oop.service;

import com.epam.tm.oop.entity.Vehicle;

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
