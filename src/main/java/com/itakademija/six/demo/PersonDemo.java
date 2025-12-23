package com.itakademija.six.demo;

import java.util.List;
import java.util.stream.Stream;

/**
 * Collection API
 * <li>
 *     1. Consumer<E>
 *         void accept(E element);
 *     </li>
 * <li>
 *     2. Function<T, R>
 *          R apply(T taken);
 * </li>
 *<li>
 *     3. Predicate<E>   -> tester
 *          boolean test(E element);
 *</li>
 * <li>
 *     4. Supplier<E>
 *         E get();
 * </li>
 *
 */
public class PersonDemo {
    public static void main(String[] args) {
        PersonReader personReader = new PersonReader();
        List<Person> personList = personReader.readPersons("persons.csv");
        //Java 8 -> ranije smo iterirali kroz elemente kolekcija
        //Java 8+ -> sada spliteriramo IBM Brian Goetz
        // stream() -> funkcije nad streamom ti si u intermediate(međuoperacijama) operation nad stream -> funkciju ili metodu koja ne vraća više Stream ti si terminirao stream
        // Collection 1. izvor Stream objekat
        //2. Nad Stream objektom možeš pozivati funkcije koje ti neštoi urade sa istim Stream objektom i ti si u međuoperacijama nad streamom
        //3. Kad pozoveš nad Stream objektom funkciju koja ti kao rezultat ne vrati Stream nego void ili String il inekog drugog tipa element ti si terminirao stream

        Stream<Person> streamPerson = personList.stream();//1. Stream<Person>
        Stream<Person> womenStream = streamPerson.filter(p -> p.getGender().equals(Gender.FEMALE));//2. Žene Stream<Person>
        womenStream.forEach(p -> System.out.println(p));//3. koja terminira stream
        //Martin Fowler -> mutacija .. taken return

//        personList
//                .stream() //1. source of the Stream
//                .filter(p -> p.getGender().equals(Gender.FEMALE))//2. Stream<Person>
//                .forEach(p -> System.out.println(p));//3. void pa je terminirala stream

    }
}
