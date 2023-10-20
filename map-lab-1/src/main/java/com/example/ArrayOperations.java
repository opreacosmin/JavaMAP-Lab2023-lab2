package com.example;

import java.util.Arrays;

public class ArrayOperations{

    public static void main(String[] args){
        int[] numbers = {4, 8, 3, 10, 17};

        int max = maxZahl(numbers);
        int min = minZahl(numbers);
        int maxSum = maxSum(numbers);
        int minSum = minSum(numbers);

        System.out.println("Maximale Zahl: " + max);
        System.out.println("Minimale Zahl: " + min);
        System.out.println("Maximale Summe von n-1 Zahlen: " + maxSum);
        System.out.println("Minimale Summe von n-1 Zahlen: " + minSum);
    }

    public static int maxZahl(int[] array){
        if (array.length == 0) {
            throw new IllegalArgumentException("Das Array ist leer.");
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int minZahl(int[] array){
        if (array.length == 0) {
            throw new IllegalArgumentException("Das Array ist leer.");
        }
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int maxSum(int[] array){
        if (array.length < 2) {
            throw new IllegalArgumentException("Das Array enthält weniger als zwei Elemente.");
        }
        int sum = Arrays.stream(array).sum();
        int min = Arrays.stream(array).min().getAsInt();
        return sum - min;
    }

    public static int minSum(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Das Array enthält weniger als zwei Elemente.");
        }
        int sum = Arrays.stream(array).sum();
        int max = Arrays.stream(array).max().getAsInt();
        return sum - max;
    }
}