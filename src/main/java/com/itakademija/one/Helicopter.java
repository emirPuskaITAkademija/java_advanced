package com.itakademija.one;

import com.itakademija.one.animal.Flyable;

public class Helicopter implements Flyable {
    @Override
    public void fly() {
        System.out.println("I am Helicopter and I am flying..");
    }
}
