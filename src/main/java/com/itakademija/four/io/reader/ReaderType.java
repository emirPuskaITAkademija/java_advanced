package com.itakademija.four.io.reader;

/**
 * Zašto kreiramo klase ?
 * <p>
 *     npr. Person
 *
 *     kako bismo kreirali koliko objekata p1...pn
 * </p>
 * <p>
 *     Season 1000 godišnjih doba-> imamo samo 4 godišnja doba..
 * </p>
 * <p>
 *     4 tipa reader ..ne želimo da kreiramo 100 byte
 * </p>
 */
public enum ReaderType {
    //ReaderType BYTE = new ReaderType("Byte", "Čita byte po byte");
    BYTE("Byte Reader", "Čita byte po byte"),
    CHAR("Char Reader", "Čita char po char"),
    LINE("Line Reader", "Čita line by line"),
    OBJECT("Object Reader", "Čita od jednom cijeli objekat");

    private String name;
    private String description;

    //Konstruktor ENUMA mora biti private vidljivosti
    //Kao posljedica toga..konstruktor može biti pozvan samo iz definicije enuma
    //
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
