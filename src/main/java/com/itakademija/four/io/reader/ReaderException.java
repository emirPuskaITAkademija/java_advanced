package com.itakademija.four.io.reader;

/**
 * Checked
 * Unchecked ->
 *
 * throw new Reader
 */
public class ReaderException extends Exception {

    public ReaderException(String message){
        super("READER: %s".formatted(message));
    }
}
