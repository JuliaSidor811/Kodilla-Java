package com.kodilla.good.patterns.Food2Door;

public class TelService implements InformService{

    @Override
    public void inform(String way) {
        System.out.println("Potwierdzenie wyslane na numer telefonu: "+ way);
    }
}
