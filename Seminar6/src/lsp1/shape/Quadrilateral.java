package Seminar6.src.lsp1.shape;

public abstract class Quadrilateral {
    int sideA;
    int sideB;
    int sideC;
    int sideD;

    public abstract double getArea();

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public int getSideD() {
        return sideD;
    }
}
