package AbstrakteKlassen;

/**
 * Created: 26.04.2022
 * @author Maximilian Ertl
 */

public class Buch extends Medium{

    private int seiten;

    public int getSeiten() {
        return seiten;
    }

    public Buch(String bezeichnung, double preis, int seiten) {
        super(bezeichnung, preis);
        this.seiten = seiten;
    }

    @Override
    public void info() {
        System.out.println("Ein Buch mit"+ seiten+ "Seiten");
    }

    public int compareTo(Medium other) {
        if (getPreis() > other.getPreis()) {

            return 1;
        } else if (getPreis() < other.getPreis()){

            return -1;
        }
        return 0;
    }
}
