package com.itakademija.one.animal;

public class Bird extends Animal implements Flyable{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("Ćiu Ćiu TUp");
    }

    @Override
    public void fly() {
        System.out.println("I am bird and I am flying");
    }
}
