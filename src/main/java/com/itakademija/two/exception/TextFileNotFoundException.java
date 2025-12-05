package com.itakademija.two.exception;

import java.io.FileNotFoundException;

/**
 * Po šablonu klasa koje naslijeđuju RuntimException ja ne kreiram objekte.
 * <p></p>
 * Po šablonu klasa koje naslijeđuju Exception ja mogu dizajnirati i vlastiti tip greške
 */
public final class TextFileNotFoundException extends FileNotFoundException {

    public TextFileNotFoundException(String message){
        super("TEXTUALTNI FAJL :%s".formatted(message));
        System.out.println("Nedostaje tekstualni fajl");
    }
}
