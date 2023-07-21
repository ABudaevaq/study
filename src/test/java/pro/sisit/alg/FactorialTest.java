package pro.sisit.alg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

    @Test
    public void factorialTest() {
        assertEquals(24, Factorial.factorial(4));
    }

    @Test
    public void factorialZeroTest() {
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    public void factorialForTest() {
        assertEquals(24, Factorial.factorialFor(4));
    }

    @Test
    public void factorialForZeroTest() {
        assertEquals(1, Factorial.factorialFor(0));
    }

}
