package com.kodilla.good.patterns.challanges;

public class User {
    private String userName;
    private String firstName;
    private String secondName;
    private String email;

    public User(String userName, String firstName, String secondName, String email) {
        this.userName = userName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getEmail() {
        return email;
    }
}
