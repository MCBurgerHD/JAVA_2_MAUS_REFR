package Vehicle;

/**
 * Created: 17.05.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */

public class Motorcycle extends Vehicle implements Motorized{
    private double power;
    private boolean started;

    public void setPower(double power) {
        if (power < 0) {
         throw new IllegalArgumentException("Power NEGATIV!");
        }
        else {
            this.power = power;
        }
    }

    @Override
    public void start() {
        started = true;
    }

    @Override
    public void stop() {
        started = false;
    }

    @Override
    public boolean isStarted() {
        return started;
    }

    @Override
    public double getPower() {
        return power;
    }
    public Motorcycle(String brand, double power) {
        super(brand, 2);
        if (power < 0) {
            throw new IllegalArgumentException("Power NEGATIV!");
        }
        this.power = power;
    }

    public Motorcycle(String brand, int wheels, double power, boolean started) {
        super(brand, wheels);
        if (wheels == 2 || wheels == 3) {
            this.power = power;
            this.started = started;
        }
        else{
            throw new IllegalArgumentException("Wheels nicht 2 oder 3!");
        }

    }
}
