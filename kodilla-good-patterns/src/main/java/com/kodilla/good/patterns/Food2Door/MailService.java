package com.kodilla.good.patterns.Food2Door;


public class MailService implements InformService {
    @Override
    public void inform(String way) {
        System.out.println("Poprawnie wyslano maila z potwierdzeniem na: "+ way);
    }
}
