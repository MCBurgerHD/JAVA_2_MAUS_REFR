package MathematischeFolgen;

/**
 * Created: 03.05.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */

public class Fibonacci extends MathSeries {
    public Fibonacci(int n) {
        super(n);
    }

    public int fibonacci(int n) {
        int zahl1 = 1;
        int zahl2 = 1;
        int fib = 0;
        for (int i = 0; i < n; i++) {
            fib = zahl1 + zahl2;
            zahl1 = zahl2;
            zahl2 = fib;
        }
        return fib;
    }

    @Override
    double sumOfFirst_n_Elements() {
        if (getN() <= 0) {
            return 0;
        }
        double sum = 0;
        double zahl1 = 1;
        double zahl2 = 1;
        double fib = 0;
        for (int i = 0; i < getN(); i++) {
            fib = zahl1 + zahl2;
            zahl1 = zahl2;
            zahl2 = fib;
            sum += fib;
        }
        return sum;
    }

    @Override
    double nth_Element() {
        return fibonacci(getN());
    }

    @Override
    public String toString() {
        return "Calculation of the fibonacci series with " + getN() + "Elements :  sumOfFirst_n_Elements()" +
                sumOfFirst_n_Elements() + "nth_Element" + nth_Element();
    }

}
