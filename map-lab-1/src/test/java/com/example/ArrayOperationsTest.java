import static org.junit.Assert.*;

import com.example.ArrayOperations;
import org.junit.Test;

public class ArrayOperationsTest {
    @Test
    public void testMaxZahl() {
        int[] numbers = {4, 8, 3, 10, 17};
        int expectedMax = 17;
        int actualMax = ArrayOperations.maxZahl(numbers);
        assertEquals(expectedMax, actualMax);

        int[] emptyArray = {};
        try {
            ArrayOperations.maxZahl(emptyArray); // Erwartet eine Ausnahme
            fail("Erwartete Ausnahme wurde nicht ausgelöst.");
        } catch (IllegalArgumentException e) {
            // Erfolgreich, da eine Ausnahme erwartet wird.
        }
    }

    @Test
    public void testMinZahl() {
        int[] numbers = {4, 8, 3, 10, 17};
        int expectedMin = 3;
        int actualMin = ArrayOperations.minZahl(numbers);
        assertEquals(expectedMin, actualMin);

        int[] emptyArray = {};
        try {
            ArrayOperations.minZahl(emptyArray); // Erwartet eine Ausnahme
            fail("Erwartete Ausnahme wurde nicht ausgelöst.");
        } catch (IllegalArgumentException e) {
            // Erfolgreich, da eine Ausnahme erwartet wird.
        }
    }

    @Test
    public void testMaxSum() {
        int[] numbers = {4, 8, 3, 10, 17};
        int expectedMaxSum = 39;
        int actualMaxSum = ArrayOperations.maxSum(numbers);
        assertEquals(expectedMaxSum, actualMaxSum);

        int[] singleElementArray = {42};
        try {
            ArrayOperations.maxSum(singleElementArray); // Erwartet eine Ausnahme
            fail("Erwartete Ausnahme wurde nicht ausgelöst.");
        } catch (IllegalArgumentException e) {
            // Erfolgreich, da eine Ausnahme erwartet wird.
        }
    }

    @Test
    public void testMinSum() {
        int[] numbers = {4, 8, 3, 10, 17};
        int expectedMinSum = 25;
        int actualMinSum = ArrayOperations.minSum(numbers);
        assertEquals(expectedMinSum, actualMinSum);

        int[] singleElementArray = {42};
        try {
            ArrayOperations.minSum(singleElementArray); // Erwartet eine Ausnahme
            fail("Erwartete Ausnahme wurde nicht ausgelöst.");
        } catch (IllegalArgumentException e) {
            // Erfolgreich, da eine Ausnahme erwartet wird.
        }
    }
}
