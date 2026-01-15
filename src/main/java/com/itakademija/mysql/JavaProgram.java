package com.itakademija.mysql;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JavaProgram {
    public static void main(String[] args) {
        //try with resource
        //buferovani tok radi brzine
        try (BufferedReader br = new BufferedReader(new FileReader("users.txt"))) {
            //predstavljace liniju tj red koji smo procitali iz fajla
            String line;
            //sve dok imamo sta da citamo
            //postoje redovi fajla za citanje
            while ((line = br.readLine()) != null) {
                //koristimo naprednu obradu teksta
                //metode klase String i regularne izraza
                String[] user = line.split("\\|");
                //prikaz u zadatom formatu
                System.out.println("User Id: " + user[0].split("\\:")[1]);
                System.out.println("First name: " + user[1].split("\\:")[1]);
                System.out.println("Last name: " + user[2].split("\\:")[1]);
                System.out.println("Uid: " + user[3].split("\\:")[1]);
                System.out.println("------------------------------------");
            }
        } catch (IOException exc) {
            //poruka o iyuyetku
            System.out.println(exc.getMessage());
        }
    }
}