package Vehicle;

/**
 * Created: 17.05.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */

public class Bicycle extends Vehicle{
    public Bicycle(String brand) {
        super(brand, 2);
    }
    public Bicycle(String brand, int wheels) {
        super(brand, wheels);
        if (wheels != 2 || wheels != 3) {
            throw new IllegalArgumentException("Raeder nicht 2 oder 3!");
        }
    }
}
