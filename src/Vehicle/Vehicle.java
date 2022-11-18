package Vehicle;

import java.util.Random;

public abstract class Vehicle {
    public static final String[] CAR_BRANDS = {"BMW", "Honda", "Suzuki",
            "VW", "Ferrari", "Alfa Romeo", "Mercedes", "Maserati", "Tesla"};
    public static final String[] MOTORCYCLE_BRANDS = {"BMW", "Honda", "Suzuki",
            "Ducati", "Moto Guzzi", "Kawasaki"};
    public static final String[] BICYCLE_BRANDS = {"Bianchi", "Giant", "Trek", "Scott", "Fuji"};
    private static final Random RANDOM = new Random();
    private String brand;
    private int wheels;

    /**
     * Creates a new vehicle.
     *
     * @param brand  the brad
     * @param wheels the number of wheels on the vehicle. Must be positive.
     */
    public Vehicle(String brand, int wheels) {
        if (wheels <= 0) {
            throw new IllegalArgumentException("Räderanzahl kleiner oder gleich 0!");
        }
        this.brand = brand;
        this.wheels = wheels;
    }

    /**
     * Counts how many vehicles have a motor in a given array.
     *
     * @param vehicles an array of vehicles
     * @return number of motorized Objects in array
     */
    public static int countMotorized(Vehicle[] vehicles) {
        int anzahl = 0;
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] instanceof Motorized) {
                anzahl++;
            }
        }
        return anzahl;
    }

    /**
     * Filters all cars with running motor from a given array.
     *
     * @param vehicles an array of vehicles
     * @return an array of vehicles containing only Cars with running motor
     */
    public static Vehicle[] getStartedCars(Vehicle[] vehicles) {
        Vehicle[] cars = new Vehicle[vehicles.length];
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] instanceof Car) {
                cars[i] = vehicles[i];
            }
        }
        return cars;
    }

    /**
     * Creates an array of random Vehicles. Type is random, brand is random. If the vehicle has a motor, the power is
     * also randomized.
     *
     * @param n the number of desired Vehicels
     * @return an array of random Vehicles.
     */
    public static Vehicle[] getNRandom(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n NEGATIV!");
        }
        Vehicle[] randomVehicels = new Vehicle[n];
        for (int i = 0; i < n; i++) {
            double random = Math.random();
            if (random == 0.0) {
                randomVehicels[i] = new Motorcycle(MOTORCYCLE_BRANDS[i], 30);
            }
            if (random == 1.0) {
                randomVehicels[i] = new Car(CAR_BRANDS[i], 50);
            }
            else {
                randomVehicels[i] = new Bicycle(BICYCLE_BRANDS[i],2);
            }
        }
        return randomVehicels;
    }

    public String getBrand() {
        return brand;
    }

    public int getWheels() {
        return wheels;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
};