package Seminar6.src.lsp1;

import Seminar6.src.lsp1.shape.Rectangle;
import Seminar6.src.lsp1.shape.Square;
import Seminar6.src.lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Square(5);
        rectangle.setSideA(4);
        rectangle.setSideB(5);
        System.out.printf("In a rectangle side A = %d, side B = %d\n", rectangle.getSideA(), rectangle.getSideB());
        ShapeView view = new ShapeView(rectangle);
        view.showArea();
    }
}
