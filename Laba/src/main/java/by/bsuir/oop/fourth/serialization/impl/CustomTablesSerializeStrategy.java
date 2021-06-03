package main.java.by.bsuir.oop.fourth.serialization.impl;

import main.java.by.bsuir.oop.fourth.container.Container;
import main.java.by.bsuir.oop.fourth.domain.variety.Flat;
import main.java.by.bsuir.oop.fourth.domain.Address.Address;
import main.java.by.bsuir.oop.fourth.serialization.api.SerializeStrategy;
import main.java.by.bsuir.oop.fourth.util.impl.Info;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class CustomTablesSerializeStrategy implements SerializeStrategy {
    private static CustomTablesSerializeStrategy customVersion;

    private CustomTablesSerializeStrategy() {
    }

    public static CustomTablesSerializeStrategy getCustomVersion() {
        if (customVersion == null) {
            customVersion = new CustomTablesSerializeStrategy();
        }
        return customVersion;
    }

    @Override
    public Container<Flat> read(File file) throws Exception {
        String text = Info.getWorker().readFile(file);
        String[] lexemes = text.split("[\\[\\]]")[1].split(",");
        return getTableContainer(lexemes);
    }

    private Container<Flat> getTableContainer(String[] lexemes) {
        List<Flat> tables = new ArrayList<>();
        for (String lexeme : lexemes) {
            String[] fields = lexeme.split(":");
            Address maker = Address.valueOf(fields[1].split("=")[1]);
            int area = Integer.parseInt(fields[2].split("=")[1]);
            int legs = Integer.parseInt(fields[3].split("=")[1]);
            tables.add(new Flat(maker, area, legs));
        }
        return new Container<>(tables);
    }

    @Override
    public boolean write(File file, Container<Flat> container) throws Exception {
        Info.getWorker().createFile(file);
        String text = container.toString();
        Info.getWorker().writeFile(file, text);
        return true;
    }
}
