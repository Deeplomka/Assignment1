package com.company;

public class Circle extends Shape {
    private double radius;

    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        setRadius(radius);
    }

    /**
     * asdfadsfasdf
     * @return double value
     */
    public double getRadius() {
        return radius;
    }

    /**
     *
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     *
     * @return
     */

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }


    /**
     * gets area of circle
     * @return double value
     */
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString(){
        return "Color: " +  getColor() + ", Filled: " + isFilled() + ", Radius: " + getRadius();
    }
}
