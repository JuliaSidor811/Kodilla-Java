package com.kodilla.good.patterns.challanges;

import java.time.LocalDate;

public class DataSaleRepository implements SaleRepository{
    @Override
    public boolean createSale(User user, Product product, LocalDate dateOfSale) {
        System.out.println("Zapisano w bazie danych --> " +product.getName() +", "+ user.getUserName()+ ", "+ dateOfSale.toString() );

        return true;
    }
}
