package io.junitpackage;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathOperationsTest {

    @Test
    public void test() {
        System.out.println("First test");
    }

    @Test
    public void test1() {
        MathOperations mathOperations = new MathOperations();
        int expectedValue = 8;
        int actualValue = mathOperations.add(5,3);
        assertEquals(expectedValue, actualValue);
        System.out.println("It passes the Test");
        System.out.println("actual value is "+actualValue);
    }
}