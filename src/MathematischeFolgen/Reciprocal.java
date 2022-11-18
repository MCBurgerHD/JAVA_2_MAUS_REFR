package MathematischeFolgen;

/**
 * Created: 03.05.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */

public class Reciprocal extends MathSeries {
    public Reciprocal(int n) {
        super(n);
    }

    public double kehrwert(int n) {
        if (getN() <= 0) {
            return 0;
        }
        double sum = 0;
        for (double i = 1; i <= n; i++) {
                sum += 1 / (i * 2 - 1);
        }
        return sum;
    }

    @Override
    double sumOfFirst_n_Elements() {
        return kehrwert(getN());
    }

    @Override
    double nth_Element() {
        if (getN() <= 0) {
            return 0;
        }

        double sum = 0;
        for (double i = 1; i <= getN(); i++) {
                sum = 1 / (i * 2 - 1);
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Calculation of the reciprocal series with " + getN() + "Elements :  sumOfFirst_n_Elements()" +
                sumOfFirst_n_Elements() + "nth_Element" + nth_Element();
    }
}
