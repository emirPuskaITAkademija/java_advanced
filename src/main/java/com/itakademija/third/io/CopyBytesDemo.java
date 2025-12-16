package com.itakademija.third.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Čitanja fajla: java.io.FileInputStream
 * Pisanja u fajl: java.io.FileOutputStream
 *
 * <p>
 * Exception <- IOException <- FileNotFoundException
 * </p>
 * Java 6:
 * try-catch-finally
 * <p>
 * Java 7:
 * try-with-resource
 */
public class CopyBytesDemo {
    public static void main(String[] args) {
        //        //Checked ili provjeravani..dakle, ne dopušta ni da kompajliram kod i da dobijem .java -> .class
        try (FileInputStream inputStream = new FileInputStream("data.txt");
             FileOutputStream outputStream = new FileOutputStream("output.txt");) {
            int c;
            while ((c = inputStream.read()) != -1) {
                System.out.println(c + " -> " + ((char) c));
                outputStream.write(c);
            }
        } catch (IOException fileNotFoundException) {
            System.err.println(fileNotFoundException.getMessage());
        }
    }
}
