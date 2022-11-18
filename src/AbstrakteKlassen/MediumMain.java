package AbstrakteKlassen;

/**
 * Created: 26.04.2022
 *
 * @author Maximilian Ertl
 */

public class MediumMain {
    public static void main(String[] args) {
        Medium[] m = new Medium[4];
        m[0] = new Buch("Java ist auch eine Insel", 39.99, 1580);
        m[1] = new AudioCD("Einhandsegler", 19.90, 72.5);
        m[3] = new Buch("Der Grosse Krieg", 41.12, 928);
        m[4] = new AudioCD("Wir Sind Kameraden", 10.48, 47.3);

        System.out.println("Ab hier wird sotiert!");
        Medium temp;
        for (int i = 1; i < m.length; i++) {  // sortieren
            for (int j = i; j > 0; j--) {
                if (m[j - 1].compareTo(m[j]) == 1) {
                    temp = m[j];
                    m[j] = m[j - 1];
                    m[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < m.length; i++) { // ausgeben
            m[i].info();
        }
    }
}
