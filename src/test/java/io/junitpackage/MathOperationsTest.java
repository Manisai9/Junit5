package io.junitpackage;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathOperationsTest {

     MathOperations math;

    @BeforeEach
     public void init() {
        math = new MathOperations();
    }


    @Test
    public void test1() {
        int expectedValue = 8;
        int actualValue = math.add(5, 3);
        assertEquals(expectedValue, actualValue);
        System.out.println("It passes the Test");
        System.out.println("actual value is " + actualValue);
    }

    @Test
    public void testAreaofCircle() {
        assertEquals(314.0, math.areaOfCircle(10));

    }

    @Test
    public void testDivide() {
        assertEquals(5, math.divide(10,2));

    }
    @Test
    public void test1Divide() {
        assertThrows(ArithmeticException.class, () -> math.divide(5,0));

    }
}