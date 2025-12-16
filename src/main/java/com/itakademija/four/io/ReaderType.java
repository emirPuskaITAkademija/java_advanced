package com.itakademija.four.io;

public enum ReaderType {
    //ReaderType BYTE = new ReaderType("Byte", "Čita byte po byte");
    BYTE("Byte Reader", "Čita byte po byte"),
    CHAR("Char Reader", "Čita char po char"),
    LINE("Line Reader", "Čita line by line"),
    OBJECT("Object Reader", "Čita od jednom cijeli objekat");

    private String name;
    private String description;

    private ReaderType(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
