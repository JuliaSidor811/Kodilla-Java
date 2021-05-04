package com.kodilla.good.patterns.challanges;

public class SoldDto {
    User user;
    public boolean isSold;

    public SoldDto(final User user, final boolean isSold) {
        this.user = user;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public boolean isSold() {
        return isSold;
    }
}
