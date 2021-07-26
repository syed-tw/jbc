package com.tw.jbc.module1;

public class CabRide {
    private int distanceTravelledInKm;
    private int timeTravelledInMinutes;

    public static final int COST_PER_KM = 10;
    public static final int COST_PER_MINUTES = 2;
    public static final int MINIMUM_FARE = 40;

    public CabRide(int distanceTravelledInKm) {
        this.distanceTravelledInKm = distanceTravelledInKm;
    }

    public CabRide(int distanceTravelledInKm,int timeTravelledInMinutes) {
        this.distanceTravelledInKm = distanceTravelledInKm;
        this.timeTravelledInMinutes = timeTravelledInMinutes;
    }
    public int fare() {
        //return 10 * distanceTravelledInKm+2*timeTravelledInMinutes;
        int calculateFare = COST_PER_KM*distanceTravelledInKm + COST_PER_MINUTES*timeTravelledInMinutes;
        if (calculateFare < MINIMUM_FARE)
            return MINIMUM_FARE;
        return calculateFare;
    }
}
