package com.epam.tm.oop.entity;

import org.joda.money.Money;

public class PassengerVehicle extends Vehicle {

    private int AmountPassengerSeat;

    public PassengerVehicle(int id, String brand, Money cost, int maxSpeed, double consumption, int amountPassengerSeat) {
        super(id, brand, cost, maxSpeed, consumption);
        AmountPassengerSeat = amountPassengerSeat;
    }

    public int getAmountPassengerSeat() {
        return AmountPassengerSeat;
    }

    public void setAmountPassengerSeat(int amountPassengerSeat) {
        AmountPassengerSeat = amountPassengerSeat;
    }

}
