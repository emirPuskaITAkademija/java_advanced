package com.itakademija.four.io;

import java.io.FileInputStream;
import java.io.IOException;

// ByteReader obj = new ByteReader()
//obj.read();
// java.io.FileInputStream
class ByteReader implements Reader {

    @Override
    public String read(String path) throws ReaderException {
        //1. da definiraš blok koda koji će se izvršiti kada je sve bez greške(FileNotFoundException)
        //2. da definiraš blok koda koji će se izvršavati kada dođe do greške FileNotFOundException

        //Ako želimo dodatno izbjeći curenje memorije..onda treba neko nekad pozvat fis.close();
        try (FileInputStream fis = new FileInputStream(path);) {
            StringBuilder stringBuilder = new StringBuilder();
            int b;
            while ((b = fis.read()) != -1) {
                stringBuilder.append((char) b);
            }
            return stringBuilder.toString();
        } catch (IOException exc) {
            throw new ReaderException(exc.getMessage());
        }
    }
}
