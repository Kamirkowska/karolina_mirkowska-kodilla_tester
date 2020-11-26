package com.kodilla.abstracts.homework;

public class ShapeApplication {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.getPerimeter();
        rectangle.getArea();

        Shape trapeze = new Trapeze();
        trapeze.getPerimeter();
        trapeze.getArea();

        Shape triangle = new Triangle();
        triangle.getPerimeter();
        triangle.getArea();
    }
}
