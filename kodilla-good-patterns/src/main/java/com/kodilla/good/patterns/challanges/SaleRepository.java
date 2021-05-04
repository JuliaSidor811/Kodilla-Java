package com.kodilla.good.patterns.challanges;

import java.time.LocalDate;

public interface SaleRepository {
    boolean createSale(User user, Product product, LocalDate dateOfSale);
}
