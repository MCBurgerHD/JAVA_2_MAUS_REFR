package Vererbung;

/**
 * Created: 22.02.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */
public class Konto extends Person {
    private double kontostand;
    private Person inhaber;

    public double getKontostand() {
        return kontostand;
    }

    public Person getInhaber() {
        return inhaber;
    }

    public Konto() {
        super();
    }

    public Konto(String nachname, String vorname, double kontostand) {
        super(nachname, vorname);
        this.kontostand = kontostand;
    }

    private static void vergleich(Konto konto1, Konto konto2) {
        if (konto1.getKontostand() > konto2.getKontostand()) {
            System.out.println(konto1.getNachname() + " hat mehr Geld auf dem Konto als " + konto2.getNachname());
        }
        if (konto1.getKontostand() < konto2.getKontostand()) {
            System.out.println(konto1.getNachname() + " hat weniger Geld auf dem Konto als " + konto2.getNachname());
        }
        if (konto1.getKontostand() == konto2.getKontostand()) {
            System.out.println(konto1.getNachname() + " und " + konto2.getNachname() + " haben den gleichen Kontostand");
        }
    }

    public static void main(String[] args) {
        Konto konto1 = new Konto("Schmidt", "Hans", 500.0);
        Konto konto2 = new Konto("Krause", "Peter", 1500.0);
        Konto konto3 = new Konto("Bauer", "Harald", 500.0);
        Konto.vergleich(konto1, konto2);
        Konto.vergleich(konto2, konto3);
        Konto.vergleich(konto1, konto3);
    }


}
