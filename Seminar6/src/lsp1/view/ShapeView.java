package Seminar6.src.lsp1.view;

import Seminar6.src.lsp1.shape.Quadrilateral;

public class ShapeView {
    private final Quadrilateral rectangle;

    public ShapeView(Quadrilateral rectangle) {
        this.rectangle = rectangle;
    }

    public void showArea() {
        System.out.print("Area of rectangle equal:");
        System.out.println(rectangle.getArea());
    }
}
