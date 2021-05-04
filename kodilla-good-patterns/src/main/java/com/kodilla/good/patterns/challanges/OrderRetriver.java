package com.kodilla.good.patterns.challanges;

import java.time.LocalDate;

public class OrderRetriver {
    public Order retrive(){
        User user = new User("mikroL","Marek","Kowalski", "marek729@gmail.com");
        Product product = new Product("Apple AirPods",599.98);
        Order order = new Order(user,product,LocalDate.of(2021,5,1));
        return order;
    }
}
