package com.tw.jbc.module1;

public class CabRide {
    private final int distanceTravelledInKm;
    private final int waitTimeInMinutes;

    public static final int COST_PER_KM = 10;
    public static final int COST_PER_MINUTES = 2;
    public static final int MINIMUM_FARE = 40;

    //constructor chaining
    public CabRide(int distanceTravelledInKm) {

        this(distanceTravelledInKm, 0);
    }

    public CabRide(int distanceTravelledInKm, int waitTimeInMinutes) {
        this.distanceTravelledInKm = distanceTravelledInKm;
        this.waitTimeInMinutes = waitTimeInMinutes;
    }

    public int fare() {

        //return 10 * distanceTravelledInKm+2*timeTravelledInMinutes;
        int calculateFare = COST_PER_KM * distanceTravelledInKm + COST_PER_MINUTES * waitTimeInMinutes;
        //eturn Math.max(calculateFare, MINIMUM_FARE);
        return calculateFare;
    }
}
