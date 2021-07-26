package com.tw.jbc.module1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CabRidesTest {


    /**
     START - Test Cases - Requirement 3
     */

    @Test
    void aggregateCabFareShouldBe80ForFirstRideFor3KMsAnd3MinutesAndSecondRideFor2KmsAnd2Minutes() {
        List cabRides = new ArrayList();
        CabRide firstRide = new CabRide(3,3);
        CabRide secondRide = new CabRide(2,2);
        cabRides.add(firstRide);
        cabRides.add(secondRide);
        assertEquals(80, new CabRides().aggregateFare(cabRides));
    }

    @Test
    void aggregateCabFareShouldBe80ForFirstRideFor3KMsAnd3MinutesAndSecondRideFor1KmsAnd1Minutes() {
        List cabRides = new ArrayList();
        CabRide firstRide = new CabRide(3,3);
        CabRide secondRide = new CabRide(1,1);
        cabRides.add(firstRide);
        cabRides.add(secondRide);
        assertEquals(80, new CabRides().aggregateFare(cabRides));
    }

    @Test
    void aggregateCabFareShouldBeFor86FirstRideFor4KMsAnd3MinutesAndSecondRideFor1KmsAnd1Minutes() {
        List cabRides = new ArrayList();
        CabRide firstRide = new CabRide(4,3);
        CabRide secondRide = new CabRide(1,1);
        cabRides.add(firstRide);
        cabRides.add(secondRide);
        assertEquals(86, new CabRides().aggregateFare(cabRides));
    }

    @Test
    void aggregateCabFareShouldBe120For3Rides() {
        List cabRides = new ArrayList();
        CabRide firstRide = new CabRide(3,3);
        CabRide secondRide = new CabRide(1,1);
        CabRide thirdRide = new CabRide(2,2);
        cabRides.add(firstRide);
        cabRides.add(secondRide);
        cabRides.add(thirdRide);
        assertEquals(120, new CabRides().aggregateFare(cabRides));
    }


    /**
     END - Test Cases - Requirement 3
     */
}
