package StackQueue;

/**
 * Created: 22.03.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */

/*
public class LinkedQueue {
    private Node top;
    private Node tail;
    private int size;

    public Object getTop() {
        return top.getElem();
    }

    public Object getTail() {
        return tail.getElem();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public boolean add(Object o) {
        Node oldLast = tail;
        tail = new Node(null);
        tail.o = o;
        tail.next = null;
        if (isEmpty()) {
            top = tail;
        }
        else {
            oldLast.next = tail;
        }
        size++;
        return true;
    }

    public Object get() {
        if (isEmpty()) {
            return null;
        }
        Object removed;
        removed = tail;
        top = top.getNext();
        size--;
        return removed;
    }


    public Object element() {
        return tail.o;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

            StringBuilder ergebnis = new StringBuilder("[");
            Node aktuell = (Node) top;

            while (aktuell != null) {
                ergebnis.append(tail.getElem()).append("\n");
                 aktuell = aktuell.getNext();
            }

            return ergebnis.append(tail.getElem()).append("]").toString();
        }
    }
*/
