package com.itakademija.one.animal;

/**
 * Suština postojanje klase:
 * <odgovor>
 *     definiranja šablona za objekte
 * </odgovor>
 *
 * Suština postojanja abstract klase jeste da se nametne šablon ponašanja svih klasama
 * koje su animalnog tipa.
 */
public abstract class Animal {

    private String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void playSound();

    //Znamo da sve životinje ne lete. Interface Seggregation Princip NARUŠEN
    //"Ne tjera klasu da implementira metodu koje ne koristi"
    //Bolje je imati više apstrakcije/interfejsa nego jedan sa mnogo apstraktnih
//    public abstract void fly();

    public String getName() {
        return name;
    }
}
