package com.CyberDimon.Chapter4.VariablesDatatypes;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(1000000));
    }

    public static int sumDigits(int digit) {
        if (digit < 10) return -1;

        int sum = 0;
        digit = Math.abs(digit);

        while (true) {
            if (digit == 0) break;
            sum += digit % 10;
            digit /= 10;
        }

        //System.out.println(sumDigits());

        return sum;
    }
}
