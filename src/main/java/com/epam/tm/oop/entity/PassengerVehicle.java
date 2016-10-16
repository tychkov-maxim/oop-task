package com.epam.tm.oop.entity;

import org.joda.money.Money;

public class PassengerVehicle extends Vehicle {

    private int amountPassengerSeat;

    public PassengerVehicle(int id, String brand, Money cost, int maxSpeed, double consumption, int amountPassengerSeat) {
        super(id, brand, cost, maxSpeed, consumption);
        this.amountPassengerSeat = amountPassengerSeat;
    }

    public int getAmountPassengerSeat() {
        return amountPassengerSeat;
    }

    public void setAmountPassengerSeat(int amountPassengerSeat) {
        this.amountPassengerSeat = amountPassengerSeat;
    }

}
