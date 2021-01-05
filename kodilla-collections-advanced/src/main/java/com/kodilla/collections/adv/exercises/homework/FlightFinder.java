package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightFinder {
    Map<String, List<Flight>> flights = new HashMap<>();

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> temp = new ArrayList<>();

        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getDeparture().equals(departure)) {
                temp.add(flight);
            }
        }
        return temp;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> temp = new ArrayList<>();

        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getArrival().equals(arrival)) {
                temp.add(flight);
            }
        }
        return temp;
    }
}
