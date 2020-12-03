package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Opel opel = new Opel(100);
        doRace(opel);

        Ford ford = new Ford(100);
        doRace(ford);

        Chevrolet chevrolet = new Chevrolet(100);
        doRace(chevrolet);
    }

        private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();

        car.decreaseSpeed();
        car.decreaseSpeed();
    }
}
