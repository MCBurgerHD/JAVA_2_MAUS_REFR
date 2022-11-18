package AbstrakteKlassen;

/**
 * Created: 26.04.2022
 *
 * @author Maximilian Ertl
 */


public class AudioCD extends Medium {

    private double minuten;

    public double getMinuten() {
        return minuten;
    }

    public AudioCD(String bezeichnung, double preis, double minuten) {
        super(bezeichnung, preis);
        this.minuten = minuten;
    }

    @Override
    public void info() {
        System.out.println("Eine CD mit" + minuten + "Minuten");
    }

    public int compareTo(Medium other) {
        if (getPreis() > other.getPreis()) {

            return 1;
        } else if (getPreis() < other.getPreis()) {

            return -1;
        }
        return 0;
    }
}
