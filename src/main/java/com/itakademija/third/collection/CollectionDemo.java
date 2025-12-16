package com.itakademija.third.collection;

import com.itakademija.third.generic.Person;

import java.util.*;

/**
 * 1. OOP - inheritance , polymorphism, abstraction(interface, abstract class), enkapsulacija
 * 2. GENERIC
 *
 * <p>
 * NIZOVI imaju dva ograničenja:
 * <li>1. FIKSNA DUŽINA</li>
 * <lI>2. SVI MORAJU BITI ISTOG TIPA unutar niza</lI>
 * </p>
 */
public class CollectionDemo {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 23;
        numbers[1] = 24;
        numbers[2] = 25;

        //1. Prost Tip
        int number = 23;
        //2.1 person -> SLOŽENI SIROVI TIP PODATKA
        Person person = new Person();
        //2.2 nameCollection -> HashSet, Set, Collection
        //listOfNames -> ArrayList, List, SequencedCollection, Collection, Iterable
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Stefan");
        listOfNames.add("Elmir");
        listOfNames.add("Milica");
        listOfNames.add("Milica");
//        for (int i = 0; i < listOfNames.size(); i++) {
//            String element = listOfNames.get(i);
//            System.out.println(element);
//        }
        printCollection(listOfNames);

        //ENHANCED for loop prima objekat tipa Iterable
//        CustomCollection customCollection = new CustomCollection();
//        for(Person el: customCollection){
//
//        }

        //setOfNames -> HashSet, Set, Collection, Iterable
        Set<String> setOfNames = new HashSet<>();
        setOfNames.add("Stefan");
        setOfNames.add("Elmir");
        setOfNames.add("Milica");
        setOfNames.add("Milica");
//        for(int i = 0; i<setOfNames.size(); i++){
//            setOfNames.get(i);
//        }
        //EHHANCED FOR LOOP
//        for (String element : setOfNames) {
//            System.out.println(element);
//        }
        System.out.println();
        printCollection(setOfNames);

        System.out.println();
        Set<String> setOfNames2 = new LinkedHashSet<>();
        setOfNames2.add("Stefan");
        setOfNames2.add("Elmir");
        setOfNames2.add("Milica");
        setOfNames2.add("Milica");
        printCollection(setOfNames2);

        System.out.println();
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Stefan");
        treeSet.add("Elmir");
        treeSet.add("Milica");
        treeSet.add("Milica");
        printCollection(treeSet);
    }

    static void printCollection(Iterable<String> stringCollection) {
        for (String element : stringCollection) {
            System.out.println(element);
        }
    }
}
