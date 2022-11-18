package GeometricObject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    double test;

    @BeforeEach
    void setUp() {
        test = 420;
    }


    @Test
    void calcArea() {
        Circle kreis = new Circle(test);
        assertEquals(554176.9440932395, kreis.calcArea());
    }

    @Test
    void calcPerimeter() {
        Circle kreis = new Circle(test);
        assertEquals(2638.9378290154264, kreis.calcPerimeter());
    }
}