package com.CyberDimon.Chapter3;

import java.util.Scanner;

public class MinimumAndMaximumChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = 5, x;//, min = 0, max = 0;
//        int min = 2_147_483_647;
//        int max = -2_147_483_648;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i ++) {
            if(scanner.hasNextInt()) {

                System.out.println("Введите число [" + i + "]: ");
                x = scanner.nextInt();

                // init min and max
//                if (i == 1) {
//                    min = x;
//                    max = x;
//
//                } else {
                if (x < min) min = x;
                if (x > max) max = x;
//                }

            } else {
                System.out.println("Это не число!");
                i--;
            }

            scanner.nextLine();
        }

        System.out.println("Min: " + min + "\nMax: " + max);
        scanner.close();

    }
}
