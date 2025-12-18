package com.itakademija.five;

import com.itakademija.four.io.writer.Writer;
import com.itakademija.four.io.writer.WriterType;
import com.itakademija.third.generic.Person;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Objekat se kreira ISKLJUČIVO preko operatora new.
 * <p>
 *     U Javi 8 kada dođe do kreiranja objekata TIPA funkcionalnog interfejsa
 *     onda je zamjena za new LAMBDA operator (   -> )
 * </p>
 */

//        Writer pisač = (putanjuDoFajla, sadržaj) -> {
//            try(FileWriter fileWriter = new FileWriter(putanjuDoFajla)){
//                fileWriter.write(sadržaj);
//            }catch (IOException e){
//                System.err.println(e.getMessage());
//            }
//        };
//
//Writer pisač2 = (f, c) -> WriterDemo.pišeSadržajKaFajlu(f, c);
////Ovdje mi pozivamo STATIC metodu u lambdi => imeKlase::imeMetode
//Writer pisač3 =  WriterDemo::pišeSadržajKaFajlu;
//
//CustomFileWriter customFileWriter = new CustomFileWriter();
////Lambda poziva INSTANCNZ meotodu => imeObjekta::imeMetode
//Writer pisač4 = customFileWriter::writeToFile;
public class WriterDemo {
    public static void main(String[] args) {
//        Writer writer = WriterFactory.createWriter(WriterType.BYTE_WRITER);
        Writer writer = WriterType.OBJECT_WRITER.getWriter();
        Person person = new Person("Kristijan", "Bantić", LocalDate.now());
        WriterExecutor writerExecutor = new WriterExecutor(writer);
        writerExecutor.executeWriting("novi_fajl.txt", "Milica već zna sve o LAMBDA/METHOD referenciranja");
    }

//    private static void pišeSadržajKaFajlu(String filePath, String fileContent){
//        try(FileWriter fileWriter = new FileWriter(filePath)){
//            fileWriter.write(fileContent);
//        }catch (IOException e){
//            System.err.println(e.getMessage());
//        }
//    }
}
