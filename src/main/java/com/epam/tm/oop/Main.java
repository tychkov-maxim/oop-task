package com.epam.tm.oop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Main {

    public static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws IOException {


            log.info(new String(Character.toChars(0x1f602)));
//        Properties propertyManager = new Properties();
//        propertyManager.load(Main.class.getClassLoader().getResourceAsStream("hello.properties"));
//        log.warn(propertyManager.getProperty("hello.world"));
//
//        TaxiStation taxi = TaxiStation.Builder.CreateTestTaxiStation();
//        log.info(taxi.toString());
//
//        SortByConsumption sorter = new SortByConsumption();
//        taxi.sort(sorter);
//
//        log.info(taxi.toString());
//
//        CountAllCost count = new CountAllCost();
//        log.info("Сумма всех ТС: " + taxi.getAllCost(count));
//
//        FindVehicleBySpeed finder = new FindVehicleBySpeed();
//        log.info("Нашел авто: " + taxi.findVehicle(finder,220));
    }
}
