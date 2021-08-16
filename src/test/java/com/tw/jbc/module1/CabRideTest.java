package com.tw.jbc.module1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class CabRideTest {



    @Test
    public void cabFareShouldBe100For10KmTravelled() {
        assertEquals(100, new CabRide(10).fare());
    }

    @Test
    public void cabFareShouldBe50For5KmTravelled() {
        assertEquals(50, new CabRide(5).fare());
    }

    @Test
    public void cabFareShouldBe108For10kmsAnd4MinutesWaited() {
        assertEquals(108, new CabRide(10, 4).fare());
    }


    @Test
    public void cabFareShouldBe40For3kmsAnd4MinutesTravelled() {
        assertEquals(40, new CabRide(3, 4).fare());
    }



}
