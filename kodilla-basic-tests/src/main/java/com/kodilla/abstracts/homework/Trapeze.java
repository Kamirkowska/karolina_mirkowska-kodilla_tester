package com.kodilla.abstracts.homework;

public class Trapeze extends Shape {

    public Trapeze() {
        super(4,8,5,5,6);
    }

    @Override
    public void getPerimeter() {
        this.perimeter = a + b + c + d;
        System.out.println("Perimeter of trapeze is " + perimeter);
    }

    @Override
    public void getArea() {
        this.area = (a + b)*h / 2;
        System.out.println("Area of trapeze is " + area);
    }
}