package ru.mirea.ikbo20.pr5;

import java.util.Scanner;

// Задание 14
public class Rec3 {
    public static int recursion(int num) {
        if (num < 10)
            System.out.print(num);
        else {
            System.out.print(num % 10 + " ");
            return recursion(num / 10);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        recursion(num);
    }
}
