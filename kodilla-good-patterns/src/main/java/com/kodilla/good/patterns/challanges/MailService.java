package com.kodilla.good.patterns.challanges;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Wiadomosc zostala wyslana do: "+ user.getUserName() + " ( "+
                user.getFirstName()+" "+user.getSecondName()+" )");
    }
}
