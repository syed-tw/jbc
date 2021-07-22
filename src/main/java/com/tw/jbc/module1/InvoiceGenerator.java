package com.tw.jbc.module1;

public class InvoiceGenerator {
    public static final int COST_PER_KM = 10;

    public int getFare(int kms, int timeInMinutes) {
        int calculateFare = COST_PER_KM*kms + timeInMinutes*2;
        return calculateFare;
    }
}
