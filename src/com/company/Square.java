package com.company;

public class Square extends Rectangle {
    private double side;
    public Square(){
        this.side = 1.0;
    }

    @Override
    public void setWidth(double width) {
        this.side = width;
    }

    @Override
    public void setLength(double length) {
        this.side = length;
    }
}
