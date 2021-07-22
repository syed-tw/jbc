package com.tw.jbc.module2;

public class Rectangle {
    public int calculateArea(int length, int breath) {
        int area = length*breath;
        return area;
    }

    public int calculatePerimeter(int length, int breath) {
        int perimeter = 2*(length+breath);
        return perimeter;
    }
}
