package support.lab.course.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    private Calculator mCalculator;

    @Before
    public void setUp() throws Exception {
        // executed before each test case
        mCalculator = new Calculator();
        System.out.println("Rune at the beginning of every test case");
        System.out.println("Rune with every test case");
    }

    @After
    public void shutdown() {
        // executed after each test case
        System.out.println("Called at the end of every test case");
    }

    @Test
    public void testSum() {
        assertEquals(7d, mCalculator.sum(2d, 5d), 0);
    }

    @Test
    public void testSum1() throws Exception {
        //expected: 6, sum of 1 and 5
        assertEquals(6d, mCalculator.sum(1d, 5d), 0);
    }

    @Test
    public void testSum2() throws Exception {
        //expected: 4, sum of -1 and 5
        assertEquals(4d, mCalculator.sum(-1d, 5d), 0);
    }

    @Test
    public void testSum3() throws Exception {
        //expected: 4, sum of -1 and 5
        assertNotEquals(10d, mCalculator.sum(-1d, 5d), 0);
    }

    @Test
    public void testSum4() {
        assertEquals(-12, mCalculator.sum(-7, -5), 0);
    }

    @Test
    public void testSum5() {
        assertEquals(-12.24, mCalculator.sum(-7.14, -5.10), 0.00010);
    }

    @Test
    public void testSubtract1() throws Exception {
        assertEquals(1d, mCalculator.subtract(5d, 4d), 0);
    }

    @Test
    public void testSubtract2() throws Exception {
        assertEquals(1d, mCalculator.subtract(4d, 5d), 0);
    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(4d, mCalculator.divide(20d, 5d), 0);
    }

    @Test
    public void testDivide2() throws Exception {
        assertEquals(3.4, mCalculator.divide(10, 3), 0);
    }

    @Test
    public void testMultiply() throws Exception {
        assertEquals(10d, mCalculator.multiply(2d, 5d), 0);
    }

    @Test
    public void testInvalidDivide() {
        assertEquals(1000, mCalculator.divide(3, 0), 0);
    }
    @Test
    public void testIsWorkingMethod() {
        assertTrue(mCalculator.isItWorking());
    }
}
