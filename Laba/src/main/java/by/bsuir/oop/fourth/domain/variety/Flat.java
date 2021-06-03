package main.java.by.bsuir.oop.fourth.domain.variety;

import main.java.by.bsuir.oop.fourth.domain.Address.Address;

import java.io.Serializable;

public class Flat extends Field implements Serializable {
    private static final Long serialVersionUID = 2L;
    private int numberOfLegs;

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public Flat(Address maker, Integer area, int numberOfLegs) {
        super(maker, area);
        this.numberOfLegs = numberOfLegs;
    }

    public Flat() {
    }

    public Flat(Integer area) {
        super(area);
    }

    public static Long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Flat" +
                ":maker=" + getMaker() +
                ":area=" + getArea() +
                ":legs=" + getNumberOfLegs();
    }
}
