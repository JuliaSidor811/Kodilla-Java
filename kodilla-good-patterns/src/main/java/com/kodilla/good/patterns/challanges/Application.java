package com.kodilla.good.patterns.challanges;

public class Application {
    public static void main(String[] args){
        OrderRetriver orderRetriver = new OrderRetriver();
        Order order = orderRetriver.retrive();

        ProductOrderServiceProcessor productOrderServiceProcessor = new ProductOrderServiceProcessor(
                new MailService(),new ProductOrderService(),new DataSaleRepository()
        );
        productOrderServiceProcessor.process(order);

    }

}
