package entities;

public class Rectangle {
    public double width;
    public double height;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double diagonal() {
        double squaredWidth = Math.pow(width, 2);
        double squaredHeight = Math.pow(height, 2);
        return Math.sqrt(squaredWidth + squaredHeight);
    }
}
