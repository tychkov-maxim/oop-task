package com.epam.tm.oop.service;

import com.epam.tm.oop.entity.TaxiStation;
import com.epam.tm.oop.entity.Vehicle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaxiStationService {

    public Vehicle findVehicleByMaxSpeed(TaxiStation taxiStation, int maxSpeed) {
        for(Vehicle r : taxiStation.getVehicles())
            if (r.getMaxSpeed() >= maxSpeed) {
                return r;
            }
        return null;
    }

    public int getTotalCostofCars(TaxiStation station) {
        int res = 0;
        for (Vehicle r : station.getVehicles())
            res += r.getCost();
        return res;
    }

    public List<Vehicle> SortCarsByConsumption(TaxiStation taxiStation, Comparator<Vehicle> sorter){
        List<Vehicle> vehicles = new ArrayList<>(taxiStation.getVehicles());
        vehicles.sort(sorter);
        return vehicles;
    }

    public static final Comparator<Vehicle> SORTER_CARS_BY_CONSUMPTION = new VehicleComparator();

    private static class VehicleComparator implements Comparator<Vehicle>{
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

}
