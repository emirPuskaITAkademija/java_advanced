package com.itakademija.four;

import com.itakademija.four.io.reader.Reader;
import com.itakademija.four.io.reader.ReaderException;
import com.itakademija.four.io.reader.ReaderFactory;
import com.itakademija.four.io.reader.ReaderType;

public class ConsumerDemo {
    public static void main(String[] args) {
        //Ideja je da ovdje ne pozivamo konstruktor i ne konstruišemo objekte
        //Ovdje ih samo konzumiramom a Factory će ih za nas kreirati
        //Dvije stvari mi smetaju:
        //1.  ReaderFactory.createReader("CHARmogupogrijnešiti");
        //2. nisam forsirao princip: razdvoji kreiranje objekata od njihovog korištenja : POPRAVLJENA
//        LineReader lineReader = new LineReader(); -> OVO ŽELIM SPRIJEČITI
        Reader reader = ReaderFactory.createReader(ReaderType.LINE);
        try {
            String fileContent = reader.read("data.txt");
            System.out.println(fileContent);
        } catch (ReaderException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
