package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightFrom() {

        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result;

        result = flightFinder.findFlightsFrom("Warsaw");

        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Dublin"));
        expectedList.add(new Flight("Warsaw", "Paris"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightTo() {

        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result;

        result = flightFinder.findFlightsTo("Dublin");

        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Dublin"));
        assertEquals(expectedList, result);
    }
}