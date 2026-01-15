package com.itakademija.mysql.niti;

import java.util.Arrays;
import java.util.List;

/**
 * Brian Goetz: Concurrency In Practice
 * Postoje 2 vrste zahtjevnih funkcija/metoda
 * <li>1. IO intensive operacije  -> 2 * broj jezgri procesora</li>
 * <li>2. computational intensive -> broj threadova jednak broju jezgri procesora  </li>
 * <p>
 *                              Core(8 jezgri procesora)
 * NUMBER_OF_THREAD =   ------------------------------------
 *                              1 - BLOCKING_FACTOR
 * <p>
 * 0 <=  BLOCKING_FACTOR < 1
 *
 *
 */
public class Sample2 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 34, 343, 5, 4, 54, 45, 45, 2323, 544, 5);
        numbers
                .stream()
                .parallel()
                .map(n -> transform(n))
                .forEach(n -> printIt(n));
    }


    static int transform(int number) {
        System.out.println("transformedBy thread: " + Thread.currentThread().getName());
        return number;
    }

    static void printIt(Integer number) {
        System.out.println("printedBy thread: " + Thread.currentThread().getName());
    }

    //sum+=number
    static int add(int sum, int number) {
        int result = sum + number;
        System.out.println("summedBy thread = " + Thread.currentThread().getName() + ", sum = " + sum + " number= " + number);
        return result;
    }
}
