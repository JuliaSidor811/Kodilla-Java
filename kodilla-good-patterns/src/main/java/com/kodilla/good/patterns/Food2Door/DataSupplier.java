package com.kodilla.good.patterns.Food2Door;

public class DataSupplier implements SupplierRepository{
    @Override
    public boolean saveToRepository(Supplier supplier, SupplierDirectory supplierDirectory) {
        supplierDirectory.getSupplierList().add(supplier);
        System.out.println("Poprawnie zapisano do bazy danych");
        return true;
    }
}
