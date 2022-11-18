package AbstrakteKlassen;

/**
 * Created: 26.04.2022
 * @author Maximilian Ertl
 */

public class Kreis  extends Figur2D{
    private double radius;

    public double getRadius() {
        return radius;
    }

    @Override
    double umfang() {
        return 2*radius*Math.PI;
    }

    @Override
    double flaeche() {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    void info() {
        System.out.println("Quadrat mit Radius " + radius);
    }
}
