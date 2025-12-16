package com.itakademija.four.decorator;

public class KafanaDemo {
    public static void main(String[] args) {
        //caffe : Beverage, Caffe
        Caffe caffe = new Caffe();
        consume(caffe);
        //tea: Tea, Beverage
        Tea tea = new Tea();
        consume(tea);

        Beverage beverage = new MilkDecorator(new Caffe());
        consume(beverage);

        Beverage pićence = new MilkDecorator(new Tea());
        consume(pićence);

        Beverage novoPiće = new WhiskeyDecorator(new Caffe());
        consume(novoPiće);

        Beverage najnovijePiće = new WhiskeyDecorator(new MilkDecorator(new Caffe()));
        consume(najnovijePiće);
    }

    static void consume(Beverage beverage) {
        System.out.println(beverage.name() + " košta " + beverage.cost());
    }
}
