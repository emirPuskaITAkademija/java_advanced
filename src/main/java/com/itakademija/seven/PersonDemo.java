package com.itakademija.seven;

import com.itakademija.six.demo.Gender;
import com.itakademija.six.demo.Person;
import com.itakademija.six.demo.PersonReader;

import java.time.LocalDate;
import java.util.List;

public class PersonDemo {
    public static void main(String[] args) {
        PersonReader personReader = new PersonReader();
        Person p1 = new Person();
        p1.setName("Stefan");
        p1.setSurname("Bantić");

        Person person = new Person()// name=null, surname=null, gender=null, birthday=null
                .setName("Kristijan") //name="Kristijan", surname=null, gender=null, birthday=null
                .setSurname("Birkić")//name="Kristijan", surname="Birkić", gender=null, birthday=null
                .setGender(Gender.MALE)//name="Kristijan", surname="Birkić", gender=MALE, birthday=null
                .setBirthday(LocalDate.now());//name="Kristijan", surname="Birkić", gender=MALE, birthday=2025-12-23


        List<Person> personList = personReader.readPersons("persons.csv");
        //method chaining : Martin fowler FLUENT programming
        personList
                .stream()
                .filter(p -> p.getAge() > 28)
                .map(p -> p.getName() + " " + p.getSurname() + " | " + p.getBirthday())
                .forEach(personName -> System.out.println(personName));
        //RAZLOŽITI
//        //1. IZVOR stream
//        Stream<Person> personStream = personList.stream(); //1. svaka kolekcija ima metodu stream()
//        //2. filter nad stream pozvanu i opet smo dobili Stream objekat(modifikovan)
//        Stream<Person> modifiedStream = personStream.filter(p -> p.getGender().equals(Gender.FEMALE));//2. filter
//        Stream<String> personStringStream = modifiedStream.map(p -> p.getName() + " " + p.getSurname() + " | " + p.getBirthday());
//        //3. terminacija stream
//        personStringStream.forEach(personName -> System.out.println(personName));
    }
}
