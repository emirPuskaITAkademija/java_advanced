package com.itakademija.four.io.writer;

public enum WriterType {
    //WriterType BYTE_WRITER = new WriterType("Byte pisač", "Upisuje u fajl byte po byte", new ByteWriter());
    BYTE_WRITER("BYTE pisač", "Upisuje u fajl byte po byte", new ByteWriter()),
    CHAR_WRITER("Char pisač", "Ovaj pisač piše slovo po slovo", new CharWriter()),
    LINE_WRITER("Line pisač", "Ovaj pisač buferuje cijelu linuju i upiše cijelu liniju", new LineWriter()),
    OBJECT_WRITER("Object pisač", "Ovaj zapiše cijeli objekat od jednom", new ObjectWriter());

    private final String name;
    private final String description;
    private final Writer writer;

    WriterType(String name, String description, Writer writer) {
        this.name = name;
        this.description = description;
        this.writer = writer;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Writer getWriter() {
        return writer;
    }
}
