package com.example;

import static org.junit.Assert.*;

import com.example.ElektronikShop;
import org.junit.Test;

public class ElektronikShopTest {
    @Test
    public void testFindCheapestKeyboard() {
        int[] keyboards = {40, 35, 70, 15, 45};
        int expectedCheapestKeyboard = 15;
        int actualCheapestKeyboard = ElektronikShop.findCheapestKeyboard(keyboards);
        assertEquals(expectedCheapestKeyboard, actualCheapestKeyboard);

        int[] emptyArray = {};
        int actualCheapestKeyboardEmpty = ElektronikShop.findCheapestKeyboard(emptyArray);
        assertEquals(Integer.MAX_VALUE, actualCheapestKeyboardEmpty);
    }

    @Test
    public void testFindMostExpensiveItem() {
        int[] keyboards = {15, 20, 10, 35};
        int[] usbDrives = {20, 15, 40, 15};
        int expectedMostExpensiveItem = 40;
        int actualMostExpensiveItem = ElektronikShop.findMostExpensiveItem(keyboards, usbDrives);
        assertEquals(expectedMostExpensiveItem, actualMostExpensiveItem);

        int[] emptyArrays = {};
        int actualMostExpensiveItemEmpty = ElektronikShop.findMostExpensiveItem(emptyArrays, emptyArrays);
        assertEquals(Integer.MIN_VALUE, actualMostExpensiveItemEmpty);
    }

    @Test
    public void testFindMaxUsbDrive() {
        int[] usbDrives = {15, 45, 20};
        int budget = 30;
        int expectedMaxUsbDrive = 20;
        int actualMaxUsbDrive = ElektronikShop.findMaxUsbDrive(usbDrives, budget);
        assertEquals(expectedMaxUsbDrive, actualMaxUsbDrive);

        int[] emptyArray = {};
        int budgetZero = 0;
        int actualMaxUsbDriveEmpty = ElektronikShop.findMaxUsbDrive(emptyArray, budget);
        int actualMaxUsbDriveBudgetZero = ElektronikShop.findMaxUsbDrive(usbDrives, budgetZero);

        assertEquals(-1, actualMaxUsbDriveEmpty);
        assertEquals(-1, actualMaxUsbDriveBudgetZero);
    }

    @Test
    public void testCalculateTotalCost() {
        int[] keyboards = {40, 50, 60};
        int[] usbDrives = {8, 12};
        int budget = 60;
        int expectedTotalCost = 50 + 8;
        int actualTotalCost = ElektronikShop.calculateTotalCost(keyboards, usbDrives, budget);
        assertEquals(expectedTotalCost, actualTotalCost);

        int[] expensiveKeyboards = {70, 80};
        int budgetNotEnough = 50;
        int actualTotalCostNotEnough = ElektronikShop.calculateTotalCost(expensiveKeyboards, usbDrives, budgetNotEnough);
        assertEquals(-1, actualTotalCostNotEnough);
    }
}
