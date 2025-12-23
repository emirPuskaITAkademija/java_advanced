package com.itakademija.six.demo;

import com.itakademija.four.io.reader.Reader;
import com.itakademija.four.io.reader.ReaderException;
import com.itakademija.four.io.reader.ReaderFactory;
import com.itakademija.four.io.reader.ReaderType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonReader {

    public List<Person> readPersons(String personFilePath) {
        List<Person> personList = new ArrayList<>();
        Reader reader = ReaderFactory.createReader(ReaderType.LINE);
        try {
            String allPersonsContent = reader.read(personFilePath);
            //Linux -> \n : Windows -> \r\n
            String lineSeparator = System.lineSeparator();
            String[] personContentArray = allPersonsContent.split(lineSeparator);
            for (String line : personContentArray) {
                //Milica;Ivanović;F;2000-04-22
                String[] personFields = line.split(";");
                String code = personFields[2];
                Gender spol = Gender.fromCode(code);
                //                String[] dateParts = date.split("-");
//                int year = Integer.parseInt(dateParts[0]);//"2000" -> 2000
//                int month = Integer.parseInt(dateParts[1]); // "04" -> 4
//                int day = Integer.parseInt(dateParts[2]); // "22" -> 22
//                LocalDate birthday = LocalDate.of(year, month, day);
                //"2000-04-22"
                String date = personFields[3];
                LocalDate birthday = LocalDate.parse(date);
                Person person = new Person()
                        .setName(personFields[0])
                        .setSurname(personFields[1])
                        .setGender(spol)
                        .setBirthday(birthday);
                personList.add(person);
            }
//            System.out.println(allPersonsContent);
        } catch (ReaderException e) {
            System.err.println(e.getMessage());
        }
        return personList;
    }
}
