package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args){
        SecondChallange secondChallange = new SecondChallange();
        String result = "";
        try {
            result = secondChallange.probablyIWillThrowException(2.34,20.3);
        } catch (Exception e){
            System.out.println("Something went wrong: " + e);
        }finally {
            System.out.println(result);
        }
    }

}
