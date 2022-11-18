package StackQueue;

/**
 * Created: 22.03.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */
public class StackTest extends LinkedStack{
    public StackTest(Object elem) {
        super(elem);
    }



    public static void main(String[] args) {
        LinkedStack objekt = new LinkedStack(null);

        objekt.push("A");
        objekt.push("B");
        objekt.push("C");

        objekt.size();

        System.out.println(objekt.element().toString());

        objekt.pop();

        System.out.println(objekt.element().toString());

        objekt.pop();

        System.out.print(objekt.element().toString());
    }
}
