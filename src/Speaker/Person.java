package Speaker;

/**
 * Created: 24.05.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */

public class Person implements Speaker{
    private String nachricht;

    @Override
    public String speak() throws MuteException {
        if (getNachricht() == "Muted") {
            throw new MuteException("Stumm");
        }
        else {
        return nachricht;
        }
    }

    public Person(String nachricht) {
        try {
            speak();
        } catch (MuteException e) {
            setNachricht("Stummgeschalted");
        }
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
