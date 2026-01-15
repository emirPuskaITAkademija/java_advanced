package com.itakademija.mysql.refleksija;

public enum Season {
    //public static Season AUTUMN = new Season("Autumn");
    AUTUMN("Autumn"),
    WINTER("Winter"),
    SUMMER("Summer"),
    SPRING("Spring");

    private final String name;

    private Season(String name){
        this.name = name;
        System.out.println("Poziv konstruktora za godišnje doba: " + name);
    }

    public String getName() {
        return name;
    }
}
