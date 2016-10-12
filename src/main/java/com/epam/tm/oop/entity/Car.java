package com.epam.tm.oop.entity;


import org.joda.money.Money;

public class Car extends Vehicle{

    private EuroCarSegment segment;

    public Car(int id, String brand, Money cost, int maxSpeed, double consumption, EuroCarSegment segment) {
        super(id, brand, cost, maxSpeed, consumption);
        this.segment = segment;
    }

    @Override
    public String toString() {
        return "Car{" +
                "segment='" + segment + '\''
                + super.toString();
    }

    public enum EuroCarSegment{
        A("mini Car"),B("small car"),C("medium car"),D("large car"),E("executive car"),F("luxury car"),J("sport utility car"),M("multi purpose car"),S("sport car");
        private String segment;
        EuroCarSegment(String segment) {
            this.segment = segment;
        }
    }
}
