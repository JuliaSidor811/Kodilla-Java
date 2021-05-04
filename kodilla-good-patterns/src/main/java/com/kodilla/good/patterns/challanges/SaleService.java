package com.kodilla.good.patterns.challanges;

import java.time.LocalDate;

public interface SaleService {
    boolean sale(User user, Product product, LocalDate dateOfSale);
}
