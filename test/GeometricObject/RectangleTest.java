package GeometricObject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    double width;
    double heigth;

        @BeforeEach
        void setUp() {
            width = 187;
            heigth = 27;
        }


        @Test
        void calcArea() {
            Rectangle rechteck = new Rectangle(width, heigth);
            assertEquals(5049, rechteck.calcArea());
        }

        @Test
        void calcPerimeter() {
            Rectangle rechteck = new Rectangle(width,heigth);
            assertEquals(428, rechteck.calcPerimeter());
        }
    }