package com.tw.jbc.module2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RectangleTest {
    @Test
    void testCalculateArea() {
        Rectangle rectangle = new Rectangle();
        int area = rectangle.calculateArea(3,4);
        assertEquals(12, area);

    }

    @Test
    void testCalculatePerimeter() {
    }
}
