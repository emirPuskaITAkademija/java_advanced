package com.itakademija.one;

import com.itakademija.one.animal.Flyable;

/**
 * Zna li ovaj simulator ako u njega pogledate u njegovu definiciju.
 * Plane, Bird
 *
 *   DEPENDENCY ili zavisnost FlySimulator postoji samo od Flyable
 */
public class FlySimulator {
    //PRINCIP: Depend upon abstraction(abstract class/interface) not upon concrete implementation
    //KOMPOZICIJA jeste jednako ZAVISNOST
    // Od zavisnosti ne možemo pobjeć ? ali neka onda bude bar SLABA ZAVISNOST
    private Flyable flyable;

    public FlySimulator(Flyable flyable){
        this.flyable = flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void simulateFlying(){
        this.flyable.fly();
    }
}
