package com.dima.Section5;

public class NumberOfPalindrome {

    public static boolean isPalindrome(int number) {

        int dirtyNumber = number;
        int newNumber = 0;
        int num = number;

        int digits = 0;

        while (num != 0) {
            num /= 10;
            digits++;
        }

        int d = 1;
        for (int i = 1; i < digits; i++) {
            d *= 10;
        }

        while (true) {
            if (dirtyNumber == 0) break;
            newNumber += dirtyNumber % 10 * d;
            dirtyNumber /= 10;
            d /= 10;
            //System.out.println(newNumber);
        }

        if (newNumber == number) return true;
        return false;
    }


}
