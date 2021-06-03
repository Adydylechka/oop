package main.java.by.bsuir.oop.fourth.domain.variety;

import main.java.by.bsuir.oop.fourth.domain.Address.Address;

public class Cloakroom extends Room {
    private int numberOfHooks;

    public Cloakroom(int width, int length, int numberOfHooks) {
        super(width, length);
        this.numberOfHooks = numberOfHooks;
    }

    public Cloakroom(Address maker, int width, int length, int numberOfHooks) {
        super(maker, width, length);
        this.numberOfHooks = numberOfHooks;
    }

    public Cloakroom(int numberOfHooks) {
        this.numberOfHooks = numberOfHooks;
    }

    public Cloakroom(Address maker, int numberOfHooks) {
        super(maker);
        this.numberOfHooks = numberOfHooks;
    }

    public Cloakroom(Address maker) {
        super(maker);
    }

    public Cloakroom() {
    }

    public int getNumberOfHooks() {
        return numberOfHooks;
    }

    public void setNumberOfHooks(int numberOfHooks) {
        this.numberOfHooks = numberOfHooks;
    }
}
