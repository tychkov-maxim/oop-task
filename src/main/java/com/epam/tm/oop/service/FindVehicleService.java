package com.epam.tm.oop.service;

import com.epam.tm.oop.entity.TaxiStation;
import com.epam.tm.oop.entity.Vehicle;

public class FindVehicleService{

    public Vehicle findVehicleByMaxSpeed(TaxiStation taxiStation, int maxSpeed) {
        for(Vehicle r : taxiStation.getVehicles())
            if (r.getMaxSpeed() >= maxSpeed) {
                return r;
            }
        return null;
    }


}
