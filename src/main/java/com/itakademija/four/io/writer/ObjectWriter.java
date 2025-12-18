package com.itakademija.four.io.writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriter implements Writer {
    @Override
    public void write(String path, String content) throws WriterException {

    }

    public void write(String path, Object object) throws WriterException {
        try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(path))) {
            ous.writeObject(object);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
