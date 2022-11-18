package Potion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created:
 *
 * @author Maximilian Ertl ()
 */
class PotionTest {
    Potion p1;
    Potion p2;

    Ingredient Spinnenauge = new Ingredient("Spinnenauge");
    Ingredient Froschschleim = new Ingredient("Froschschleim");
    Ingredient Blaetter = new Ingredient("Blaetter");
    Ingredient Haare = new Ingredient("Haare");
    Ingredient Wasser = new Ingredient("Wasser");
    Ingredient Salz  = new Ingredient("Salz");


    @BeforeEach
    void setUp() {
      p1 = new Potion( Spinnenauge,  Froschschleim, Blaetter);
      p2 = new Potion( Haare, Wasser, Salz);
    }

    @Test
    void stir() {
        assertEquals(1, p1.stir());
        assertEquals(1, p2.stir());
    }

    @Test
    void isReady() {
        p1.stir();
        assertEquals(false, p1.isReady());
        p1.stir();
        p1.stir();
        p1.stir();
        p1.stir();
        assertEquals(true, p1.isReady());

        p1.stir();
        assertEquals(false, p2.isReady());
        p1.stir();
        p1.stir();
        p1.stir();
        p1.stir();
        assertEquals(false, p2.isReady());
    }

    @Test
    void power() {
        assertEquals(32, p1.power());
        assertEquals(15, p2.power());
    }

   @Test
    void testToString() {
        assertEquals("Ingredient : Spinnenauge, Froschschleim, Blaetter" + "\n"+ "Power : 32"+ "\n" +"Ready : false" + "\n", p1.toString());
        assertEquals("Ingredient : Haare, Wasser, Salz" + "\n"+ "Power : 15"+ "\n" +"Ready : false" + "\n", p2.toString());
    }

}