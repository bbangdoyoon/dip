package org.example;

import java.util.Objects;

class Point1 {
    private int xPos;
    private int yPos;
    public Point1(int x, int y){
        xPos = x;
        yPos = y;
    }


    @Override
    public boolean equals(Object o) {
        Point point = (Point) o;
        if (xPos == point.xPos && yPos == point.yPos);

        return false;
    }
}
class Rectangle {
    private static Point upperLeft;
    private static Point lowerRight;
    public Rectangle(int x1, int y1, int x2, int y2){
        upperLeft = new Point(10, 20);
        lowerRight = new Point(30, 40);
    }

    public static void main(String[] args) {
        System.out.println(upperLeft == lowerRight );
        System.out.println(upperLeft);
        System.out.println(lowerRight);



    }
}
