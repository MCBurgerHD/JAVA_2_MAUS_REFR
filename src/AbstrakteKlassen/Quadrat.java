package AbstrakteKlassen;

/**
 * Created: 26.04.2022
 *
 * @author Maximilian Ertl
 */

public class Quadrat extends Figur2D {
    private double seite;

    public double getSeite() {
        return seite;
    }

    @Override
    double umfang() {
        return seite * 4;
    }

    @Override
    double flaeche() {
        return Math.pow(seite, 2);
    }

    @Override
    void info() {
        System.out.println("Quadrat mit Seite " + seite);
    }
}
