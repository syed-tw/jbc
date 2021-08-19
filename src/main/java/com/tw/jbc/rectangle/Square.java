package com.tw.jbc.rectangle;

public class Square {

    private final int side;

    public Square(int side) {
        this.side = side;
    }

    public int areaOfSquare() {
        return side*side;
    }
}
