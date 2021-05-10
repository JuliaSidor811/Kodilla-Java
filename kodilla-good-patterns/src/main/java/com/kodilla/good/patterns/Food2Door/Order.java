package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDate;

public class Order {

    private Product product;
    private Supplier supplier;
    private int quantity;
    private LocalDate date;

    public Order(Product product, Supplier supplier, int quantity, LocalDate date) {
        this.product = product;
        this.supplier = supplier;
        this.quantity = quantity;
        this.date = date;
    }

    public Product getProduct() {
        return product;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getDate() {
        return date;
    }
}
