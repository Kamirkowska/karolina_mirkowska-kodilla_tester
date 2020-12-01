package com.kodilla.inheritance.homework;

public class TurnOffOn {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1998);
        operatingSystem.turnOn();
        operatingSystem.turnOff();

        W98 w98 = new W98("Windows 98");
        w98.turnOn();
    }
}