package Schüttbuker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created:
 *
 * @author Maximilian Ertl ()
 */
class KranTest {
Kran k1;
Kran k2;
Kran k3;

    @BeforeEach
    void setUp() {
        k1 = new Kran();
        k2 = new Kran(10,0);
        k3 = new Kran(10,10);
    }


    @Test
    void getPosition() {
        assertEquals(k1.getPosition(), 0);
    }

    @Test
    void fuell() {
       k1.fuell(5);
       assertEquals(k1.gibAlles(), 5);
    }


    @Test
    void nachRechts() {
        k1.nachRechts(5);
        k3.nachRechts(100);
        assertEquals(k1.getPosition(), 5);
        assertEquals(k3.getPosition(), 9);
    }

    @Test
    void nachLinks() {
        k2.nachLinks(-5);
        k3.nachLinks(1);
        assertEquals(k2.getPosition(), 5);
        assertEquals(k3.getPosition(), 0);
    }
    @Test
    public void testToString() {
        k3.fuell(5);
        assertEquals(k3.toString(), "5000000000");
        assertEquals(k2.toString(), "0000000000");
    }
}