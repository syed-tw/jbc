package com.tw.jbc.module2;
//some comment
public class Rectangle {
    private final int length;
    private final int breath;

    private Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    public static Rectangle square(int side) {
        return new Rectangle(side, side);
    }

    static Rectangle rectangle(int length, int breath) {
        return new Rectangle(length, breath);
    }


    public int area() {

        return breath * length;
    }

    public int perimeter() {
        return 2*(length+breath);
    }
}
