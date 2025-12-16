package com.itakademija.four.decorator;

/**
 * Modifikatori vidljivosit:
 * 1. public
 * 2. private -> vidi samo klasa gdje je polje/filed deklarisano
 * 3. paketno privatno:bez keyword -> vidi samo klasa gdje je polje deklarisano AND klase u istom paketu
 * 4. protected : ekstenzija paketno privatne vidljivosti...isto package private ali vide i klase koje su u istom
 * paketu i klase koje možda nisu u istom paketu ali naslijeđuju klasu npr. BeverageDecorator
 */
class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String name() {
        return beverage.name()+ " s mlijekom";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
