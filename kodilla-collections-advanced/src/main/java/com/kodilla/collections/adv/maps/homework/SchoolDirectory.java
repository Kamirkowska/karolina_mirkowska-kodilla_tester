package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();

        Principal harry = new Principal("Harry", "Black");
        Principal steve = new Principal("Steve", "Evans");
        Principal jack = new Principal("Jack", "Whitehall");

        School school1 = new School("School 1", 20, 22, 25, 21);
        School school2 = new School("School 2", 25, 30, 27, 29);
        School school3 = new School("School 3", 17, 15, 16, 18);

        school.put(harry, school1);
        school.put(steve, school2);
        school.put(jack, school3);

        for (Map.Entry<Principal, School> principalEntry : school.entrySet())
            System.out.println("Mr. " + principalEntry.getKey().getFirstName() + " "
                    + principalEntry.getKey().lastName + " is principal of "
                    + principalEntry.getValue().getSchoolName() + " and "
                    + principalEntry.getValue().getSum() + " students");
    }
}
