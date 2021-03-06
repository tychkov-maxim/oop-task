package com.epam.tm.oop;

import com.epam.tm.oop.entity.TaxiStation;
import com.epam.tm.oop.service.TaxiStationService;
import com.epam.tm.oop.util.FactoryTaxiStation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args){
        TaxiStation taxiStation = FactoryTaxiStation.createTaxiStationFromFile();
        log.info("List of vehicles {}",taxiStation.getVehicles());
        TaxiStationService taxiStationService  = new TaxiStationService();
        log.info("Sorted list of vehicles: {}",taxiStationService.SortCars(taxiStation,TaxiStationService.SORTER_CARS_BY_CONSUMPTION));
        log.info("The total cost of vehicles in taxi station: {}",taxiStationService.getTotalCostOfCars(taxiStation));
        log.info("Found vehicle: {}",taxiStationService.findVehicleByMaxSpeed(taxiStation,400));
    }
}
