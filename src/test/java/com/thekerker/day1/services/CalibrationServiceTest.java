package com.thekerker.day1.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalibrationServiceTest {

    private CalibrationService service;

    @BeforeEach
    public void setupTests() {
        service = new CalibrationService();
    }

    @Test
    public void shouldGetCalibratedSum() {
        List<String> input = new ArrayList<>();
        input.add("1abc2");
        input.add("pqr3stu8vwx");
        input.add("a1b2c3d4e5f");
        input.add("treb7uchet");

        int expected = 142;

        int actual = service.getCalibratedSum(input);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetCalibratedSum2() {
        List<String> input = new ArrayList<>();
        input.add("two1nine");
        input.add("eightwothree");
        input.add("abcone2threexyz");
        input.add("xtwone3four");
        input.add("4nineeightseven2");
        input.add("zoneight234");
        input.add("7pqrstsixteen");

        int expected = 281;

        int actual = service.getCalibratedSum2(input);

        assertEquals(expected, actual);
    }
}
