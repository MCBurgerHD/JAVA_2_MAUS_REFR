package LinkedList;

import java.util.Objects;

/**
 * Created: 29.04.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */

public class DualLinkedList extends LinkedList {
    private ListNode first;
    private ListNode last;
    private int length; 		// darf auch verwendet werden
    private ListNode previous;

    public ListNode getPrevious() {
        return previous;
    }

    public int size() {
        return length;
    }

    /**
     * Liefert den ersten gespeicherten Datensatz.
     *
     * @return erster Datensatz
     */
    public Object getFirst() {
        return first.getData();
    }

    /**
     * Liefert den letzten gespeicherten Datensatz.
     *
     * @return letzter Datensatz
     */
    public Object getLast() {
        return last.getData();
    }

    /**
     * Fügt einen neuen Datensatz ans Ende der Liste hinzu.
     *
     * @param data anzuhängende Daten
     */
    public void add(Object data) {
        if (size()!= 0){
            previous = last;
            last.setNext(new ListNode(data));
            last = last.getNext();
            length++;} else {first = last = new ListNode(data); length++;}
    }

    /**
     * Fügt einen neuen Datensatz an einer bestimmten Stelle hinzu.
     *
     * @param data einzufügende Daten
     * @param idx  Index, 0-basiert
     */
    public void add(Object data, int idx) {
        previous = last;
        ListNode current = first;
        if (idx + 1 == length){
            last.setNext(new ListNode(data));
            last = last.getNext();
            return;
        }
        for (int i = 0; i <= length; i++) {
            if (i == idx){
                ListNode back = current;
                current.setNext(back);
                current.setData(data);
                length++;
            }
            if (current.getNext() != null){
                current = current.getNext();
            }
        }
    }

    /**
     * Liefert einen gespeicherten Datensatz (ohne ihn zu löschen).
     *
     * @param idx von diesem Index wird der Datensatz geliefert
     * @return gespeicherter Datensatz am Index {@code idx}
     */
    public Object get(int idx) {
        return idx;
    }

    /**
     * Setzt neue Daten auf der angegebenen Indexnummer.
     *
     * @param index Indexnummer
     * @return ursprünglicher - alter Datenwert
     * @throws IndexOutOfBoundsException bei ungültiger Indexnummer
     */
    public Object set(Object data, int index) {
        previous = last;
        ListNode current = first;
        Object back;
        if (index < 0 && index + 1 > length) {
            throw new IndexOutOfBoundsException(index);
        }
        if (index == 0) {
            back = first.getData();
            first.setData(data);
            return back;
        }
        if (index + 1 == length) {
            back = last;
            last.setData(data);
            return back;
        }
        for (int i = 0; i <= length; i++) {
            if (i == index) {
                back = current.getData();
                current.setData(data);
                return back;
            }
            if (current.getNext() != null) {
                current = current.getNext();
            }
        }
        return current;
    }

    /**
     * Entfernt einen Datensatz.
     *
     * @param idx an diesem Index wird der Datensatz entfernt
     * @return gespeicherter Datensatz
     */
    public Object remove(int idx) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Entfernt alle Kopien eines Datensatzes aus der Liste.
     * Jedes Element wird maximal einmal besucht ==> Laufzeit O(n).
     *
     * @param data zu entfernender Datensatz
     */
    public void removeAll(Object data) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Löscht die gesamte Liste.
     */
    public void remove() {
        this.first = null;
    }

    @Override
    public String toString() {
        StringBuilder ergebnis = new StringBuilder();
        ListNode aktuell = last;

        while (aktuell != null) {
            ergebnis.append(aktuell.getData()).append("\n");
            aktuell = aktuell.getNext();
        }

        return ergebnis.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        LinkedList other = (LinkedList) o;
        if (this == null && other == null) {
            return true;
        }
        if (this == null || other == null) {
            return false;
        }
        if (this.size() != other.size()) {
            return false;
        }
        for (int i = 0; i < this.size(); i++) {
            boolean equal = Objects.equals(this.get(i), other.get(i));
            if (!equal) {
                return false;
            }
        }
        return true;
    }
}
