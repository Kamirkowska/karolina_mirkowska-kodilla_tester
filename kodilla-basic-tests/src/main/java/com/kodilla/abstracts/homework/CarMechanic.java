package com.kodilla.abstracts.homework;

public class CarMechanic extends Job {

    public CarMechanic() {
        super(4000.00);
    }

    @Override
    public void setResponsibilities() {
        System.out.println("Taking vahicles to the workshop, checking vehicle engines, finding and removing faults");
    }
}