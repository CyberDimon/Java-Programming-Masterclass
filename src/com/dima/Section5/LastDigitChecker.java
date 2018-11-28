package com.dima.Section5;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int first, int second, int third) {
        if (first < 10 || first >= 1000 || second < 10 || second >= 1000 ||
                third < 10 || third >= 1000) return false;

        System.out.println(first % 10 + " vs " + second % 10 + " vs " + third % 10);

        if (
                (first % 10) == (second % 10) ||
                (first % 10) == (third % 10) ||
                (second % 10) == (third % 10)
        ) return true;

        return false;
    }
}