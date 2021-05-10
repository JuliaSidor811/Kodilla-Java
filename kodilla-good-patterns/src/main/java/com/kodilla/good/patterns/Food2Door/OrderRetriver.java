package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDate;
import java.util.Scanner;

public class OrderRetriver {

    public Order retriveOrder(Supplier supplier){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of produtc:");
        String prodName = scanner.nextLine();
        System.out.println("Enter product type:");
        String prodType = scanner.nextLine();
        System.out.println("Enter price:");
        double prodPrice = scanner.nextDouble();
        System.out.println("Enter quantity:");
        int quantity = scanner.nextInt();

        Product product = new Product(prodName,prodType,prodPrice);
        Order order = new Order(product, supplier,quantity, LocalDate.now());

        return order;

    }
}
