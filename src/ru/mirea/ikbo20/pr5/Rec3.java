package ru.mirea.ikbo20.pr5;

import java.util.Scanner;

// Задание 14 (слева направо)
public class Rec3 {
    public static String recursion(int num) {
        if (num < 10)
            return Integer.toString(num);
        else {
            return recursion(num / 10) + ' ' + num % 10;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(recursion(num));
    }
}