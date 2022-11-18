package GeometricObject;

/**
 * Created: 10.05.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */


public interface GeometricObject {
    void  translate(double x, double y);
    void  scale(double s);
    double  calcArea ();
    double  calcPerimeter ();
}
