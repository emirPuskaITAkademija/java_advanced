package com.itakademija.six.demo;

import java.util.List;

public class PersonDemo2 {
    public static void main(String[] args) {
        PersonReader personReader = new PersonReader();
        List<Person> personList = personReader.readPersons("persons.csv");
    }
}
