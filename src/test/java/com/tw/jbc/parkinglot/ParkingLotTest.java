package com.tw.jbc.parkinglot;

import org.junit.jupiter.api.Test;

public class ParkingLotTest {

    @Test
    void testShouldBeAbleToParkTheCar() {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.park();
    }
}