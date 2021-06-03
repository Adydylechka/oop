package main.java.by.bsuir.oop.fourth.decorator;

import main.java.by.bsuir.oop.fourth.util.api.FileAddress;

import java.io.File;
import java.io.IOException;

public class FileAddressDecorator implements FileAddress {
    private final FileAddress address;

    public FileAddressDecorator(FileAddress address) {
        this.address = address;
    }

    @Override
    public String readFile(File file) throws Exception {
        return address.readFile(file);
    }

    @Override
    public boolean writeFile(File file, String text) throws Exception {
        return address.writeFile(file, text);
    }

    @Override
    public void createFile(File file) throws IOException {
        address.createFile(file);
    }
}
