package com.itakademija.one.beverage;

/**
 * OOP principles:
 * 1. enkapsulacija
 * 2. abstract
 * 3. naslijeđivanje
 * 4. polimorfizam
 * <p>
 *     Single Responsibility
 *     Open Close
 *     Liskov Substitution Principle
 *     Interface Segregation Principle -> "Ne tjeraj klasu da implementira metode koje ne koristi"
 *            "Nemoj imat jedan DEBELI interface/abstrac
 *     Dependency inversion
 * </p>
 */
public abstract class Beverage {
    private String name;

    public Beverage(String name){
        this.name = name;
    }


    public abstract double cost();

    public String getName() {
        return name;
    }
}
