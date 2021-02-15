package com.company;

public class Rectangle extends Shape {
    private double width;
    private double length;
    public Rectangle(){

    }
    public Rectangle(double width, double length){
        setWidth(width);
        setLength(length);
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
