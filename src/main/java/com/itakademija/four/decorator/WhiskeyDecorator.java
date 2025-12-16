package com.itakademija.four.decorator;

public class WhiskeyDecorator extends BeverageDecorator {
    public WhiskeyDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String name() {
        return beverage.name() + " s whiskey";
    }

    @Override
    public double cost() {
        return beverage.cost() + 20.4;
    }
}
