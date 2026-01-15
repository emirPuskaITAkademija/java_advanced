package com.itakademija.mysql.niti;

import java.util.Arrays;
import java.util.List;

/**
 * Brian Goetz: Concurrency In Practice
 * Postoje 2 vrste zahtjevnih funkcija/metoda
 * <li>1. IO intensive operacije</li>
 * <li>2. computational intensive </li>
 * <p>
 * Core(8 jezgri procesora)
 * NUMBER_OF_THREAD =   ------------------------------------
 * 1 - BLOCKING_FACTOR
 * <p>
 * 0 <=  BLOCKING_FACTOR < 1
 *
 *
 */
public class Sample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 34, 343, 5, 4, 54, 45, 45, 2323, 544, 5);
        // suma svih parnih brojeva
//        int sum = 0;
//        for(int number: numbers){
//            if(number % 2 == 0){
//                sum+=number;
//            }
//        }
//        System.out.printf("Suma = %s%n", sum);
        int suma = numbers
                .stream()
//                .parallel() MASTER
                .filter(n -> n % 2 == 0)
                .reduce(0, (n1, n2) -> n1 + n2);
        System.out.println("Suma = " + suma);
    }
}
