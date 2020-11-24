package com.kodilla.inheritance.homework;

public class W98 {
    private String system;

    public W98(String system) {
        this.system = system;
    }

    public void turnOn() {
        System.out.println(system + " turn on");
    }
    public void turnOff() {
        System.out.println(system + " turn off");
    }
}
