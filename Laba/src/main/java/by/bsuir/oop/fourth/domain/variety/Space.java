package main.java.by.bsuir.oop.fourth.domain.variety;

import main.java.by.bsuir.oop.fourth.domain.Address.Address;

import java.io.Serializable;

public abstract class Space implements Serializable {
    private Address maker;

    public Space() {
    }

    public Space(Address maker) {
        this.maker = maker;
    }

    public Address getMaker() {
        return maker;
    }

    public void setMaker(Address maker) {
        this.maker = maker;
    }
}
