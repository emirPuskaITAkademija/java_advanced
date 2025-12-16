package com.itakademija.four.io;

import java.io.FileReader;
import java.io.IOException;

//java.io.FileReader
class CharacterReader implements Reader {
    @Override
    public String read(String path) throws ReaderException {
        //1. try -> izvršava se kada je sve ok
        //2. error -> catch izvršava se kada se desi exception/greška
        try (FileReader fileReader = new FileReader(path);) {
            StringBuilder sb = new StringBuilder();
            int c;
            while ((c = fileReader.read()) != -1) {
                sb.append((char) c);
            }
            return sb.toString();
        } catch (IOException e) {
            throw new ReaderException(e.getMessage());
        }
    }
}
