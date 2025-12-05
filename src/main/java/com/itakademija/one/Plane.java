package com.itakademija.one;

import com.itakademija.one.animal.Flyable;

public class Plane implements Flyable {
    @Override
    public void fly() {
        System.out.println("I am plane and I am flying");
    }
}
