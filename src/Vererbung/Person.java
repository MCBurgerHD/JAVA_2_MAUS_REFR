package Vererbung;

/**
 * Created: 22.02.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */
public class Person {
    private String vorname;
    private String nachname;

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public Person() {
        this("", "");
    }

    public Person(String nachname, String vorname) {
        this.nachname = nachname;
        this.vorname = vorname;
    }

    @Override
    public String toString() {
        return nachname + " " + vorname;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setNachname("Lothar");
        p1.setVorname("Friedl");
        System.out.println("Vorname : " + p1.getVorname());
        System.out.println("Name : " + p1.getNachname());
        Person p2 = new Person("Klammer", "Franz");
        System.out.println(p2); // Ausgabe : " Klammer Franz "
    }
}
