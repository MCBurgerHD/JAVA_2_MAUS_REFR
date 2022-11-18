package AbstrakteKlassen;

public abstract class Medium {
    private String bezeichnung;
    private double preis;

    public double getPreis() {
        return preis;
    }

    public Medium(String bezeichnung, double preis) {
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }

    public abstract void info();

    public abstract int compareTo(Medium other);
}


