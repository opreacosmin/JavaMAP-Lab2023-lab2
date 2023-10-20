package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class BigNumberOperationsTest {
    @Test
    public void testAdd() {
        int[] num1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] expectedSum = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] actualSum = BigNumberOperations.add(num1, num2);
        assertArrayEquals(expectedSum, actualSum);

        int[] shortArray = {1, 2, 3};
        int[] longArray = {9, 8, 7, 6};
        try {
            BigNumberOperations.add(shortArray, longArray); // Erwartet eine Ausnahme
            fail("Erwartete Ausnahme wurde nicht ausgelöst.");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Erfolgreich, da eine Ausnahme erwartet wird.
        }
    }

    @Test
    public void testSubtract() {
        int[] num1 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] expectedDifference = {2, 9, 0, 0, 0, 0, 0, 0, 0};
        int[] actualDifference = BigNumberOperations.subtract(num1, num2);
        assertArrayEquals(expectedDifference, actualDifference);

        int[] invalidSubtraction = {1, 2, 3};
        int[] largerArray = {9, 8, 7, 6};
        try {
            BigNumberOperations.subtract(invalidSubtraction, largerArray); // Erwartet eine Ausnahme
            fail("Erwartete Ausnahme wurde nicht ausgelöst.");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Erfolgreich, da eine Ausnahme erwartet wird.
        }
    }

    @Test
    public void testMultiply() {
        int[] num1 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int digit = 2;
        int[] expectedProduct = {4, 7, 2, 0, 0, 0, 0, 0, 0};
        int[] actualProduct = BigNumberOperations.multiply(num1, digit);
        assertArrayEquals(expectedProduct, actualProduct);
    }

    @Test
    public void testDivide() {
        int[] num1 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int divisor = 2;
        int[] expectedQuotient = {1, 1, 8, 0, 0, 0, 0, 0, 0};
        int[] actualQuotient = BigNumberOperations.divide(num1, divisor);
        assertArrayEquals(expectedQuotient, actualQuotient);

        int[] zeroDivisor = {0, 1, 2, 3};
        try {
            BigNumberOperations.divide(num1, 0); // Erwartet eine Ausnahme
            fail("Erwartete Ausnahme wurde nicht ausgelöst.");
        } catch (ArithmeticException e) {
            // Erfolgreich, da eine Ausnahme erwartet wird.
        }
    }
}
