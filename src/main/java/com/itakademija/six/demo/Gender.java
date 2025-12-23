package com.itakademija.six.demo;

public enum Gender {
    MALE("Muški Rod"),
    FEMALE("Ženski Rod"),
    UNKNOWN("Unknown");

    private final String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static Gender fromCode(String code){
        return switch (code){
            case "M" -> Gender.MALE;
            case "F" -> Gender.FEMALE;
            default -> Gender.UNKNOWN;
        };
    }
}
