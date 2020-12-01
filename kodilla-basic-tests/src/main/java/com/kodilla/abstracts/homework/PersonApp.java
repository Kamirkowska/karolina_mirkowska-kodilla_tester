package com.kodilla.abstracts.homework;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("Andrzej", 31, new CustomerService(3000, "responsibilities"));
        System.out.println("First name " + person.firstName + " age " + person.age + " salary " + person.job.salary + " responsibilities " + person.job.responsibilities);
    }
}