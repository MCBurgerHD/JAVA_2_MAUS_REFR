package GeometricObject;

/**
 * Created: 10.05.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */


public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void scale(double s) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius kleiner oder gleich 0!");
        }
        this.radius = radius * s;
    }

    @Override
    public double calcArea() {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius kleiner oder gleich 0!");
        }
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calcPerimeter() {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius kleiner oder gleich 0!");
        }
        return 2 * radius * Math.PI;
    }
}
