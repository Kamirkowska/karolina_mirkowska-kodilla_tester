package com.kodilla.abstracts.homework;

public class CustomerService extends Job {

    public CustomerService() {
        super(3000.00);
    }

    @Override
    public void setResponsibilities() {
        System.out.println("Answering customers' calls, matter-of-fact service, calling back customers");
    }
}
