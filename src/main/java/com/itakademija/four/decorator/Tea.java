package com.itakademija.four.decorator;

class Tea implements Beverage{
    @Override
    public String name() {
        return "Čaj";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
