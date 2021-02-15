package com.company;

public class Point {
    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y){
        setX(x);
        setY(y);
    }

    public double distance(Point otherPoint){
        return Math.sqrt(Math.pow((this.x - otherPoint.getX()), 2) + Math.pow((this.y - otherPoint.getY()), 2));
    }


    public String printCoordinates(){
        return "Coordinate x: " + getX() + "\n" + "Coordinate y: " + getY();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
