package com.itakademija.five;

import com.itakademija.four.io.reader.*;
import com.itakademija.four.io.writer.ObjectWriter;
import com.itakademija.four.io.writer.WriterException;
import com.itakademija.third.generic.Person;

import java.time.LocalDate;

public class ObjectReadWriteDemo {
    public static void main(String[] args) throws ReaderException {
        Person person = new Person("Milica", "Ivan Rajić", LocalDate.now());
        ObjectWriter objectWriter = new ObjectWriter();
        try {
            objectWriter.write("persona.ser", person);
        } catch (WriterException e) {
            System.err.println(e.getMessage());
        }

        ObjectReader objectReader = new ObjectReader();
        Person readedPerson = (Person) objectReader.read("persona.ser", 23);
        System.out.println(readedPerson.getSurname());
    }
}
