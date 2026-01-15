package com.itakademija.mysql.niti;

/**
 * Samo sa jednim thread kada želimo promijeniti vrijhednost varijable c koji su koraci:
 * 1. iz memorije dobaviti trenutnu vrijednost c  0
 * 2. povećati/smanjiti/uraditi operaciju nad c   ++  1
 * 3. vratiti nazad u memoriju izmijenju vrijednost  1
 *
 * // Thread A & Thread B
 * 1. Thread A: dohvati c = 0
 * 2. Thread B: dohvati c = 0
 * 3. Thread A: c++ -> 0 na c = 1
 * 4. Thread B: c-- -> 0 na c = -1
 * 5. Thread A: vratiti c = 1
 * 6. Thread B: vratiti c = -1
 */
public class Counter {
    private int c = 0;

    public void increment(){
        c++;
    }

    public void decrement(){
        c--;
    }

    public int value(){
        return c;
    }
}
