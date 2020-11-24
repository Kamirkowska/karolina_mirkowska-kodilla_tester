package com.kodilla.inheritance.homework;

public class TurnOffOn {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem();
        operatingSystem.setYear(1998);

        W98 w98 = new W98("Windows 98");
        w98.turnOn();
    }
}
