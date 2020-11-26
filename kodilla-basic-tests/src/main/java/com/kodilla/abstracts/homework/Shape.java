package com.kodilla.abstracts.homework;

public abstract class Shape {
    double perimeter;
    double area;
    double a;
    double b;
    double c;
    double d;
    double h;

    public Shape(double a, double b, double c, double d, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }
    public abstract void getPerimeter();

    public abstract void getArea();
}