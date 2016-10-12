package com.epam.tm.oop.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Properties;

public class PropertyManager {

    private static final Logger log = LoggerFactory.getLogger(PropertyManager.class);
    private static PropertyManager ourInstance = new PropertyManager();

    public static PropertyManager getInstance() {
        return ourInstance;
    }

    private Properties propertyManager;

    private PropertyManager(){


        propertyManager = new Properties();

        try {
            propertyManager.load(PropertyManager.class.getClassLoader().getResourceAsStream("hello.properties"));
        } catch (IOException e) {
            log.error("Error when try to read file",e);
        }
        log.debug("Property manager was created");
    }

    public String getStringKey(String key){
        return propertyManager.getProperty(key);
    }

    public int getIntKey(String key){
        return Integer.parseInt(propertyManager.getProperty(key));
    }
}
