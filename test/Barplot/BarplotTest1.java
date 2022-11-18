package Barplot;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Barplot.Barplot;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created:
 *
 * @author Maximilian Ertl ()
 */
class BarplotTest1 {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void repeat() {
        System.out.println("Repeat");
        String s = Barplot.repeat('+', 5);
        assertEquals(s, "+++++");
    }
    @Test
    void repeat2() {
        System.out.println("Repeat 2");
        assertEquals(Barplot.repeat('-', 5), "-----");
        assertEquals(Barplot.repeat('-', 1), "-");
        assertEquals(Barplot.repeat('-', 0), "-");
    }
}