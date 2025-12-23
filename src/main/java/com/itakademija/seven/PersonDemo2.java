package com.itakademija.seven;

import com.itakademija.six.demo.Person;
import com.itakademija.six.demo.PersonReader;

import java.util.List;

/**
 * FP vs OOP
 *
 * IBM - neke članke--zašto je spliterator efikasniji od iterator
 */
public class PersonDemo2 {
    public static void main(String[] args) {
        PersonReader personReader = new PersonReader();
        List<Person> personList = personReader.readPersons("persons.csv");
        //method chaining : Martin fowler FLUENT programming
//        Long timeStamp = System.currentTimeMillis();
        personList
                .stream()
                .filter(p -> p.getAge() > 28)
                .map(p -> p.getName() + " " + p.getSurname() + " | " + p.getBirthday())
                .forEach(System.out::println);
//        Long endTimeStampe = System.currentTimeMillis();
//        Long period = endTimeStampe - timeStamp;
    }
}
