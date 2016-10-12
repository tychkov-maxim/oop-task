package com.epam.tm.oop;

import com.epam.tm.oop.entity.TaxiStation;
import com.epam.tm.oop.service.TaxiStationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args){

//        Properties propertyManager = new Properties();
//        propertyManager.load(Main.class.getClassLoader().getResourceAsStream("hello.properties"));
//        log.warn(propertyManager.getProperty("hello.world"));
//

        TaxiStation taxiStation = TaxiStation.Builder.CreateTestTaxiStation();
        log.info("List of vehicles {}",taxiStation.getVehicles());
        TaxiStationService taxiStationService  = new TaxiStationService();
        log.info("Sorted list of vehicles: {}",taxiStationService.SortCarsByConsumption(taxiStation,taxiStationService.SORTER_CARS_BY_CONSUMPTION));
        log.info("The total cost of vehicles in taxi station: {}",taxiStationService.getTotalCostofCars(taxiStation));
        log.info("Found vehicle: {}",taxiStationService.findVehicleByMaxSpeed(taxiStation,220));
    }
}
