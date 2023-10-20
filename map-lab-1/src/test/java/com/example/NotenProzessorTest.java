package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class NotenProzessorTest {

    public static final String SHOULD_BE_EQUAL = "Soll gleich sein";

    private NotenProzessor notenProzessor;

    @Before
    public void init() {
        notenProzessor = new NotenProzessor();
    }

    @Test
    public void addToArrayTest() {
        int[] noten = new int[] { 10, 20, 30 };
        int newElement = 50;

        int[] result = notenProzessor.addToArray(noten, newElement);

        int[] expected = new int[] { 10, 20, 30, 50 };

        assertArrayEquals(SHOULD_BE_EQUAL, expected, result);
    }

    @Test
    public void testFindFailingGrades() {
        int[] grades = {84, 29, 53, 67, 91, 38};
        int[] expectedFailingGrades = {29, 38};
        assertArrayEquals(expectedFailingGrades, notenProzessor.nichtAusreichendeNoten(grades));

        int[] noFailingGrades = {85, 90, 92};
        int[] expectedNoFailingGrades = {};
        assertArrayEquals(expectedNoFailingGrades, notenProzessor.nichtAusreichendeNoten(noFailingGrades));
    }

    @Test
    public void testCalculateAverage() {
        int[] grades = {84, 29, 53, 67, 91, 38};
        double expectedAverage = (84 + 29 + 53 + 67 + 91 + 38) / 6.0;
        assertEquals(expectedAverage, notenProzessor.calculateAverage(grades), 0.01);

        int[] emptyGrades = {};
        assertEquals(0.0, notenProzessor.calculateAverage(emptyGrades), 0.01);
    }

    @Test
    public void testRoundGrades() {
        int[] grades = {84, 29, 53, 67, 91, 38};
        int[] expectedRoundedGrades = {85, 29, 55, 67, 90, 38};
        assertArrayEquals(expectedRoundedGrades, notenProzessor.roundGrades(grades));

        int[] noRoundingNeeded = {40, 50, 55};
        assertArrayEquals(noRoundingNeeded, notenProzessor.roundGrades(noRoundingNeeded));
    }

    @Test
    public void testFindMaxRoundedGrade() {
        int[] grades = {84, 29, 53, 67, 91, 38};
        int expectedMaxRoundedGrade = 90;
        assertEquals(expectedMaxRoundedGrade, notenProzessor.findMaxRoundedGrade(grades));

        int[] noRoundingNeeded = {40, 50, 55};
        int expectedMaxRoundedGrade2 = 55;
        assertEquals(expectedMaxRoundedGrade2, notenProzessor.findMaxRoundedGrade(noRoundingNeeded));
    }

}