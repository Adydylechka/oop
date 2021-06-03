package main.java.by.bsuir.oop.fourth.decorator;

import main.java.by.bsuir.oop.fourth.util.api.FileAddress;
import main.java.encryption.Cipher;

import java.io.File;

public final class EncryptionDecorator extends FileAddressDecorator {
    private final Cipher cipher;

    public EncryptionDecorator(FileAddress worker, Cipher cipher) {
        super(worker);
        this.cipher = cipher;
    }

    @Override
    public String readFile(File file) throws Exception {
        return cipher.decrypt(super.readFile(file));
    }

    @Override
    public boolean writeFile(File file, String text) throws Exception {
        return super.writeFile(file, cipher.encrypt(text));
    }
}
