package com.example;

public class ElektronikShop {
    public static int findCheapestKeyboard(int[] keyboards) {
        int minPrice = Integer.MAX_VALUE;
        for (int price : keyboards) {
            if (price < minPrice) {
                minPrice = price;
            }
        }
        return minPrice;
    }

    public static int findMostExpensiveItem(int[] keyboards, int[] usbDrives) {
        int maxPrice = Integer.MIN_VALUE;
        for (int price : keyboards) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        for (int price : usbDrives) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    public static int findMaxUsbDrive(int[] usbDrives, int budget) {
        int maxUsbDrive = -1;
        for (int price : usbDrives) {
            if (price <= budget && price > maxUsbDrive) {
                maxUsbDrive = price;
            }
        }
        return maxUsbDrive;
    }

    public static int calculateTotalCost(int[] keyboards, int[] usbDrives, int budget) {
        int cheapestKeyboard = findCheapestKeyboard(keyboards);
        int maxUsbDrive = findMaxUsbDrive(usbDrives, budget);
        
        if (cheapestKeyboard == Integer.MAX_VALUE || maxUsbDrive == -1) {
            return -1; // Markus kann nicht beide Gegenstände kaufen.
        }

        return cheapestKeyboard + maxUsbDrive;
    }

    public static void main(String[] args) {
        int[] keyboards = {40, 35, 70, 15, 45};
        int[] usbDrives = {20, 15, 40, 15};
        int budget = 60;

        int cheapestKeyboard = findCheapestKeyboard(keyboards);
        int mostExpensiveItem = findMostExpensiveItem(keyboards, usbDrives);
        int maxUsbDrive = findMaxUsbDrive(usbDrives, budget);
        int totalCost = calculateTotalCost(keyboards, usbDrives, budget);

        System.out.println("Billigste Tastatur: " + cheapestKeyboard);
        System.out.println("Teuerstes Element: " + mostExpensiveItem);
        System.out.println("Teuerstes USB-Laufwerk mit Budget: " + maxUsbDrive);
        System.out.println("Gesamtkosten: " + totalCost);
    }
}
