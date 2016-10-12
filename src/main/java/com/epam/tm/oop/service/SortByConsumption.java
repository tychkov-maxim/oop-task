package com.epam.tm.oop.service;

import com.epam.tm.oop.entity.Vehicle;

import java.util.Comparator;

public class SortByConsumption implements Comparator<Vehicle>{
    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        if ((o1 != null) && (o2 != null)) {

            if (o1.getConsumption() > o2.getConsumption())
                return 1;
            else if (o1.getConsumption() < o2.getConsumption())
                return -1;
            else
                return 0;
        }
        return 0;
    }
}
