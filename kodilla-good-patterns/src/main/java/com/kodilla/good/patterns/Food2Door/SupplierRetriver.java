package com.kodilla.good.patterns.Food2Door;

import java.util.Scanner;

public class SupplierRetriver {

    public Supplier retriveSupplier(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of supplier");
        String supName = scanner.nextLine();
        System.out.println("Enter e-mail:");
        String supMail = scanner.nextLine();
        Supplier supplier = new Supplier(supName, supMail);
        return supplier;
    }
}
