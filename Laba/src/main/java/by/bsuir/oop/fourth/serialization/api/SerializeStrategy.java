package main.java.by.bsuir.oop.fourth.serialization.api;

import main.java.by.bsuir.oop.fourth.container.Container;
import main.java.by.bsuir.oop.fourth.domain.variety.Flat;

import java.io.File;

public interface SerializeStrategy {
    Container<Flat> read(File file) throws Exception;

    boolean write(File file, Container<Flat> container) throws Exception;
}
