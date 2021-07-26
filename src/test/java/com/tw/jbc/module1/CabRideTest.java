package com.tw.jbc.module1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class CabRideTest {

    /**
        START - Test Cases - Requirement 1
     */

    @Test
    public void cabFareShouldBe100For10KmTravelled(){
        assertEquals(100, new CabRide(10).fare());
    }

    @Test
    public void cabFareShouldBe50For5KmTravelled(){
        assertEquals(50, new CabRide(5).fare());
    }

    @Test
    public void cabFareShouldBe108For10kmsAnd4MinutesTravelled(){
        assertEquals(108, new CabRide(10, 4).fare());
    }

    @Test
    public void cabFareShouldBe120For10kmsAnd10MinutesTravelled(){
        assertEquals(120, new CabRide(10, 10).fare());
    }

    /**
     END - Test Cases - Requirement 1
     */

    /**
     START - Test Cases - Requirement 2
     */

    @Test
    public void cabFareShouldBe40For3kmsAnd4MinutesTravelled(){
        assertEquals(40, new CabRide(3, 4).fare());
    }

    @Test
    public void cabFareShouldBe40For2kmsAnd2MinutesTravelled(){
        assertEquals(40, new CabRide(3, 4).fare());
    }

    @Test
    public void cabFareShouldBe46For4kmsAnd3MinutesTravelled(){
        assertEquals(46, new CabRide(4, 3).fare());
    }

    @Test
    public void cabFareShouldBe50For4kmsAnd5MinutesTravelled(){
        assertEquals(50, new CabRide(4, 5).fare());
    }

    /**
     START - Test Cases - Requirement 3
     */









//    /***
//     * Requirement 1 - Test Case
//     */
//    @Test
//    void checkFareWhenTotalFareIsLessThanMinimumFare() {
//        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
//        int fare = invoiceGenerator.getFare(3,2);
//        assertEquals(34, fare);
//    }
//
//    /***
//     * Requirement 2 - Test Case
//     */
//    @Test
//    void checkFareWhenTotalFareIsGreaterThanMinimumFare() {
//        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
//        int fare = invoiceGenerator.getFare(4,4);
//        assertEquals(48, fare);
//    }

}
