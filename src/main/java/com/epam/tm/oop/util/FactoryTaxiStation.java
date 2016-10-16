package com.epam.tm.oop.util;

import com.epam.tm.oop.entity.Bus;
import com.epam.tm.oop.entity.Car;
import com.epam.tm.oop.entity.TaxiStation;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.*;

public class FactoryTaxiStation {

    public static final Logger log = LoggerFactory.getLogger(FactoryTaxiStation.class);

    public static TaxiStation createTaxiStationFromFile(){
        String name = PropertyManager.getInstance().propertyManager.getProperty("Name");
        TaxiStation taxiStation = new TaxiStation(name);
        getAllVehicleFromFile(taxiStation);
        return taxiStation;
    }

    public static void getAllVehicleFromFile(TaxiStation taxiStation){

        Set<String> keys = PropertyManager.getInstance().propertyManager.stringPropertyNames();

        int id;
        String value;

        for (String key : keys) {
            value = PropertyManager.getInstance().propertyManager.getProperty(key);

            if (key.replaceFirst("(.[0-9]+)", "").equals("Car")) {
                id = Integer.parseInt(key.replaceFirst("[A-z]+.", ""));
                taxiStation.addVehicle(parseCar(id, value));
            } else if (key.replaceFirst("(.[0-9]+)", "").equals("Bus")) {
                id = Integer.parseInt(key.replaceFirst("[A-z]+.", ""));
                taxiStation.addVehicle(parseBus(id, value));

            }
        }
    }

    private static Car parseCar(int id, String carString){
        String[] car = carString.split(",");
         return new Car(id,car[0], Money.of(CurrencyUnit.USD, Integer.parseInt(car[1])), Integer.parseInt(car[2]),Double.parseDouble(car[3]),Integer.parseInt(car[4]),Car.EuroCarSegment.valueOf(car[5]));

    }

    private static Bus parseBus(int id, String busString){
        String[] bus = busString.split(",");
        return new Bus(id,bus[0], Money.of(CurrencyUnit.USD, Integer.parseInt(bus[1])), Integer.parseInt(bus[2]),Double.parseDouble(bus[3]),Integer.parseInt(bus[4]),Bus.Uses.valueOf(bus[5]));
    }

}
