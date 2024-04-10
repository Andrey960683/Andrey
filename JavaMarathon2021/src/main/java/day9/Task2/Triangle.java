package day9.Task2;

public class Triangle extends Figure {
    private double length1;
    private double length2;
    private double length3;

    public Triangle(double length1, double length2, double length3, String color) {
        super(color);
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    @Override
    public double area() {
        double halfPerimeter = perimeter() / 2.0;
        return Math.sqrt(halfPerimeter * (halfPerimeter - length1) * (halfPerimeter - length2) * (halfPerimeter - length3));
    }

    @Override
    public double perimeter() {
        return length1 + length2 + length3;
    }
}
