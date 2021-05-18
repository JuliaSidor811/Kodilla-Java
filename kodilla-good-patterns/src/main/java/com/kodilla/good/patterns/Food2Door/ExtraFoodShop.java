package com.kodilla.good.patterns.Food2Door;

public class ExtraFoodShop extends Supplier implements SupplierProcess{

    private String telNumer;
    private InformService informationService;

    public ExtraFoodShop(String name, String headquartersCity, String mail, String telNumer, InformService informationService) {
        super(name, headquartersCity, mail);
        this.telNumer = telNumer;
        this.informationService = informationService;
    }

    @Override
    public void process(Product product, int quantity) {
        System.out.println("Pomyslnie zamowiono: "+
                product.getName() + "w ilosci: "+ quantity);

        informationService.inform(telNumer);

    }
}
