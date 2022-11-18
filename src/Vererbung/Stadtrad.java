package Vererbung;

/**
 * Created: 22.02.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */
public class Stadtrad extends Fahrrad {
    private boolean lichtAn;

    public boolean getLichtAn() {
        return lichtAn;
    }

    public void lichtAn() {
        lichtAn = true;
    }

    public void lichtAus() {
        lichtAn = false;
    }

    public boolean isLichtAn() {
        if (lichtAn) {
            return true;
        } else {
            return false;
        }
    }

    public Stadtrad(String name, String farbe) {
        super(name, farbe);
    }

    public void lenke(int delta) {
        super.lenke(delta);
    }

    public void beschleunige(int a, double sec) {
        super.beschleunige(a, sec);
    }

    @Override
    public String toString() {
        if (lichtAn) {
            return "Name : " + getName() + ", " + "Farbe : " + getFarbe() + ", " + "Richtung : " + getRichtung() + ", " + "km/h : " + getKmh() + ", " + "Licht an";
        } else {
            return "Name : " + getName() + ", " + "Farbe : " + getFarbe() + ", " + "Richtung : " + getRichtung() + ", " + "km/h : " + getKmh() + ", " + "Licht aus";
        }
    }

    public Stadtrad() {
        super();
    }

    public Stadtrad(String name, String farbe, boolean lichtAn) {
        super(name, farbe);
        this.lichtAn = lichtAn;
    }

    public static void main(String[] args) {
        Stadtrad stadtrad = new Stadtrad("Flitzer", "schwarz", false);
        stadtrad.lenke(10);
        stadtrad.beschleunige(0.3, 9.8);
        stadtrad.lichtAn();
        System.out.println(stadtrad);
    }
}
