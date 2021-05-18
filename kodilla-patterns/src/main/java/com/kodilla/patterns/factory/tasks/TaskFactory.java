package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVE = "DRIVE";
    public static final String PAINT = "PAINT";
    public static final String SHOP = "SHOP";

    public Task makeTask(String taskClass){
        switch (taskClass){
            case DRIVE:
                return new DrivingTask("Driving Task","Berlin","car");
            case PAINT:
                return new PaintingTask("Painting Task","black","table");
            case SHOP:
                return new ShoppingTask("Shopping Task","Water",100);
            default:
                return null;
        }

    }


}
