package LinkedList;

import java.util.Objects;

/**
 * Eine einfach verkettete Liste.
 */
public class LinkedList {

    private ListNode first;
    private ListNode last;
    private int length;

    /**
     * Ermittelt die Anzahl an Elementen in der Liste.
     * q
     *
     * @return Anzahl Elemente
     */
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
        if (size() != 0) {
            last.setNext(new ListNode(data));
            last = last.getNext();
            length++;
        } else {
            first = last = new ListNode(data);
            length++;
        }
    }

    /**
     * Fügt einen neuen Datensatz an einer bestimmten Stelle hinzu.
     *
     * @param data einzufügende Daten
     * @param idx  Index, 0-basiert
     */
    public void add(Object data, int idx) {
        ListNode aktuell = first;
        if (idx + 1 == length) {
            last.setNext(new ListNode(data));
            last = last.getNext();
            return;
        }
        for (int i = 0; i <= length; i++) {
            if (i == idx) {
                ListNode back = aktuell;
                aktuell.setNext(back);
                aktuell.setData(data);
                length++;
            }
            if (aktuell.getNext() != null) {
                aktuell = aktuell.getNext();
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
        ListNode aktuell = first;
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
                back = aktuell.getData();
                aktuell.setData(data);
                return back;
            }
            if (aktuell.getNext() != null) {
                aktuell = aktuell.getNext();
            }
        }
        return aktuell;
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
        throw new UnsupportedOperationException("TODO");
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
