package com.kodilla.collections.adv.exercises.homework;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightFinder {
    Map<String, List<Flight>> flights = new HashMap<>();

    public List<Flight> findFlightsFrom(String departure) {
        return flights.getOrDefault(departure, Collections.emptyList());
    }

    public List<Flight> findFlightsTo(String arrival) {
        return flights.getOrDefault(arrival, Collections.emptyList());
    }
}
