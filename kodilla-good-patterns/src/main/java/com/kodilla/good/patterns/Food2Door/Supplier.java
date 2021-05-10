package com.kodilla.good.patterns.Food2Door;

public class Supplier{

    private String supplierName;
    private String mail;

    public Supplier(String supplierName, String mail) {
        this.supplierName = supplierName;
        this.mail = mail;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getMail() {
        return mail;
    }


}
