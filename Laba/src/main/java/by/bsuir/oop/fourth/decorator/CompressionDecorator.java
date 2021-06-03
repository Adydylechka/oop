package main.java.by.bsuir.oop.fourth.decorator;

import main.java.by.bsuir.oop.fourth.util.api.FileAddress;
import main.java.compression.Compression;

import java.io.File;

public final class CompressionDecorator extends FileAddressDecorator {
    private final Compression compression;

    public CompressionDecorator(FileAddress worker, Compression compression) {
        super(worker);
        this.compression = compression;
    }

    @Override
    public String readFile(File file) throws Exception {
        return compression.decompression(super.readFile(file));
    }

    @Override
    public boolean writeFile(File file, String text) throws Exception {
        return super.writeFile(file, compression.compression(text));
    }
}
