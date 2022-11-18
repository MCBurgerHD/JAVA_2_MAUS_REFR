package EinfacheKlassen;

/**
 * Created: 14.12.2021
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */
public class Main {
    public static void main(String args[]) {
        Person p = new Person();
        Person p1 = new Person(2000);
        Person p2 = new Person("Maier", 1998);
        Person p3 = new Person("Schmidt", "Franz", 1998);
        p1.setZuname("Bauer");
        p1.setVorname("Hans");
        p2.setVorname("Eva");
        System.out.println(p1 + " ist " + p1.getAlter() + " Jahre alt.");

        if (p2.gleichAlt(p3)) {
            System.out.println(p2 + " und " + p3 + " sind gleich alt.");
        }
        if (Person.gleichAlt(p2, p3)) {
            System.out.println(p2 + " und " + p3 + " sind gleich alt.");
        }
    }
}

