package pro.sisit.alg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FibonacciTest {

    @Test
    public void fibonacciTest() {
        assertEquals(75025, Fibonacci.getValueReq(25));
    }

    @Test
    public void fibonacciTest1() {
        assertEquals(0, Fibonacci.getValueReq(-1));
    }

    @Test
    public void fibonacciForTest() {
        assertEquals(75025, Fibonacci.getValueFor(25));
    }

}
