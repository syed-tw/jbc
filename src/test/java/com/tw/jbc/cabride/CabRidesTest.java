package com.tw.jbc.cabride;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CabRidesTest {

//    @Test
//    void aggregateCabFareShouldBe80ForFirstRideFor3KMsAnd3MinutesAndSecondRideFor2KmsAnd2Minutes() {
//          ArrayList <CabRide> cabRides = new ArrayList<>();
//          CabRide firstRide = new CabRide(3, 3);
//          CabRide secondRide = new CabRide(2, 2);
//          cabRides.add(firstRide);
//          cabRides.add(secondRide);
//          assertEquals(80, new CabRides().aggregateFare(cabRides));
//
//    }
//
//    @Test
//    void aggregateCabFareShouldBeFor86FirstRideFor4KMsAnd3MinutesAndSecondRideFor1KmsAnd1Minutes() {
//        ArrayList <CabRide> cabRides = new ArrayList<>();
//        CabRide firstRide = new CabRide(4,3);
//        CabRide secondRide = new CabRide(1,1);
//        cabRides.add(firstRide);
//        cabRides.add(secondRide);
//        assertEquals(86, new CabRides().aggregateFare(cabRides));
//    }

//    @Test
//    void aggregateCabFareShouldBe120For3Rides() {
//        ArrayList <CabRide> cabRides = new ArrayList<>();
//        CabRide firstRide = new CabRide(3,3);
//        CabRide secondRide = new CabRide(1,1);
//        CabRide thirdRide = new CabRide(2,2);
//        cabRides.add(firstRide);
//        cabRides.add(secondRide);
//        cabRides.add(thirdRide);
//        assertEquals(120, new CabRides().aggregateFare(cabRides));
//    }

    @Test
    void aggregateCabFareShouldBe80ForFirstRideFor3KMsAnd3MinutesAndSecondRideFor2KmsAnd2MinutesWaitTime() {
        ArrayList <CabRide> cabRides = new ArrayList<>();
        CabRide firstRide = new CabRide(3, 3);
        CabRide secondRide = new CabRide(2, 2);
        cabRides.add(firstRide);
        cabRides.add(secondRide);
        assertEquals(80, new CabRides(cabRides).aggregateFare());
    }

    @Test
    void aggregateCabFareShouldBe86ForFirstRideFor3KMsAnd3MinutesAndSecondRideFor1KmsAnd1MinuteWaitTime() {
        ArrayList <CabRide> cabRides = new ArrayList<>();
        CabRide firstRide = new CabRide(4,3);
        CabRide secondRide = new CabRide(1,1);
        cabRides.add(firstRide);
        cabRides.add(secondRide);
        assertEquals(86, new CabRides(cabRides).aggregateFare());
    }

    @Test
    void aggregateCabFareShouldBe120For3Rides() {
        ArrayList <CabRide> cabRides = new ArrayList<>();
        CabRide firstRide = new CabRide(3,3);
        CabRide secondRide = new CabRide(1,1);
        CabRide thirdRide = new CabRide(2,2);
        cabRides.add(firstRide);
        cabRides.add(secondRide);
        cabRides.add(thirdRide);
        assertEquals(120, new CabRides(cabRides).aggregateFare());
    }

    /***
     * START - Requirement 4 Test Cases -
     *///
    //Note  - Rework this with Arrays.asList()
    @Test
    void invoiceForSingleCabRideOf10km() {
        List <CabRide> cabRides = Arrays.asList();
        CabRide cabRide = new CabRide(10);
        cabRides.add(cabRide);
        assertEquals(new CabRideInvoice(100), new CabRides(cabRides).getInvoice());
    }

//    //REDUNDANT as it is tested above
//    @Test
//    void invoiceForSingleCabRideOf5km() {
//        ArrayList <CabRide> cabRides = new ArrayList<>();
//        CabRide cabRide = new CabRide(5);
//        cabRides.add(cabRide);
//        assertEquals(new Integer(50), new CabRides(cabRides).getInvoice());
 //   }
    /***
     * END - Requirement 4 Test Cases
     */


}
