package com.kodilla.good.patterns.Food2Door;

public class MailService implements InformationService{
    @Override
    public void sendMail(Supplier supplier) {
        System.out.println("Wiadomość poprawnie wysłana do: "+ supplier.getSupplierName() + " na adres e-mail: "
                + supplier.getMail());
    }
}
