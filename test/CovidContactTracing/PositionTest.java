package CovidContactTracing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {
    final Position p1 = new Position(0,1);
    final Position p2 = new Position(2,3);


    @Test
    void distanceTest() {
        float f = (float) 2.828;
        assertEquals(f,Position.distance(p1,p2));
    }
}