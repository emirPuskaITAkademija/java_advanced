package com.itakademija.five;

import java.io.FileWriter;
import java.io.IOException;

public class CustomFileWriter {

    //CustomFileWriter c = new CustomFileWriter()
    //c.writeToFile()
    public void writeToFile(String filePath, String fileContent){
        try(FileWriter fileWriter = new FileWriter(filePath)){
            fileWriter.write(fileContent);
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
