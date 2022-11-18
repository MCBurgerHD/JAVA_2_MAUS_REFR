package GeometricObject;

/**
 * Created: 10.05.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */

public class Rectangle extends Figure{
    private double width;
    private double heigth;

    public Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public double getHeigth() {
        return heigth;
    }

    @Override
    public void scale(double s) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width kleiner oder gleich 0!");
        }
        if (heigth <= 0) {
            throw new IllegalArgumentException("Height kleiner oder gleich 0!");
        }
        this.heigth = heigth * s;
        this.width = width * s;
    }

    @Override
    public double calcArea() {
        if (width <= 0) {
            throw new IllegalArgumentException("Width kleiner oder gleich 0!");
        }
        if (heigth <= 0) {
            throw new IllegalArgumentException("Height kleiner oder gleich 0!");
        }
        return width * heigth;
    }

    @Override
    public double calcPerimeter() {
        if (width <= 0) {
            throw new IllegalArgumentException("Width kleiner oder gleich 0!");
        }
        if (heigth <= 0) {
            throw new IllegalArgumentException("Height kleiner oder gleich 0!");
        }
        return 2 * width + 2 * heigth;
    }
}
