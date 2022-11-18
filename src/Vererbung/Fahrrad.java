package Vererbung;

/**
 * Created: 22.02.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */
public class Fahrrad {
    public static final double umrechnung_kmh = 3.6;
    private String name;
    private String farbe;
    private int richtung; // Lenkeinschlag in Grad : -45 bis +45
    private double geschwindigkeit; // m/sec

    public String getName() {
        return name;
    }

    public String getFarbe() {
        return farbe;
    }

    public int getRichtung() {
        return richtung;
    }

    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public Fahrrad() {
        this("", "", 0, 0);
    }

    public Fahrrad(String name, String farbe) {
        this(name, farbe, 0, 0);
    }

    public Fahrrad(String name, String farbe, int richtung, double geschwindigkeit) {
        this.name = name;
        this.farbe = farbe;
        this.richtung = richtung;
        this.geschwindigkeit = geschwindigkeit;
    }

    public void lenke(int delta) {
        richtung += delta;
    }

    public void beschleunige(double a, double sec) {
        geschwindigkeit = geschwindigkeit + a * sec;
    }

    public double getKmh() {
        return geschwindigkeit * umrechnung_kmh;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", " + "Farbe: " + farbe + ", " + " Richtung: " + richtung + " , " + "km/h: " + getKmh();
    }

    public static void main(String args[]) {
        Fahrrad fahrrad = new Fahrrad("Strampler", "blau");
        fahrrad.lenke(10);
        fahrrad.beschleunige(.3, 9.8); // v = v + 0.3 * 9.8
        System.out.println(fahrrad);
    }
}
