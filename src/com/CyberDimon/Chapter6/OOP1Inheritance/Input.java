package com.CyberDimon.Chapter6.OOP1Inheritance;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, sum = 0;
        boolean hasNextInt;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Введите " + i + "-е число: ");
            hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                x = scanner.nextInt();
                sum += x;
            } else {
                System.out.println("Это не число!");
                i--;
            }
            scanner.nextLine(); // handle /n
        }

        System.out.println("Сумма всех чисел: " + sum);
        scanner.close();

    }
}
