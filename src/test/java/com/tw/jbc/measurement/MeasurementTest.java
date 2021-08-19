package com.tw.jbc.measurement;

import org.junit.jupiter.api.Test;

import static com.tw.jbc.rectangle.Rectangle.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MeasurementTest {

    @Test
    void test1MeterIsEqualTo1Meter() {
        Measurement measurement = new Measurement();
        assertEquals(1, measurement.meter());
    }

    @Test
    void test10MeterIsEqualTo10Meter() {
        Measurement measurement = new Measurement();
        assertEquals(10, measurement.meter());
    }

}
