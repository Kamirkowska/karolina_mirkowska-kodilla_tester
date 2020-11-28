package com.kodilla.abstracts.homework;

public abstract class Job {
    double salary;

    public Job(double salary) {
        this.salary = salary;
    }

    public abstract void setResponsibilities();
}
