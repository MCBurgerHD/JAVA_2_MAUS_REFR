/**
 * Mitglieder: Jilch, Ertl, Hesseling, Krapfenbauer
 * Datum: 21.06.2022
 **/
package CovidContactTracing;

import java.text.DecimalFormat;
import java.text.Format;

public class Position {
    private int x;
    private int y;

    public static void main(String[] args) {
        final Position p1 = new Position(0,1);
        final Position p2 = new Position(2,3);

        System.out.println(distance(p1,p2));



    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Position(int x, int y) {
        if (Double.isFinite(x) && Double.isFinite(y)) {
            this.x = x;
            this.y = y;
        } else throw new IllegalArgumentException("x oder y ist nicht gültig.");
    }

    public static float distance(Position a, Position b) {

        float n= (float) Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
         String s = String.valueOf(n).substring(0,5);
        float  f= Float.valueOf(s);
        return f;

    }

    @Override
    public String toString() {
        return "X:" + x + " Y:" + y;
    }
}
