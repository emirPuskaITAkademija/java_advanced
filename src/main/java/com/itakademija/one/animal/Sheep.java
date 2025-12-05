package com.itakademija.one.animal;

public class Sheep extends Animal{
    public Sheep(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("Be e e e ");
    }
}
