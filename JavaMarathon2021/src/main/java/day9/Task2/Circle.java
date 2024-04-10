package day9.Task2;

public class Circle extends Figure {
    private double radiusCircle;

    public Circle( double radiusCircle, String color) {
        super(color);
        this.radiusCircle = radiusCircle;
    }

    @Override
    public double area() {

        return (Math.pow(radiusCircle,2)) * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radiusCircle;
    }
}
