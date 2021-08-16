package com.tw.jbc.module2;

import org.junit.jupiter.api.Test;

import static com.tw.jbc.module2.Rectangle.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RectangleTest {

//    @Test
//    void testAreaOfRectangleWhenLengthIs4AndBreathIs8() {
//        Rectangle rectangle = new Rectangle(4);
//        assertEquals(32, rectangle.calculateArea());
//    }

    @Test
    void testAreaOfRectangleWhenLengthIs4AndBreathIs6() {
        Rectangle rectangle = rectangle(4, 6);
        assertEquals(24, rectangle.area());
    }

    @Test
    void testPerimeterOfRectangleWhenLengthIs4AndBreathIs6() {
        assertEquals(20, rectangle(4, 6).perimeter());
    }

    @Test
    void testPerimeterOfRectangleWhenLengthIs4AndBreathIs8() {
        assertEquals(24, rectangle(4, 8).perimeter());
    }

    @Test
    void testAreaOfASquareWhereTheSideIs5() {
        //Square square = new Square(5);
        assertEquals(25, square(5).area());
    }

    @Test
    void testPerimeterOfASquareWhereTheSideIs5() {
        assertEquals(20, square(5).perimeter());
    }


}
