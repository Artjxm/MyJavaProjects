package ru.mirea.ikbo20.pr5;

import java.util.Scanner;

// Задание 13
public class Rec2 {
    private static int index = 0;

    public static int recursion() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        ++index;
        if (num != 0) {
            if (index % 2 != 0) {
                System.out.println(num);
            }
            recursion();
        }
        return 0;
    }

    public static void main(String[] args) {
        recursion();
    }
}


