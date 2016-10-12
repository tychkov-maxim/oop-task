package com.epam.tm.oop;

import com.epam.tm.oop.entity.TaxiStation;
import com.epam.tm.oop.service.CountCostService;
import com.epam.tm.oop.service.FindVehicleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Main {

    public static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws IOException {


//        Properties propertyManager = new Properties();
//        propertyManager.load(Main.class.getClassLoader().getResourceAsStream("hello.properties"));
//        log.warn(propertyManager.getProperty("hello.world"));
//
        TaxiStation taxi = TaxiStation.Builder.CreateTestTaxiStation();
        log.info(taxi.toString());
//

        CountCostService countCostService = new CountCostService();
        log.info(String.valueOf(countCostService.getTotalCostofCars(taxi)));
//        SortByConsumption sorter = new SortByConsumption();
//        taxi.sort(sorter);
//
//        log.info(taxi.toString());
//
//        CountAllCost count = new CountAllCost();
//        log.info("Сумма всех ТС: " + taxi.getAllCost(count));
//
        FindVehicleService findVehicleService = new FindVehicleService();

        log.info("Нашел авто: " + findVehicleService.findVehicleByMaxSpeed(taxi,220));
    }
}
