package MathematischeFolgen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    int n;

    @BeforeEach
    void setUp() {
        n = 4;
    }

    @Test
    void sumOfFirst_n_Elements() {
        Fibonacci fib = new Fibonacci(n);
        assertEquals(18, fib.sumOfFirst_n_Elements());
    }

    @Test
    void nth_Element() {
        Fibonacci fib = new Fibonacci(n);
        assertEquals(8, fib.nth_Element());
    }
}