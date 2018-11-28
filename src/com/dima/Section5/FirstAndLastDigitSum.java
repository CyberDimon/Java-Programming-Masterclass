package com.dima.Section5;

public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;

        int cutNumber = number;
        int sum = 0;
        int numberOrder = 1;

        while (cutNumber >= 10) {
            cutNumber /= 10;
            numberOrder *= 10;
        }

        sum = (number % 10 + number / numberOrder);

        return sum;
    }

}
