package io.junitpackage;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathOperationsTest {

    @Test
    public void test() {
        System.out.println("First test");
    }

    @Test
    public void test1() {
        MathOperations mathOperations = new MathOperations();
        int expectedValue = 8;
        int actualValue = mathOperations.add(5, 3);
        assertEquals(expectedValue, actualValue);
        System.out.println("It passes the Test");
        System.out.println("actual value is " + actualValue);
    }

    @Test
    public void testAreaofCircle() {
        MathOperations mathOperations = new MathOperations();
        assertEquals(314.0, mathOperations.areaOfCircle(10));

    }

    @Test
    public void testDivide() {
        MathOperations mathOperations = new MathOperations();
        assertEquals(5, mathOperations.divide(10,2));

    }
    @Test
    public void test1Divide() {
        MathOperations mathOperations = new MathOperations();
        assertThrows(ArithmeticException.class, () -> mathOperations.divide(5,0));

    }
}