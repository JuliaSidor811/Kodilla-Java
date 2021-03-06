package com.kodilla.testing.shape;

public class Circle implements Shape{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return Math.pow(radius,2) * 3.14;
    }
}
