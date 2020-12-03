package com.kodilla.collections.interfaces.homework;

public class Chevrolet implements Car {
    private int speed;

    public Chevrolet(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed+= 70;
        System.out.println("Chevrolet increases to: " + speed);
    }

    @Override
    public void decreaseSpeed() {
        this.speed-= 30;
        System.out.println("Chevrolet decreases to: " + speed);
    }
}