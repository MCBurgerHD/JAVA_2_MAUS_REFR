package MathematischeFolgen;

/**
 * Created: 03.05.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */

public class ReciprocalAlternating extends Reciprocal {

    public ReciprocalAlternating(int n) {
        super(n);
    }

    public double kehrwert(int n) {
        if (getN() <= 0) {
            return 0;
        }
        double sum = 0;
        for (double i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    sum += 1 / (i * 2 - 1);
                } else {
                    sum -= 1 / (i * 2 - 1);
            }
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
            if (i % 2 != 0) {
                sum = 1 / (i * 2 - 1);
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Calculation of the reciprocal-alternating series with " + getN() + "Elements :  sumOfFirst_n_Elements()" +
                sumOfFirst_n_Elements() + "nth_Element" + nth_Element();
    }
}

