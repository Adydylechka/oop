package main.java.by.bsuir.oop.fourth.domain.variety;

import main.java.by.bsuir.oop.fourth.domain.Address.Address;

public class Cupboard extends Room {
    private int sections;

    public Cupboard(int width, int length, int sections) {
        super(width, length);
        this.sections = sections;
    }

    public Cupboard(Address maker, int width, int length, int sections) {
        super(maker, width, length);
        this.sections = sections;
    }

    public Cupboard(int sections) {
        this.sections = sections;
    }

    public Cupboard(Address maker, int sections) {
        super(maker);
        this.sections = sections;
    }

    public Cupboard() {
    }

    public Cupboard(Address maker) {
        super(maker);
    }

    public int getSections() {
        return sections;
    }

    public void setSections(int sections) {
        this.sections = sections;
    }
}
