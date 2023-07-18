package Seminar6.src.srp1;

import Seminar6.src.srp1.figure.Point;
import Seminar6.src.srp1.figure.Square;
import Seminar6.src.srp1.figure.SquareAreaCalculator;
import Seminar6.src.srp1.figure.SquarePainter;

public class Main {
    public static void main(String[] args) {

        SquarePainter squarePainter = new SquarePainter();
        SquareAreaCalculator squareCalc = new SquareAreaCalculator();
        Square square = new Square(new Point(1, 1), 5);
        System.out.printf("Square area: %d \n", squareCalc.getArea(square));
        squarePainter.draw(square);
    }
}
