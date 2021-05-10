package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args){

        SupplierDirectory supplierDirectory = new SupplierDirectory();
        List<Supplier> list = supplierDirectory.getSupplierList();

        SupplierRetriver supplierRetriver = new SupplierRetriver();
        Supplier supplier = supplierRetriver.retriveSupplier();

        OrderRetriver orderRetriver = new OrderRetriver();
        Order order = orderRetriver.retriveOrder(supplier);

        System.out.println("Cena: "+ order.getQuantity() * order.getProduct().getPrice());

        boolean isInDirectory = false;
        for (Supplier value : list) {
            if (supplier.getSupplierName().equals(value.getSupplierName())) {
                isInDirectory = true;

            }
        }



    }
}
