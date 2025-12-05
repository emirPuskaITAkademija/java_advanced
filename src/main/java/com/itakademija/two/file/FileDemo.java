package com.itakademija.two.file;

import com.itakademija.two.exception.TextFileNotFoundException;

import javax.swing.*;
import java.util.Scanner;

public class FileDemo {

    public static void main(String[] args) {
        System.out.println("Unesite ime fajla");
        Scanner consoleScanner = new Scanner(System.in);
        String filePath = consoleScanner.nextLine();
        TxtFileReader txtFileReader = new TxtFileReader();
        // try  -> {}
        // catch( greška ) {}
        //COMPILE ERROR ili CHECKED ili Provjeravani Exception
        try {
            System.out.println("Počinjemo sa čitanjem fajla..");
            txtFileReader.readFile(filePath);
            System.out.println("Nije desio problem. Fajl je pročitan i ne ulazimo u catch nego nastavljamo.s");
        }catch (TextFileNotFoundException exception){
            JOptionPane.showMessageDialog(null, exception.getMessage());
        }
        System.out.println("Program završio");
    }
}
