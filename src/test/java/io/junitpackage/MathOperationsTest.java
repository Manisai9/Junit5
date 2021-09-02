package io.junitpackage;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathOperationsTest {

     MathOperations math;

     @BeforeAll
     public  void beforeAllInit(){
         System.out.println("This needs to run before all");
     }

    @BeforeEach
     public void init() {
        math = new MathOperations();
    }

    @AfterEach
    public void cleanup() {
        System.out.println("Cleaning up...");
    }

    @Test
    @DisplayName("Testing add method")
    public void test1() {
        int expectedValue = 8;
        int actualValue = math.add(5, 3);
        assertEquals(expectedValue, actualValue);
        System.out.println("It passes the Test");
        System.out.println("actual value is " + actualValue);
    }

    @Test
    @DisplayName("Testing AreaOfCircle method")
    public void testAreaofCircle() {
        assertEquals(314.0, math.areaOfCircle(10));

    }

    @Test
    @DisplayName("Testing Divide method")
    public void testDivide() {
         boolean isServeUp = true;
         assumeTrue(isServeUp);
        assertEquals(5, math.divide(10,2));

    }
    @Test
    @DisplayName("Testing Divide1 method")
    public void test1Divide() {
        assertThrows(ArithmeticException.class, () -> math.divide(5,0));

    }

    @Test
    @Disabled
    @DisplayName("Multiply method should not run")
    public void testDisabled() {
         fail();
    }
}