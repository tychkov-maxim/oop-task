package com.epam.tm.oop.util;

import com.epam.tm.oop.entity.TaxiStation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FactoryTaxiStation {

    public static final Logger log = LoggerFactory.getLogger(FactoryTaxiStation.class);

    public static TaxiStation CreateTaxiStationFromFile(){
        TaxiStation taxiStation = new TaxiStation("TaxiTaxi");

        log.info("{}",PropertyManager.getInstance().propertyManager.stringPropertyNames());

        return taxiStation;
    }

}
