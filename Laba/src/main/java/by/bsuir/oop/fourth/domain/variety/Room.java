package main.java.by.bsuir.oop.fourth.domain.variety;

import main.java.by.bsuir.oop.fourth.domain.Address.Address;

public abstract class Room extends Space {
    private int width;
    private int length;

    public Room(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public Room(Address maker, int width, int length) {
        super(maker);
        this.width = width;
        this.length = length;
    }

    public Room() {
    }

    public Room(Address maker) {
        super(maker);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
