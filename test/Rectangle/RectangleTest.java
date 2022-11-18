package Rectangle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created:
 *
 * @author Maximilian Ertl ()
 */
class RectangleTest {
//    public static void main(String args[]){
//        Rectangle r1 = new Rectangle(1.0, 1.0);
//        Rectangle r2 = new Rectangle(5.0, 5.0);
//        Rectangle r3 = new Rectangle(14.7, 10.2);
//        Rectangle r4 = new Rectangle(20.0, 20.0);
//
//
//
//
//
//        System.out.println("Width r1 = " + r1.getWidth());
//        System.out.println("Height r1= " + r1.getLength());
//        System.out.println("Width r2= " + r2.getWidth());
//        System.out.println("Height r2= " + r2.getLength());
//        System.out.println("Width r3= " + r3.getWidth());
//        System.out.println("Height r3= " + r3.getLength());
//        System.out.println("Width r4= " + r4.getWidth());
//        System.out.println("Height r4= " + r4.getLength());
//    }
Rectangle r1;
Rectangle r2;
Rectangle r3;
Rectangle r4;

    @BeforeEach
    void setUp() {
        r1 = new Rectangle(1.0, 1.0);
        r2 = new Rectangle(5.0, 5.0);
        r3 = new Rectangle(14.7, 10.2);
        r4 = new Rectangle(20.0, 20.0);
    }

    @Test
    void flaeche() {
        assertEquals(1, r1.flaeche());
        assertEquals(4, r1.umfang());
    }

    @Test
    void umfang() {
    }

    @Test
    void checkNr() {
    }
}