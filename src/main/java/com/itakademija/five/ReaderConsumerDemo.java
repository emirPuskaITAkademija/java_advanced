package com.itakademija.five;

import com.itakademija.four.io.reader.Reader;
import com.itakademija.four.io.reader.ReaderException;
import com.itakademija.four.io.reader.ReaderFactory;
import com.itakademija.four.io.reader.ReaderType;

/**
 * OOP
 * <p>
 * Razdvoji KREIRANJE objekata(poziv new LineReader..) od njihovog KORIŠTENJA(lineReader mu je potrebna)
 *
 * <p>
 * Factory.. -> on treba da poziva konstruktor new LineReader()
 * Consumer..-> on treba varijablu/objekat lineReader al ne treba da on kreira tu varijablu
 * </p>
 * </p>
 *
 */
public class ReaderConsumerDemo {
    public static void main(String[] args) {
        ReaderType readerType = ReaderType.LINE;
        Reader lineReader = ReaderFactory.createReader(readerType);
        //ova metoda u potpisu ima throws ReaderException
        try {
            String result = lineReader.read("data.txt");
            System.out.println(result);
        } catch (ReaderException e) {
            System.err.println(e.getMessage());
        }
    }
}
