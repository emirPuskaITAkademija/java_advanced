package com.itakademija.seven;

import com.itakademija.four.io.writer.Writer;
import com.itakademija.four.io.writer.WriterType;
import com.itakademija.six.demo.Gender;
import com.itakademija.six.demo.Person;
import com.itakademija.six.demo.PersonReader;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * LAMBDA sa kolekcijama odlično.
 * <p>
 * Šta je to Funkcionalni Interfejs ?
 * POTREBAN I DOVOLJAN uslov da interfejs bude funkcionalni jeste da ima JEDNU i SAMO jednu
 * apstraktnu metodu.
 * </p>
 * LAMBDA ->    : može se koristiti kao shortcut za kreiranje objekata TIPA funkcionalnog interfejsa
 * -> {}
 * <p>
 * Šta je to apstraktna metoda ?
 * - NEMA
 * - rezultat  IMA
 * - input params IMA 0..n
 * Šta je to metoda ili funkcija ?
 * - blok koda koji se izvršava kada neko pozove metodu
 * - rezultat koj može biti void(PRAZNINA) ili nekog tipa rezultat int, float, doble, Person, List<Person>
 * - input params: 0, 1, 2..n -> nemojte ići na veći broj parametara od 3
 * </p>
 * <p>
 * Pitanje je vezano za MAIN ..
 * -main metoda kada pakujete program u JAR a može biti .exe
 * MOŽE POSTOJATI SAMO JEDNA main mathoda .
 * </p>
 * <p>
 * Spomenuo sam prošli put 4 najvažnija funkcionalna interfejsa u Javi:
 * <li>
 * 1. Supplier<E>
 * E get();
 * </li>
 * <li>
 * 2. Consumer<E>
 * void accept(E element);
 * </li>
 * <li>
 * 3. Predicate<E>  kao tester element
 * boolean test(E element);
 * </li>
 * <li>
 * 4. Function<T, R> transformer
 * R apply(T takenParam);
 * </li>
 */
public class Demo {
    //Functional Interface LAMBDA -> operator
//        Predicate<Person> tester = person -> {
//            return person.getAge()>45;
//        };
//        Predicate<Person> tester = person -> person.getAge()>45;
//        tester.test(new Person());
    public static void main(String[] args) {
        PersonReader personReader = new PersonReader();
        List<Person> personList = personReader.readPersons("persons.csv");
//        printPersons(personList);
        //        genericPrintPersons(personList, p -> true);

//        printPersonsOlderThan(personList, 45);
//        genericPrintPersons(personList, persona -> persona.getAge()>45);

//        printPersonsYoungerThan(personList, 24);
//        Predicate<Person> tester = p -> p.getAge() < 24;
//        genericPrintPersons(personList, tester);

//        printPersonsWithinAgeRange(personList, 30, 40);
//        Predicate<Person> personTester = p -> p.getAge()>=30 && p.getAge()<=40;
//        genericPrintPersons(personList, personTester);

//        printPersonsOfSpecificGender(personList, Gender.FEMALE);
//          genericPrintPersons(personList, p-> Gender.FEMALE.equals(p.getGender()));

//        printPersonsOfSpecificGender(personList, Gender.MALE);
        Writer writer = WriterType.BYTE_WRITER.getWriter();
        //accept  => output: void    input : Person p
        //1. testirati Person p
        Predicate<Person> tester = p -> Gender.MALE.equals(p.getGender());
        //2. transformaciju Person -> String    R apply(T taken);
        Function<Person, String> personTransfomer = p -> p.getName() + " " + p.getSurname();
        //3. Consumer
        Consumer<String> consumer = personText -> System.out.println(personText);
//        processPersonList(personList, tester, personTransfomer, consumer);
        /**
         * Prije Java 8 mi smo iterirali kroz kolekciju, a sad streamamo kroz kolekciju.
         *
         */
        personList
                .stream() //Stream<Person>
                .filter(tester)//Stream<Person>
                .map(personTransfomer)//Stream<String>
                .forEach(consumer);


//        genericPrintPersons(
//                personList,
//                p -> Gender.FEMALE.equals(p.getGender()),
//                p -> writer.write("person.txt" , p.toString())
//        );
    }

    /**
     *
     * <1> 1. Person p -> testiram  Predicate test</1>
     * <2> 2. Person transformaciju String -> Function<Person, String></2>
     * <2> 2. String -> konzumiram   Consumer accept</2>
     *
     **/
    private static void processPersonList(Collection<Person> personCollection,
                                          Predicate<Person> personTester,
                                          Function<Person, String> osobaTransformator,
                                          Consumer<String> personConsumer) {
        //iteriramo kroz kolekciju
        for (Person person : personCollection) {
            //1. testira Person varijablu u kolekciji
            if (personTester.test(person)) {
                //2. transformacija Person -> String
                String personTextResult = osobaTransformator.apply(person);
                //3. konzumiramo person string represent
                personConsumer.accept(personTextResult);
            }
        }
    }

    //List vs Set
    // 1. lista dozvoljava duplikate, set ne dozvoljava
    // 2. lista pamti redoslijed, set ima neki svoj koji nije naš
    // 3. list podržava indeksiran pristup, set ne podržava indeksiran pristup
//    private static void printPersons(Collection<Person> personCollection) {
//        for (Person person : personCollection) {
//            System.out.println(person);
//        }
//    }

    //COPY PASTE
//    private static void printPersonsOlderThan(Collection<Person> personCollection, int age) {
//        for (Person person : personCollection) {
//            if (person.getAge() > age) {
//                System.out.println(person);
//            }
//        }
//    }

//    private static void printPersonsYoungerThan(Collection<Person> personCollection, int age) {
//        for (Person person : personCollection) {
//            if (person.getAge() < age) {
//                System.out.println(person);
//            }
//        }
//    }

//    private static void printPersonsWithinAgeRange(Collection<Person> personCollection, int start, int end) {
//        for (Person person : personCollection) {
//            if (person.getAge() >= start && person.getAge() <= end) {
//                System.out.println(person);
//            }
//        }
//    }

//    private static void printPersonsOfSpecificGender(Collection<Person> personCollection, Gender gender) {
//        for (Person person : personCollection) {
//            if (person.getGender().equals(gender)) {
//                System.out.println(person);
//            }
//        }
//    }
}
