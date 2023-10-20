package com.example;

import java.util.Arrays;

public class BigNumberOperations {

    public static int[] add(int[] num1, int[] num2) {
        int n = num1.length;
        int carry = 0;
        int[] result = new int[n];
        
        for (int i = n - 1; i >= 0; i--) {
            int sum = num1[i] + num2[i] + carry;
            result[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0) {
            int[] newResult = new int[n + 1];
            newResult[0] = carry;
            System.arraycopy(result, 0, newResult, 1, n);
            result = newResult;
        }

        return result;
    }

    public static int[] subtract(int[] num1, int[] num2) {
        int n = num1.length;
        int[] result = new int[n];
        int borrow = 0;

        for (int i = n - 1; i >= 0; i--) {
            int diff = num1[i] - num2[i] - borrow;

            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            result[i] = diff;
        }

        return result;
    }

    public static int[] multiply(int[] num1, int digit) {
        int n = num1.length;
        int carry = 0;
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int product = num1[i] * digit + carry;
            result[i] = product % 10;
            carry = product / 10;
        }

        if (carry > 0) {
            int[] newResult = new int[n + 1];
            newResult[0] = carry;
            System.arraycopy(result, 0, newResult, 1, n);
            result = newResult;
        }

        return result;
    }

    public static int[] divide(int[] num1, int divisor) {
        int n = num1.length;
        int[] result = new int[n];
        int remainder = 0;

        for (int i = 0; i < n; i++) {
            int current = num1[i] + remainder * 10;
            result[i] = current / divisor;
            remainder = current % divisor;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] num1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] sum = add(num1, num2);
        int[] difference = subtract(num1, num2);
        int[] product = multiply(num1, 2);
        int[] division = divide(num1, 2);

        System.out.println("Summe: " + Arrays.toString(sum));
        System.out.println("Differenz: " + Arrays.toString(difference));
        System.out.println("Multiplikation: " + Arrays.toString(product));
        System.out.println("Division: " + Arrays.toString(division));
    }
}
