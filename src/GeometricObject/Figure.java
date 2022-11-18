package GeometricObject;

/**
 * Created: 10.05.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */

public abstract class Figure implements GeometricObject{

    @Override
    public void translate(double x, double y) {
        double px = 0;
        double py = 0;
        px += x;
        py += y;
    }
}
