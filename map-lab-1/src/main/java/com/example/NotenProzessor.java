package com.example;

public class NotenProzessor {

    public int[] nichtAusreichendeNoten(int[] note) {

        for (int i = 0; i < note.length; i++) {
            if (note[i] < 0 || note[i] > 100) {
                System.out.println("Noten soll zwischen 0 und 100 sein.");
                return null;
            }
        }

        int[] finaleNoten = new int[0];

        for (int i = 0; i < note.length; i++) {
            if (round(note[i]) < 40) {
                finaleNoten = addToArray(finaleNoten, round(note[i]));
            }
        }
        return finaleNoten;
    }

    public int round(int note) {
        if (note < 38) {
            return note;
        } else {
            if (note % 5 > 2) {
                return note + 5 - note % 5;
            } else {
                return note;
            }
        }
    }

    public int[] addToArray(int[] original, int newElement) {
        int[] result = new int[original.length + 1];
        for (int i = 0; i < original.length; i++) {
            result[i] = original[i];
        }
        result[original.length] = newElement;
        return result;
    }

    // Methode zur Berechnung des Durchschnitts
    public double calculateAverage(int[] grades) {
        if (grades.length == 0) {
            return 0.0;
        }

        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.length;
    }

    // Methode zur Ermittlung der maximal abgerundeten Note
    public int findMaxRoundedGrade(int[] grades) {
        int maxRoundedGrade = Integer.MIN_VALUE;

        for (int grade : grades) {
            int roundedGrade = round(grade);
            maxRoundedGrade = Math.max(maxRoundedGrade, roundedGrade);
        }

        return maxRoundedGrade;
    }

    // Methode zum Runden der Noten
    public int[] roundGrades(int[] grades) {
        int[] roundedGrades = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {
            roundedGrades[i] = round(grades[i]);
        }

        return roundedGrades;
    }

    // Methode zur Ermittlung der nächsten multiplen von 5
    private static int findNextMultipleOf5(int number) {
        int nextMultipleOf5 = number;
        while (nextMultipleOf5 % 5 != 0) {
            nextMultipleOf5++;
        }
        return nextMultipleOf5;
    }

}