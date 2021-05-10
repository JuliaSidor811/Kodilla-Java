package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDate;


public class SupplierDto {
    Supplier supplier;
    LocalDate date;

    public SupplierDto(Supplier supplier, LocalDate date) {
        this.supplier = supplier;
        this.date = date;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public LocalDate getDate() {
        return date;
    }
}
