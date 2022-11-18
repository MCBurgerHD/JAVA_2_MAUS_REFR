package EinfacheKlassen;

import java.time.LocalDate;

/**
 * Created: 14.12.2021
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */
public class Person {
    LocalDate today = LocalDate.now();
    int year = today.getYear();

    private final int geburtsjahr;
    private String vorname, name;

    public Person() {
        name = vorname = "N.N.";
        geburtsjahr = 0;
    }

    public Person(int jahr) {
        name = vorname = "N.N.";
        geburtsjahr = jahr;
    }

    public Person(String name, int jahr) {
        this(name, "N.N.", jahr);
    }

    public Person(String name, String vorname, int jahr) {
        this.vorname = vorname;
        this.name = name;
        geburtsjahr = jahr;
    }

    public boolean gleichAlt(Person p) {
        return geburtsjahr == p.geburtsjahr;
    }

    public static boolean gleichAlt(Person p, Person p0) {
        return p.gleichAlt(p0);
    }

    public int getAlter() {
        return year - geburtsjahr;
    }

    public void setZuname(String zuname) {
        name = zuname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    @Override
    public String toString() {
        return name + ' ' + vorname;
    }
}
