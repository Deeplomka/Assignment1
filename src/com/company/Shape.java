package com.company;

import java.util.ArrayList;

public class Shape {

//    private ArrayList<Point> points = new ArrayList<Point>();

    private String color;

    private boolean filled;

    /**
     * No-argument constructor
     */
    public Shape(){
        this.color = "red"; // setColor("red");
        this.filled = true; // setFilled(true);
    }


    /**
     * Parameterized constructor
     */
    public Shape(String color, boolean filled){
        setColor(color);
        setFilled(filled);
    }


    /**
     * Method, which returns the color of the shape
     * @return String value
     */
    public String getColor() {
        return color;
    }


    /**
     * Method, which changes the color of the shape
     *
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Method, which returns whether shape is filled
     * @return boolean value
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Method, which changes the state whether shape is filled or not
     *
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }


    /**
     * Overridden method toString from cosmic superclass Object
     * @return String value
     */
    @Override
    public String toString(){
        return "Color = " + this.color + ", Filled = " + this.filled;
    }

    /**
     * Method, which adds point to the Points array
     *
     */
//    public void addPoint(Point point){
//        points.add(point);
//    }


    /**
     * Method, which returns all points of a shape
     * @return ArrayList<Point> value
     */
//    public ArrayList<Point> getPoints() {
//        return points;
//    }

    /**
     *  Method, which calculates perimeter of a shape
     * @return the double value represented in floating format
     */
//    public double calculatePerimeter(){
//        double perimeter = 0;
//        for(int i=0; i<points.size(); i++){
//            perimeter += points.get(i).distance(points.get((i+1) % points.size()));
//        }
//        return perimeter;
//    }

    /**
     * Method, which calculates the longest side of a shape
     * @return the double value represented in floating format
     */

//    public double getLongestSide(){
//        double longestSide = 0;
//        for(int i=0; i<points.size(); i++){
//            double currentSide = points.get(i).distance(points.get((i+1) % points.size()));
//            if(currentSide > longestSide) longestSide = currentSide;
//        }
//        return longestSide;
//    }

    /**
     * Method which returns the average length of all sides  of a shape
     * @return the double value represented in floating format
     */

//    public double getAverageLengthOfSides(){ //
//        return this.calculatePerimeter() / points.size();
//    }

}
