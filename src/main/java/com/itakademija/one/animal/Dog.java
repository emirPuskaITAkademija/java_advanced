package com.itakademija.one.animal;
// klasa kada inherit klasu -> EXTENDS
//interface kada inherit interface -> EXTENDS
// klasa inherit interface -> IMPLEMENTS

/**
 *
 */
public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("Aw Aw..");
    }

}
