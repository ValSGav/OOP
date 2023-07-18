package Seminar6.src.lsp1.view;

import Seminar6.src.lsp1.shape.Rectangle;

public class ShapeView {
    private final Rectangle rectangle;

    public ShapeView(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public void showArea() {
        System.out.print("Area of rectangle equal:");
        System.out.println(rectangle.getArea());
    }
}
