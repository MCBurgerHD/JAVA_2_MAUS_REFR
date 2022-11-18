package Speaker;

/**
 * Created: 24.05.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */

public class Dog implements Speaker{
    private String nachricht;

    @Override
    public String speak() {
        return "Bark";
    }

    public Dog(String nachricht) {
        this.nachricht = nachricht;
    }

    public void setNachricht(String nachricht) {
        this.nachricht = nachricht;
    }

    public String getNachricht() {
        return nachricht;
    }

    @Override
    public String toString() {
        return getNachricht();
    }
}
