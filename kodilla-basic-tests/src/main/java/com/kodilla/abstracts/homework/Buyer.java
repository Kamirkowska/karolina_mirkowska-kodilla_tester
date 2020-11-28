package com.kodilla.abstracts.homework;

public class Buyer extends Job {

    public Buyer() {
        super(5000.00);
    }

    @Override
    public void setResponsibilities() {
        System.out.println("Setting new contracts, filling the monthly target, preparing contracts in system");

    }
}
