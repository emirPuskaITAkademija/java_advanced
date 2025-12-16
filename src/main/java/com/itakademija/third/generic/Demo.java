package com.itakademija.third.generic;

import java.time.LocalDate;

/**
 * Tipovi podataka:
 * <li>1. PROSTI/PRIMITIVNI/UGRAĐENI</li>
 * <li>2. SLOŽENE/OBJEKTNE
 *     <podgrupa 1> SIROVE SLOŽENE/ RAW type </podgrupa>
 *     <podgrupa 2> PARAMETRIZIRANE SLOŽENE tipove podataka (GENERIČNIM TIPOVIMA)</podgrupa>
 * </li>
 *
 * Zašto su uvedeni omotači prostih tipova:
 *  <ODGOVOR> Kako bi se mogli koristiti u parametrizaciji generičnih tipova podatak
 *
 *    E, F -> ne može zamjena biti za njih int, float(Integer, Float, Double..)
 *  </ODGOVOR>
 *
 *  Dvije grupe generični tipova:
 *  <li>1. UNBOUNDED E, F </li>
 *  <li>2. BOUNDED</li>
 *
 */
public class Demo {
    public static void main(String[] args) {
        int number = 23;
        Person person = new Person("Stefan", "Bantić", LocalDate.now());
        person.setSurname("Bantić Ženino");

        //1.6 -> veliki upgrade
        //Kojeg je tipa boxObjekat -> Box
        // boxObjekat je TIPA Box, ali je parametrizovan sa String i Integer(njegova polja su tog tipa)
        Box<String, Integer> boxObjekat = new Box<String, Integer>();
        boxObjekat.setElement(23);
        boxObjekat.setField("Text");

        //Kojeg je tipa numberObjekat ?  DA Box
        // numberObjekat je TIPA Box, a parametrizovan je sa Double, Integer odnosno njegova polja su Double i Integer tipa
        Box<Double, Integer> numberObjekat = new Box<>();
        numberObjekat.setField(23.0);
        numberObjekat.setElement(23);

        int broj = 23; //tip_podatka varijabla = vrijednost;
        Integer broj2 = 23; // TIP_PODATKA varijabla = vrijednost;

        int prostaVarijabla = broj2;

        //Ovo ja ne mogu raditi ?
        //ZAKLJUČAK: ne mogu parametrizirati objekte sa primitivnim tipovima podataka
        //Postoji za malo double -> Double
        //Postoji za malo int -> Integer
        Box<Double, Integer> treciObjekat = new Box<>();

        Box<Integer, Person> personBoxObjekat = new Box<>();
        personBoxObjekat.setElement(person);
        CustomNumber customNumber = new CustomNumber();
        NumberBox<CustomNumber> numberBox = new NumberBox<>();
    }
}
