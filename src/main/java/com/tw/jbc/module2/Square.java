package com.tw.jbc.module2;

public class Square {

    private final int side;

    public Square(int side) {
        this.side = side;
    }

    public int areaOfSquare() {
        return side*side;
    }
}
