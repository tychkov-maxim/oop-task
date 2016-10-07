package com.epam.tm.oop.actions;

import com.epam.tm.oop.entities.Vehicle;

import java.util.List;

public class FindVehicleBySpeed implements FindVehicle {
    @Override
    public Vehicle find(List<Vehicle> vehicles, int maxSpeed) {
        for(Vehicle r : vehicles)
            if (r.getMaxSpeed() >= maxSpeed) {
                return r;
            }
        return null;
    }


}
