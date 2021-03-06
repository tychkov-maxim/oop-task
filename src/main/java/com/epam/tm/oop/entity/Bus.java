package com.epam.tm.oop.entity;

import org.joda.money.Money;

public class Bus extends PassengerVehicle {

    /** uses like tourism or student buss or private charter*/
    private Uses uses;

    public Bus(int id, String brand, Money cost, int maxSpeed, double consumption, int amountPassengerSeat, Uses uses) {
        super(id, brand, cost, maxSpeed, consumption, amountPassengerSeat);
        this.uses = uses;
    }


    public Uses getUses() {
        return uses;
    }

    public void setUses(Uses uses) {
        this.uses = uses;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "uses=" + uses + super.toString();
    }



    public enum Uses{
        PRIVATE_CHARTER("private charter"),TOURISM("tourism"), STUDENT_TRANSPORT("student transport");

        private String uses;

        Uses(String uses) {
            this.uses = uses;
        }
    }
}
