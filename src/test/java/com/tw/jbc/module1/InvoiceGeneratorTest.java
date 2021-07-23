package com.tw.jbc.module1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceGeneratorTest {
    @Test
    void checkFareWhenTotalFareIsLessThanMinimumFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        int fare = invoiceGenerator.getFare(3,2);
        assertEquals(40, fare);
    }


    @Test
    void checkFareWhenTotalFareIsGreaterThanMinimumFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        int fare = invoiceGenerator.getFare(4,4);
        assertEquals(48, fare);
    }

}
