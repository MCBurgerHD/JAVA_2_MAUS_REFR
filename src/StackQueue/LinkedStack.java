package StackQueue;

/**
 * Created: 22.03.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */
public class LinkedStack  {
    private Node tos;
    private int size;

    public LinkedStack(Object elem) {

        tos = new Node(elem);
        size = 1;
    }

    public Object getTos() {
        return  tos.getElem();
    }

    public int getSize() {
        return size;
    }

    public LinkedStack() {}

    public void push(Object o) {
        Node newElem = new Node(o);
        newElem.setNext(tos);
        tos = newElem;
        size++;
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        Object removed;
        removed = tos.getElem();
        tos = tos.getNext();
        size--;
        return removed;
    }

    public boolean isEmpty() {
        return tos == null;
    }

    public int size() {
        return size;
    }

    public Object element() {
        if (isEmpty()) {
            return null;
        }
        return this.tos.getElem();
    }

    @Override
    public String toString() {
        StringBuilder ergebnis = new StringBuilder();
        Node aktuell = (Node) tos;

        while (aktuell != null) {
            ergebnis.append(aktuell.getElem()).append("\n");
            aktuell = aktuell.getNext();
        }

        return ergebnis.toString();
    }
}

