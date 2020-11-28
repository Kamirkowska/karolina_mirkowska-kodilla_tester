package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;
    String job;

    public Person(String firstName, int age, String job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;

        System.out.println("Person " + firstName + " is " + age + "." + " As the employee has to " + job);

    }
}
