package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> figures = new ArrayList<>();
    public void addFigure(Shape shape){
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if(figures.contains(shape)){
            figures.remove(shape);
            result = true;
        }
        return result;


    }
    public Shape getFigure(int n){
        if(n >= 0 && n < figures.size()){
            return figures.get(n);
        }
        return null;
    }
    public void showFigures(){
        for(Shape shape : figures){
            System.out.println(shape.getShapeName());
        }
    }
}
