package Seminar6.src.lsp1;

import Seminar6.src.lsp1.shape.Rectangle;
import Seminar6.src.lsp1.shape.Square;
import Seminar6.src.lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Square rectangle1 = new Square(5);

        Rectangle rectangle = new Rectangle(4, 5);

        System.out.printf("In a rectangle side A = %d, side B = %d\n", rectangle.getSideA(), rectangle.getSideB());

        ShapeView view = new ShapeView(rectangle);
        view.showArea();

        System.out.printf("In a sqare side A = %d, side B = %d\n", rectangle1.getSideA(), rectangle1.getSideB());
        ShapeView view1 = new ShapeView(rectangle1);
        view1.showArea();
    }
}
