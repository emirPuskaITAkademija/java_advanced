package com.itakademija.four.decorator;

//Relacije među klasama:
//1. naslijeđivanje
//2. kompozicija
public abstract class BeverageDecorator implements Beverage{


    //Depend upon abstraction not upon concrete implementation
    // protect final Tea tea;
    // protected final Caffe caffe;
    protected final Beverage beverage;

    public BeverageDecorator(Beverage beverage){
        this.beverage = beverage;
    }
}
