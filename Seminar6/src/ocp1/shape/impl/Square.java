package Seminar6.src.ocp1.shape.impl;

import Seminar6.src.ocp1.shape.Shape;

public class Square implements Shape {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return Math.pow(this.side, 2);
    }
}