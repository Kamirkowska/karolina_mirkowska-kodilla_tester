package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"Adam19,true", "11,false", "Z--,true", "HaL0_21,true", "Pi,false", "31!?,false"})
    public void shouldReturnCorrectUsername(String input, boolean expected) {
        assertEquals(expected, userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"adam.young@gmail.com,true", "matcha15@onet.pl,true", "kimchi@kimchi123,false"})
    public void shouldReturnCorrectEmail(String input, boolean expected) {
        assertEquals(expected, userValidator.validateEmail(input));
    }
}