package com.kodilla.abstracts.homework;

public class ShapeApplication {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5,8);
        System.out.println("Rectangle perimeter " + rectangle.getPerimeter());
        System.out.println("Rectangle area " + rectangle.getArea());

        Shape trapeze = new Trapeze(5,8,3,3,2);
        System.out.println("Trapeze perimeter " + trapeze.getPerimeter());
        System.out.println("Trapeze area " + trapeze.getArea());

        Shape triangle = new Triangle(5, 3, 8, 4);
        System.out.println("Triangle perimeter " + triangle.getPerimeter());
        System.out.println("Triangle area " + triangle.getArea());
    }
}
