package Vehicle;

/**
 * Created: 17.05.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */

public class Car extends Vehicle implements Motorized{
    private double power;
    private boolean started;

    public void setPower(double power) {
        if (power < 0) {
            throw new IllegalArgumentException("Power NEGATIV!");
        }
            this.power = power;
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

    public Car(String brand, double power) {
        super(brand, 4);
        if (power < 0) {
            throw new IllegalArgumentException("Power NEGATIV!");
        }
        this.power = power;
    }
    public Car(String brand, double power, boolean started) {
        super(brand, 4);
        if (power < 0) {
            throw new IllegalArgumentException("Power NEGATIV!");
        }
        this.power = power;
        this.started = started;
    }
}
