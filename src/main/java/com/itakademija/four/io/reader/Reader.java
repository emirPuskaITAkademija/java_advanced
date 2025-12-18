package com.itakademija.four.io.reader;

/**
 * Ovaj Reader interface ima samo jednu apstraktnu metodu.
 * Svojstveno interfejsima jeste da su svi potpisi metoda koje nemaju svoj bloka koda
 * po automatizmu potpisi ABSTRACT METHODS.
 * <p>
 *     public abstract -> podrazumijeva
 *     public abstract String read(String path) throws ReaderException;
 *
 *     Poželjno je public abstract izostaviti, ali nije pogrešno i dodati
 * </p>
 */
public interface Reader {
    String read(String path) throws ReaderException;
}
