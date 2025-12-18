package com.itakademija.four.io.writer;

/**
 * U Javi 8 se pojavio jedan specifičan interfejs.. FUNKCIONALNI INTERFEJS
 * <p>
 *     Potreban i dovoljan uslov da interfejs bude funkcionalni je:
 *     <li>1. samo jednu apstraktnu metoda</li>
 * </p>
 */
@FunctionalInterface
public interface Writer {
    //static vs non-static(instancna metoda)
    void write(String path, String content) throws WriterException;

//    //static vs non-static -> objekatWriter.print();
//    default void print(){
//        System.out.println("Ispis...");
//    }
//
//    public static void nekaStaticMetoda(){
//
//    }
//
//    private static void privatnaStaticMetoda(){
//
//    }
}
