package com.itakademija.mysql.two;

import java.io.Serializable;
import java.time.LocalDate;
// Klasa Person će imati svoj MySQL ekvivalent Tabelu persons
//Java Bean
//1. no-arg(konstruktor bez parametara) konstruktor
//2. sva polja treba da budu private vidljivosti
//3. public getters & setters
//4. implements Serializable interfejs
public class Person implements Serializable {
    private Integer id;
    private String firstName;
    private String lastName;
    private String nin;
    private LocalDate birthday;

    public Person() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNin() {
        return nin;
    }

    public void setNin(String nin) {
        this.nin = nin;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nin='" + nin + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
