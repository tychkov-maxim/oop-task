package com.epam.tm.oop;

import com.epam.tm.oop.entity.TaxiStation;
import com.epam.tm.oop.service.TaxiStationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Main {

    public static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args){


//        Properties propertyManager = new Properties();
//        propertyManager.load(Main.class.getClassLoader().getResourceAsStream("hello.properties"));
//        log.warn(propertyManager.getProperty("hello.world"));
//
        TaxiStation taxi = TaxiStation.Builder.CreateTestTaxiStation();
        log.info("Taxi {}",taxi);
        TaxiStationService taxiStationService  = new TaxiStationService();
        taxiStationService.SortCarsByConsumption(taxi,taxiStationService.SORTER_CARS_BY_CONSUMPTION);
        log.info("Sorted list of cars: {}",taxi);
        log.info("The total cost of vehicle in taxi station: {}",taxiStationService.getTotalCostofCars(taxi));
        log.info("Found vehicle: {}",taxiStationService.findVehicleByMaxSpeed(taxi,220));
    }
}
