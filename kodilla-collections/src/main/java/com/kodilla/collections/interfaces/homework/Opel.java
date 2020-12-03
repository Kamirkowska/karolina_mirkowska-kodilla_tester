package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private int speed;

    public Opel(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed+= 50;
        System.out.println("Opel increases to: " + speed);
    }

    @Override
    public void decreaseSpeed() {
        this.speed-= 20;
        System.out.println("Opel decreases to: " + speed);
    }
}