package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theFormUser");
        String result = simpleUser.getUsername();
        if(result.equals("theFormUser")){
            System.out.println("test Ok");
        } else{
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy");

        Calculator calculator = new Calculator();
        int resultAdd = calculator.add(2,8);
        int resultSub = calculator.subtract(22,10);

        if(resultAdd == 10){
            System.out.println("test Ok");
        } else{
            System.out.println("Error!");
        }

        if(resultSub == 12){
            System.out.println("test Ok");
        } else{
            System.out.println("Error!");
        }


    }
}
