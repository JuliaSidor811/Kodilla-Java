package com.kodilla.testing.shape;

public class Triangle implements Shape {
    double side;
    double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return (side*height)/2;
    }
}
