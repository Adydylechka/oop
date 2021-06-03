package main.java.by.bsuir.oop.fourth.util.impl;

import main.java.by.bsuir.oop.fourth.container.Container;
import main.java.by.bsuir.oop.fourth.domain.variety.Flat;
import main.java.by.bsuir.oop.fourth.util.api.FileAddress;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Info {
    public static final String CIPHERS_PATH = "C:\\Users\\Lenovo\\Desktop\\untitled\\src\\main\\java\\encryption";
    public static final String COMPRESSION_PATH = "C:\\Users\\Lenovo\\Desktop\\untitled\\src\\main\\java\\compression";
    private static final String SERIALIZE_FILE_TXT = "C:\\Users\\Lenovo\\Desktop\\untitled\\serialize\\file.txt";
    private static final List<Class> CIPHERS = new ArrayList<>();
    private static final List<Class> COMPRESSION_METHODS = new ArrayList<>();
    private static FileAddress worker = SimpleFileAddress.getWorker();
    private static Info info;
    private Container<Flat> tables;

    private Info() {
        tables = new Container<>();
    }

    public static FileAddress getWorker() {
        return worker;
    }

    public static void setWorker(FileAddress worker) {
        Info.worker = worker;
    }

    public static Info getInfo() {
        if (info == null) {
            info = new Info();
        }
        return info;
    }

    public static List<Class> getCIPHERS() {
        return CIPHERS;
    }

    public static List<Class> getCompressionMethods() {
        return COMPRESSION_METHODS;
    }

    public String getSERIALIZE_FILE() {
        return SERIALIZE_FILE_TXT;
    }

    public Container<Flat> getTables() {
        return tables;
    }

    public void setTables(Container<Flat> tables) {
        this.tables = tables;
    }

    public void loadPlugins() throws IOException, ClassNotFoundException {
        CIPHERS.addAll(PluginLoader.loadCipherPlugins(CIPHERS_PATH));
        COMPRESSION_METHODS.addAll(PluginLoader.loadCipherPlugins(COMPRESSION_PATH));
    }
}
