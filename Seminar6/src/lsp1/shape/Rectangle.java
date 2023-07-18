package Seminar6.src.lsp1.shape;

public class Rectangle extends Quadrilateral {

    public Rectangle(int sideA, int sideB) {
        this.setSideA(sideA);
        this.setSideB(sideB);
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
        this.sideC = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
        this.sideD = sideB;
    }

    public double getArea() {
        return sideA * sideB;
    }
}
