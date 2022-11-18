package StackQueue;

/**
 * Created: 22.03.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */
public class Node {
    public Node next;
    private Object elem;


    public Node(Object elem) {
        this.elem = elem;
    }

    public Node() {

    }


    public Object getElem() {
        return elem;
    }

    public Node getNext() {
        return next;
    }

    public void setElem(Object elem) {
        this.elem = elem;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
