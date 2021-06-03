package main.java.by.bsuir.oop.fourth.domain.Address;

import java.io.Serializable;

public enum Address implements Serializable{
    PINSKDREV("Yakuba_KOLOSA_28"), KMKMEBEL("Energeticov_4"),
    PROSON("Bedi_3"), DAMAVER("Lesnaya_8");

    public String getName() {
        return name;
    }

    private final String name;

    Address(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name ;
    }
}
