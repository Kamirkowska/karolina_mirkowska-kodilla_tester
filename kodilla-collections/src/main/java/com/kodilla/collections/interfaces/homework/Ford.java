package com.kodilla.collections.interfaces.homework;

public class Ford implements Car, CarRadio {
    private int speed;

    public Ford(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed+= 30;
        System.out.println("Ford increases to: " + speed);
    }

    @Override
    public void decreaseSpeed() {
        this.speed-= 40;
        System.out.println("Ford decreases to: " + speed);
    }

    @Override
    public String radioName() {
        return null;
    }
}