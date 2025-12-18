package com.itakademija.five;

import com.itakademija.four.io.writer.Writer;
import com.itakademija.four.io.writer.WriterException;

/**
 * Relacija između klase WriterExecutor i Writer = KOMPOZICIJA
 */
public class WriterExecutor {

    //ByteWriter -> Depend upon abstraction not upon concrete implementation
    // Pravi SLABU ili JAKU VEZU
    //SLABA -> private Writer writer
    //JAKA ->  private ByteWriter byteWriter
    private Writer writer;

    public WriterExecutor(Writer writer) {
        this.writer = writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public void executeWriting(String path, String content){
        try {
            writer.write(path, content);
        } catch (WriterException e) {
            System.err.println(e.getMessage());
        }
    }
}
