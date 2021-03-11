import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator cal= new Calculator();

    @org.junit.Test
    public void additionTruePositive(){
        assertEquals("Addition of 2 numbers for True Positive", 12, cal.addition(5,7), DELTA);
        assertEquals("Addition of 2 numbers for True Positive", 23, cal.addition(4,19), DELTA);
    }

    @org.junit.Test
    public void additionFalsePositive(){
        assertNotEquals("Addition of 2 numbers for False Positive", 12, cal.addition(6,18), DELTA);
        assertNotEquals("Addition of 2 numbers for False Positive", 24, cal.addition(18,31), DELTA);
    }
    @org.junit.Test
    public void subtractionTruePositive(){
        assertEquals("Subtraction of 2 numbers for True Positive", -4, cal.subtraction(9,13), DELTA);
        assertEquals("Subtraction of 2 numbers for True Positive", 11, cal.subtraction(55,44), DELTA);
    }

    @org.junit.Test
    public void subtractionFalsePositive(){
        assertNotEquals("Subtraction of 2 numbers for False Positive", 120, cal.subtraction(6,11), DELTA);
        assertNotEquals("Subtraction of 2 numbers for False Positive", 24, cal.subtraction(112,78), DELTA);
    }

    @org.junit.Test
    public void multiplicationTruePositive(){
        assertEquals("Multiplication of 2 numbers for True Positive", 35, cal.multiplication(5,7), DELTA);
        assertEquals("Multiplication of 2 numbers for True Positive", 24, cal.multiplication(4,6), DELTA);
    }

    @org.junit.Test
    public void multiplicationFalsePositive(){
        assertNotEquals("Multiplication of 2 numbers for False Positive", 120, cal.multiplication(6,11), DELTA);
        assertNotEquals("Multiplication of 2 numbers for False Positive", 24, cal.multiplication(112,78), DELTA);
    }

    @org.junit.Test
    public void divisionTruePositive(){
        assertEquals("Division of 2 numbers for True Positive", 12, cal.division(36,3), DELTA);
        assertEquals("Division of 2 numbers for True Positive", 24, cal.division(48,2), DELTA);
    }

    @org.junit.Test
    public void divisionFalsePositive(){
        assertNotEquals("Division of 2 numbers for False Positive", 120, cal.division(55,5), DELTA);
        assertNotEquals("Division of 2 numbers for False Positive", 9, cal.division(24,4), DELTA);
    }

    @org.junit.Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 120, cal.factorial(5), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 24, cal.factorial(4), DELTA);
    }

    @org.junit.Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 120, cal.factorial(6), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 24, cal.factorial(3), DELTA);
    }

    @org.junit.Test
    public void powerTruePositive(){
        assertEquals("Finding power for True Positive", 8, cal.power(2, 3), DELTA);
        assertEquals("Finding power for True Positive", 64, cal.power(4, 3), DELTA);
    }

    @org.junit.Test
    public void powerFalsePositive(){
        assertNotEquals("Finding power for False Positive", 6, cal.power(2, 2), DELTA);
        assertNotEquals("Finding power for False Positive", -7.3, cal.power(2, 3), DELTA);
    }

    @org.junit.Test
    public void logarithmTruePositive(){
        assertEquals("Finding natural log for True Positive", 0, cal.logarithm(1), DELTA);
        assertEquals("Finding natural log for True Positive", 0, cal.logarithm(1), DELTA);
    }

    @org.junit.Test
    public void logarithmFalsePositive(){
        assertNotEquals("Finding natural log for False Positive", 6, cal.logarithm(2.4), DELTA);
        assertNotEquals("Finding natural log for False Positive", 7.3, cal.logarithm(2.1), DELTA);
    }

    @org.junit.Test
    public void squarerootTruePositive(){
        assertEquals("Finding square root for True Positive", 2, cal.squareroot(4), DELTA);
        assertEquals("Finding square root for True Positive", 1, cal.squareroot(1), DELTA);
    }

    @Test
    public void squarerootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 1, cal.squareroot(3), DELTA);
        assertNotEquals("Finding square root for False Positive", 0, cal.squareroot(4), DELTA);

    }
}