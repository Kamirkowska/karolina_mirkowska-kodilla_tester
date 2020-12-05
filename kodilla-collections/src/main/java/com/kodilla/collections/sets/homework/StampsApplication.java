package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Queen Elizabeth 1977", "43 mm x 31,25 mm", true));
        stamps.add(new Stamp("Eiffel Tower 1951", "90 mm x 70 mm", false));
        stamps.add(new Stamp("Queen Elizabeth 1977", "43 mm x 31,25 mm", true));
        stamps.add(new Stamp("Doctor Who 10", "90 mm x 70 mm", false));
        stamps.add(new Stamp("DC Comics Super Heroes 2006", "39,5 mm x 31,25mm", false));
        stamps.add(new Stamp("John Lennon 2009", "43 mm x 31,25 mm", true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}