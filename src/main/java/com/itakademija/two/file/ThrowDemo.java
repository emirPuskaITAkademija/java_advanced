package com.itakademija.two.file;

import com.itakademija.two.exception.TextFileNotFoundException;

public class ThrowDemo {
    public static void main(String[] args) {
        TxtFileReader čitač = new TxtFileReader();
        // ON mora znati da se ovdje može ali ne mora desiti greška..
        // Kad će se greška desiti ne zavisi od metode..nego od pozivaoca koji će proslijediti putanju do fajla
        try{
            čitač.readFile("data.txt");
        }catch (TextFileNotFoundException e){
            System.err.println("GREŠKA: %s".formatted(e.getMessage()));
        }

    }
}
