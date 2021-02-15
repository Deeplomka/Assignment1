package com.company;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(); // radius = 1, color = red, filled = true
        Circle circle2 = new Circle(3); // color = red, filled = true;
        Circle circle3 = new Circle(4, "black", true);
        System.out.print("Perimeter = ");
        System.out.println(circle1.getArea());
        circle1.getRadius();

    }
}
