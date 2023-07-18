package Seminar6.src.lsp1.shape;

public class Square extends Quadrilateral {

    public Square(int side) {
        setSideA(side);
    }

    public void setSideA(int side) {
        this.sideA = side;
        this.sideB = side;
        this.sideC = side;
        this.sideD = side;
    }

    @Override
    public double getArea() {
        return (double) Math.pow(sideA, 2);
    }
}
