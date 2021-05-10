package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class SupplierDirectory {

    private final List<Supplier> supplierList = new ArrayList<>();

    public SupplierDirectory(){
        supplierList.add(new Supplier("ExtraFoodShop", "extraFood@wp.pl" ));
        supplierList.add(new Supplier("GlutenFreeShop", "zeroGluten@gmail.pl"));
        supplierList.add(new Supplier("HealthyFood", "heal2839@pjwstk.edu.pl"));
    }

    public List<Supplier> getSupplierList() {
        return supplierList;
    }

}
