package com.epam.tm.oop.actions;

import com.epam.tm.oop.entities.Vehicle;

import java.util.List;

public interface FindVehicle {

    Vehicle find(List<Vehicle> vehicles,int parameter);

}
