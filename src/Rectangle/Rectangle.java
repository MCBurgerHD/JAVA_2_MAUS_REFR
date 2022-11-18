package Rectangle;

/**
 * Created: 11.01.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */
public class Rectangle {
    private double length = 1.0;
    private double width = 1.0;

    public Rectangle() {
    }

    public Rectangle(double length) {
        this(length, length);
    }

    public Rectangle(double width, double length) {
        setLength(length);
        setWidth(width);
    }

    public double flaeche() {
        return length * width;
    }

    public double umfang(){
        return 2 * length + 2 * width;
    }
    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public void setLength(double length) {
        this.length = checkNr(length);
    }

    public void setWidth(double width) {
        this.width = checkNr(width);
    }

    public double checkNr(double length){
        if (length < 1.0) {
            return  1.0;
        }
        else if (length > 20.0) {
            return  20.0;
        }
        else
            return length;
    }
}
