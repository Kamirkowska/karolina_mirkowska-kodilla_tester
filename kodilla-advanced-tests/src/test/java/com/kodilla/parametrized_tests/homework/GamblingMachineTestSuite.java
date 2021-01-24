package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class GamblingMachineTestSuite {

    @ParameterizedTest
    @CsvFileSource(resources = "/GoodNumbers.csv")
    public void shouldShowValidateNumbers() {
        return;
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/WrongNumbers.csv")
    public void shouldShowInvalidateNumbers() {
        return;
    }
}