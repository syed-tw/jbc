package com.tw.jbc.module1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FareCalculatorTest {

    /***
     * Requirement 1 - Test Case
     */
    @Test
    void checkFareWhenTotalFareIsLessThanMinimumFare() {
        FareCalculator fareCalculator = new FareCalculator();
        int fare = fareCalculator.getFare(3,2);
        assertEquals(40, fare);
    }

        /***
     * Requirement 2 - Test Case
     */
    @Test
    void checkFareWhenTotalFareIsGreaterThanMinimumFare() {
        FareCalculator fareCalculator = new FareCalculator();
        int fare = fareCalculator.getFare(4,4);
        assertEquals(48, fare);
    }

}
