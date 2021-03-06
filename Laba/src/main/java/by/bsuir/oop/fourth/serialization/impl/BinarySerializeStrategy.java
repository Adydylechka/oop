package main.java.by.bsuir.oop.fourth.serialization.impl;

import main.java.by.bsuir.oop.fourth.container.Container;
import main.java.by.bsuir.oop.fourth.domain.variety.Flat;
import main.java.by.bsuir.oop.fourth.serialization.api.SerializeStrategy;
import main.java.by.bsuir.oop.fourth.util.impl.Info;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class BinarySerializeStrategy implements SerializeStrategy {
    private static BinarySerializeStrategy binaryVersion;

    private BinarySerializeStrategy() {
    }

    public static BinarySerializeStrategy getBinaryVersion() {
        if (binaryVersion == null) {
            binaryVersion = new BinarySerializeStrategy();
        }
        return binaryVersion;
    }


    public Container<Flat> read(File file) {
        Container<Flat> container = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file.getAbsolutePath()))) {
            container = (Container<Flat>) ois.readObject();
        } catch (FileNotFoundException exception) {
            System.out.println("Read: File not found");
        } catch (IOException exception) {
            System.out.println("Read: I/O exception");
        } catch (ClassNotFoundException e) {
            System.out.println("Read: Class not found");
        }
        return container;
    }

    @Override
    public boolean write(File file, Container<Flat> container) throws IOException {
        Info.getWorker().createFile(file);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file.getAbsolutePath()))) {
            oos.writeObject(container);
        } catch (IOException exception) {
            throw new IOException("Can not write info");
        }
        return true;
    }
}
