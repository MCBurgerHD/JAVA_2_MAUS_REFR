package Schüttbuker;

/**
 * Created: 11.01.2022
 *
 * Ladekran
 * Besteht aus einzelnen Silos in welche Inhalte gefüllt werden können.
 * Abgebildet durch ein int-Feld (Anzahl von Silos mit entsprechenden Inhaltsmengen)
 * Jedes Silo besitzt die gleiche maximale Kapazität (Obergrenze)
 * Der Lade-EntladeKran kann seine Position nach links und rechts verändern,
 * um jeweils andere Silos zu bedienen. Kann dabei aber nicht über den Rand hinausfahren.
 * Startpunkt ist immer der erste Silo - ganz links.
 *
 * @author Franz Mauß (maus)
 */
public class Kran {
    private int[] silos;
    private int maximum;
    private int position;

    /**
     * Erzeugt einen Kran mit definierter Anzahl von Silos und definierter Füllmenge.
     * Siloanzahl = 10, Maximalmenge = 10
     * Startposition ist immer 0 (links außen)
     */
    public Kran() {

    }

    /**
     * Erzeugt einen Kran mit entsprechender Anzahl von Silos.
     * maximale Füllmenge wird auf 10 gesetzt.
     * @param silos Anzahl der Silos (>0)
     */
    public Kran(int silos) {
       //this.silos = new int[silos];
        this(silos, 0);
    }

    /**
     * Erzeugt einen Kran mit entsprechender Anzahl von Silos und maximaler Füllmenge.
     * @param silos Anzahl der Silos (>0)
     * @param maximum maximaler Füllwert eines Silos
     */
    public Kran(int silos, int maximum) {
        this.silos = new int[silos];
        this.maximum = maximum;

    }

    /**
     * Liefert die aktuelle Position des Krans (Nullbasiert)
     * @return Positionsangabe (0 <= x < Siloanzahl)
     */
    public int getPosition() {
        return position;
    }

    /**
     * Füllt den entsprechenden Silo auf der aktuellen Parkposition auf.
     * Füllt die Menge x zum aktuellen Stand hinzu.
     * Maximale Füllmenge kann nicht überschritten werden!
     * @param x hinzugefügte Menge
     */
    public void fuell(int x) {
        if (maximum < 10 && maximum + x <= 10) {
            maximum += x;
        }
        else
            maximum += x-maximum;
    }

    /**
     * Liefert die Menge des Silos auf der aktuellen Parkposition.
     * Silostand ist danach auf 0.
     * @return Menge im Silo
     */
    public int gibAlles() {
        silos[position] = 0;
        return position;
    }

    /**
     * Ändert die aktuelle Kranposition um i Einheiten nach rechts.
     * Negatives i bedeutet eine Bewegung nach links.
     * Dabei kann keine Grenze (Rand) überschritten werden.
     * @param i Anzahl der Verschiebungseinheiten
     */
    public void nachRechts(int i) {
        if (silos[position] + i < 10) {
            silos[position] += i;
        }
        if (i < 0) {
            silos[position] -= i;
        }
    }

    /**
     * Ändert die aktuelle Kranposition um i Einheiten nach links.
     * Negatives i bedeutet eine Bewegung nach rechts.
     * Dabei kann keine Grenze (Rand) überschritten werden.
     * @param i Anzahl der Verschiebungseinheiten
     */
    public void nachLinks(int i) {
        if (silos[position] - i > 0){
            silos[position] -= i;
        }
        if (i < 0) {
            silos[position] += i;
        }
    }

    /**
     * Textdarstellung des aktuellen Zustandes.
     * Wieviel ist in jedem Silo enthalten.
     * Zusatz: auf welcher Position befindet sich aktuell der Kran
     * @return Textdarstellung meines Kran-Systems
     */
    public String testToString() {
        StringBuilder sb = new StringBuilder("");
        sb.append(maximum);
        sb.append(silos[position]);
        return sb.toString();
    }
}
