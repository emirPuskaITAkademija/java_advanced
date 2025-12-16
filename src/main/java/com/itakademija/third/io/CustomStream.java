package com.itakademija.third.io;

import java.io.Closeable;
import java.io.IOException;

public class CustomStream implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Neko je pozvao metodu close...");
    }
}
