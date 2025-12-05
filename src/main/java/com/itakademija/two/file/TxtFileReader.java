package com.itakademija.two.file;

import com.itakademija.two.exception.TextFileNotFoundException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TxtFileReader {

    /**
     * NORMALAN TOK izvršavanja mog programa je:
     * <li>1.File file = new File(filePath); </li>
     * <li>2.!file.exists() = false..dakle želimo da fajl postoji </li>
     * <li>3. System.out.println("Fajl je pronađen i možeš početi sa čitanjem..");</li>
     *
     * <p>
     * NEOČEKIVAN ili ABNORMLANA TOK je
     * <lI>1. 1.File file = new File(filePath);</lI>
     * <li>2.!file.exists() = true</li>
     * <li>3. throw new TextFileNotFoundException("Fajl na putanji '%s' ne postoji".formatted(filePath));</li>
     * NEĆE se čitati fajl :         System.out.println("Fajl je pronađen i možeš početi sa čitanjem..");
     * </p>
     *
     * @param filePath
     * @throws TextFileNotFoundException
     */
    public void readFile(String filePath) throws TextFileNotFoundException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new TextFileNotFoundException("Fajl na putanji '%s' ne postoji".formatted(filePath));
        }
        System.out.println("Fajl je pronađen i možeš početi sa čitanjem..");
        try {
            Scanner skenator = new Scanner(file);
            while (skenator.hasNextLine()) {
                String line = skenator.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
