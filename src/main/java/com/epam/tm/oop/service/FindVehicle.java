package com.epam.tm.oop.service;

import com.epam.tm.oop.entity.Vehicle;

import java.util.List;

public interface FindVehicle {

    Vehicle find(List<Vehicle> vehicles,int parameter);

}
