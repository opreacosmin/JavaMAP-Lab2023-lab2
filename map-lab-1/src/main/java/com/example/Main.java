package com.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NotenProzessor notenProzessor = new NotenProzessor();

        int[] noten = new int[] { 10, 20, 30, 37, 39, 47, 48, 60 };
        System.out.println("Nicht ausreichende Note liefern: " + Arrays.toString(notenProzessor.nichtAusreichendeNoten(noten)));

        double average = notenProzessor.calculateAverage(noten);
        int[] roundedGrades = notenProzessor.roundGrades(noten);
        int maxRoundedGrade = notenProzessor.findMaxRoundedGrade(noten);

        System.out.println("Durchschnittswert: " + average);

        System.out.print("Abgerundete Noten: ");
        for (int grade : roundedGrades) {
            System.out.print(grade + " ");
        }
        System.out.println();

        System.out.println("Maximal abgerundete Note: " + maxRoundedGrade);
    }
}
