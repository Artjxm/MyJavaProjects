package ru.mirea.ikbo20.pr5;

import java.util.Scanner;

public class Rec1 {
    public static int recursion() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num != 0) {
            if (num % 2 != 0) {
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


