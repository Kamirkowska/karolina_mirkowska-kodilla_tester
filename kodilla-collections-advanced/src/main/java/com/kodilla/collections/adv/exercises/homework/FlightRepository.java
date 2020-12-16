package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static void getFlightsTable() {
        List<Flight> flight = new ArrayList<>();

        flight.add(new Flight("Warsaw", "Dublin"));
        flight.add(new Flight("New York", "Warsaw"));
        flight.add(new Flight("Barcelona", "Warsaw"));
        flight.add(new Flight("Warsaw", "Paris"));
    }
}