package MathematischeFolgen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReciprocalAlternatingTest {
    int n;

    @BeforeEach
    void setUp() {
        n = 4;
    }

    @Test
    void sumOfFirst_n_Elements() {
        ReciprocalAlternating reca = new ReciprocalAlternating(n);
        assertEquals(0.7238095238095239, reca.sumOfFirst_n_Elements());
    }

    @Test
    void nth_Element() {
        ReciprocalAlternating reca = new ReciprocalAlternating(n);
        assertEquals(0.2, reca.nth_Element());
    }
}