package main.java.by.bsuir.oop.fourth.util.api;

import java.io.File;
import java.io.IOException;

public interface FileAddress {
    String readFile(File file) throws Exception;

    boolean writeFile(File file, String text) throws Exception;

    void createFile(File file) throws IOException;
}
