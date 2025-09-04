package ex1;

public class Rec {
    private double length;
    private double width;
    private double sides = 4;

    Rec() {
        setLength(0);
        setWidth(0);
    }
    Rec(double length,double width) {
        setLength(length);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double calculatePerimeter() {
        return (2*length) + (2*width);
    }
    public double calculateArea() {
        return length*width;
    }
}
