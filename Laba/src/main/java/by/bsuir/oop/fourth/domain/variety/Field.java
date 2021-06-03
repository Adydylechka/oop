package main.java.by.bsuir.oop.fourth.domain.variety;

import main.java.by.bsuir.oop.fourth.domain.Address.Address;

import java.io.Serializable;

public abstract class Field extends Space implements Serializable {
    private Integer area;

    public Field() {
    }

    public Field(Integer area) {
        this.area = area;
    }

    public Field(Address maker, Integer area) {
        super(maker);
        this.area = area;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }
}
