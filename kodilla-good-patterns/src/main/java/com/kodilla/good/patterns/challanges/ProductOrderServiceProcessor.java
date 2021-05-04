package com.kodilla.good.patterns.challanges;

public class ProductOrderServiceProcessor {
    private InformationService informationService;
    private SaleService saleService;
    private SaleRepository saleRepository;

    public ProductOrderServiceProcessor(final InformationService informationService, final SaleService saleService, final SaleRepository saleRepository) {
        this.informationService = informationService;
        this.saleService = saleService;
        this.saleRepository = saleRepository;
    }
    public SoldDto process(Order order){
        boolean isSold = saleService.sale(order.getUser(),order.getProduct(),order.getDateOfSale());
        if(isSold){
            informationService.inform(order.getUser());
            saleRepository.createSale(order.user,order.getProduct(),order.getDateOfSale());
            return new SoldDto(order.getUser(), true);

        }else{
            return new SoldDto(order.getUser(), false);
        }

    }

}
