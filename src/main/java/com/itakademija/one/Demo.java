package com.itakademija.one;

import com.itakademija.one.animal.Bird;

public class Demo {

    public static void main(String[] args) {
//        Beverage beverage = new Beverage();
//        Animal animal = new Animal();
        //TIP_PODATKA varijabla = podaci i ponašanja;
        //bird: Bird, Animal, Flyable
        Bird bird = new Bird("Papko");
        Plane plane = new Plane();
        Helicopter helicopter = new Helicopter();

        // Strategy Pattern
        FlySimulator flySimulator = new FlySimulator(bird);
        flySimulator.simulateFlying();
        flySimulator.setFlyable(plane);
        flySimulator.simulateFlying();
        flySimulator.setFlyable(helicopter);
        flySimulator.simulateFlying();
    }
}
