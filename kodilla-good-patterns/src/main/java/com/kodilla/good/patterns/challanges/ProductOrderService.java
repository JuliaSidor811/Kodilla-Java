package com.kodilla.good.patterns.challanges;

import java.time.LocalDate;

public class ProductOrderService implements SaleService{
    @Override
    public boolean sale(User user, Product product, LocalDate dateOfSale) {
        System.out.println("Zakup produktu: "+ product.getName() + " przez: "+
                user.getFirstName() +" "+user.getSecondName()+ " ("+ user.getUserName()+" ) "+
                "w dniu: "+ dateOfSale.toString() );
        return true;
    }
}
