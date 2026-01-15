package com.itakademija.mysql;



import java.io.*;

public class JavaProgram2 {

    public static void main(String[] args) {

        String tmpLine;

        try (BufferedReader br1 = new BufferedReader(new FileReader("first.txt"));
             BufferedReader br2 = new BufferedReader(new FileReader("second.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("union.txt"))) {
            while ((tmpLine = br1.readLine()) != null)
                bw.write(tmpLine + "\n");

            while ((tmpLine = br2.readLine()) != null)
                bw.write(tmpLine + "\n");
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
    }
}
