package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    public Triangle() {
        super(4,8,5,0,6);
    }

    @Override
    public void getPerimeter() {
        this.perimeter = a + b + c;
        System.out.println("Perimeter of triangle is " + perimeter);
    }

    @Override
    public void getArea() {
        this.area = a * h / 2;
        System.out.println("Area of triangle is " + area);
    }
}
