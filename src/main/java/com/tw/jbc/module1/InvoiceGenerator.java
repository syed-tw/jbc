package com.tw.jbc.module1;

public class InvoiceGenerator {
    public static final int COST_PER_KM = 10;
    public static final int MINIMUM_FARE = 40;

    public int getFare(int kms, int timeInMinutes) {
        int calculateFare = COST_PER_KM*kms + timeInMinutes*2;
        if (calculateFare < MINIMUM_FARE)
            return MINIMUM_FARE;
        return calculateFare;
    }
}
