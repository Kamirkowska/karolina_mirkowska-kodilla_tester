package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    public Rectangle() {
        super(4, 8, 0,0,8);
    }

    @Override
    public void getPerimeter() {
        this.perimeter = 2*a + 2*b;
        System.out.println("Perimeter of rectangle is " + perimeter);

    }

    @Override
    public void getArea() {
        this.area = a * b;
        System.out.println("Area of rectangle is " + area);
    }
}