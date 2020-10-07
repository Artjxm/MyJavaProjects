package ru.mirea.ikbo20.pr5;

import java.util.Scanner;

// Задание 16
public class Rec5 {
    private static int maxCounter, max = 0;

    public static int recursion() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num != 0) {
            if (num > max) {
                max = num;
                maxCounter = 0;
            }
            if (num == max)
                ++maxCounter;
            recursion();
        }
        return 0;
    }

    public static void printCounter() {
        System.out.println(maxCounter);
    }

    public static void main(String[] args) {
        recursion();
        printCounter();
    }
}
