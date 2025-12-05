package com.itakademija.two;

import com.itakademija.one.animal.Bird;
import com.itakademija.one.animal.Dog;
import com.itakademija.one.animal.Flyable;
import com.itakademija.one.human.Person;

/**
 * EXPECTED : line1, line2, line3, line4, line5
 * EXCEPTION: error -> Java Exception
 *
 * KLASA: suština postojanaj klase je kreiranje varijabli ili objekata po tom šablonu klase
 * Person
 * p1, p2, p3
 *
 * KO JE POZVAO KONSTRUKTOR klase Person i zašto ?
 * p1 = new Person()
 * p2 = new Person();
 * p3 = new Person();
 *
 * ArrayIndexOutOfBoundsException exception = new ArrayIndexOutOfBoundsException();
 * -> kad se kreira po šablonu klase ArrayIndexOutOfBoundsException objekat znači da se desila greška
 *
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        int[] numbers = new int[2];//line1
        numbers[0] = 23;//line2
        numbers[1] = 24;//line3
        //System.out.println(numbers[2]);//line 4 Ovaj ERROR/Exception je rezultat naše programerske nepažnje
        // Iako smo mi kreirali sintaksno ispravan program i kompajlira program
        // u momentu kada smo pokrenuli program on je PAO . RUNTIME
        // RuntimeException
        System.out.println(numbers[0]);//line 5

        Bird bird = new Bird("Ptičica");
        bird.fly();
        System.out.println(bird);
    }
}
