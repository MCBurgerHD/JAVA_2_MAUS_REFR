package MathematischeFolgen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReciprocalTest {
    int n;

    @BeforeEach
    void setUp() {
        n = 4;
    }

    @Test
    void sumOfFirst_n_Elements() {
        Reciprocal rec = new Reciprocal(n);
        assertEquals(1.676190476190476, rec.sumOfFirst_n_Elements());
    }

    @Test
    void nth_Element() {
        Reciprocal rec = new Reciprocal(n);
        assertEquals(0.14285714285714285, rec.nth_Element());
    }
}