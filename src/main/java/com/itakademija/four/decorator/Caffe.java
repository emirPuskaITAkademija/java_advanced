package com.itakademija.four.decorator;

class Caffe implements Beverage{
    @Override
    public String name() {
        return "Kafa";
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
