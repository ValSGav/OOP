package Lesson1;

/**
 * Это точка2D
 */
public class Point2D {
    int x, y;

    
    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point2D(int value) {
        this(value, value);
    }

    public Point2D() {
        this(0);
    }

    

    
    @Override
    public String toString() {
        return String.format("x: %s, y:%s", x, y);
    }

}