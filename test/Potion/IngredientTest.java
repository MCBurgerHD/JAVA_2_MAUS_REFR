package Potion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created:
 *
 * @author Maximilian Ertl ()
 */
class IngredientTest {
    Ingredient ingredient1;
    Ingredient ingredient2;

    @BeforeEach
    void setUp() {
        ingredient1 = new Ingredient("Spinne");
        ingredient2 = new Ingredient("Fligenpilz");
    }


    @Test
    void setName() {
        assertEquals("Fliege", ingredient1.setName("Fliege"));
        assertEquals("Echsenschuppe", ingredient2.setName("Echsenschuppe"));

    }

    @Test
    void power() {
        assertEquals(6, ingredient1.power());
        assertEquals(10, ingredient2.power());
    }
}