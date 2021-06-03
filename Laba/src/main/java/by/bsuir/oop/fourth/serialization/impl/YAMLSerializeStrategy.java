package main.java.by.bsuir.oop.fourth.serialization.impl;

import main.java.by.bsuir.oop.fourth.container.Container;
import main.java.by.bsuir.oop.fourth.domain.variety.Flat;
import main.java.by.bsuir.oop.fourth.serialization.api.SerializeStrategy;
import main.java.by.bsuir.oop.fourth.util.impl.Info;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public final class YAMLSerializeStrategy implements SerializeStrategy {
    private static YAMLSerializeStrategy yamlVersion;
    private final ObjectMapper mapper;

    private YAMLSerializeStrategy() {
        mapper = new ObjectMapper(new YAMLFactory());
    }

    public static YAMLSerializeStrategy getYamlVersion() {
        if (yamlVersion == null) {
            yamlVersion = new YAMLSerializeStrategy();
        }
        return yamlVersion;
    }

    @Override
    public Container<Flat> read(File file) {
        Container<Flat> container = null;
        try {
            container = mapper.readValue(file, new TypeReference<Container<Flat>>() {
            });
        } catch (IOException exception) {
            System.out.println("I/O exception");
        }
        return container;
    }

    @Override
    public boolean write(File file, Container<Flat> container) throws IOException {
        Info.getWorker().createFile(file);
        try (Writer writer = new FileWriter(file.getAbsolutePath(), StandardCharsets.UTF_8)) {
            mapper.writeValue(writer, container);
        } catch (IOException exception) {
            throw new IOException("Can not write info");
        }
        return true;
    }
}
