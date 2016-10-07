package com.epam.tm.oop.actions;

import com.epam.tm.oop.entities.Vehicle;

import java.util.Comparator;

public class SortByConsuption implements Comparator<Vehicle>{
    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        if ((o1 != null) && (o2 != null)) {

            if (o1.getConsuption() > o2.getConsuption())
                return 1;
            else if (o1.getConsuption() < o2.getConsuption())
                return -1;
            else
                return 0;

        }
        return 0;
    }
}
