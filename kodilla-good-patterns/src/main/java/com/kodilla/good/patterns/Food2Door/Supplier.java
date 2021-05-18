package com.kodilla.good.patterns.Food2Door;

public class Supplier {
    private String name;
    private String headquartersCity;
    private String mail;

    public Supplier(String name, String headquartersCity, String mail) {
        this.name = name;
        this.headquartersCity = headquartersCity;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getHeadquartersCity() {
        return headquartersCity;
    }

    public String getMail() {
        return mail;
    }
}
