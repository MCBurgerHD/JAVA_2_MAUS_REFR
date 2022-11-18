package MathematischeFolgen;

/**
 * Created: 03.05.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */

abstract class MathSeries {
    private int n;

    public int getN() {
        return n;
    }

    public MathSeries(int n) {
        this.n = n;
    }

    abstract double sumOfFirst_n_Elements();

    abstract double nth_Element();

    @Override
    public String toString() {
        return "Calculation of the mathematic series with " + n + "Elements";
    }
}
