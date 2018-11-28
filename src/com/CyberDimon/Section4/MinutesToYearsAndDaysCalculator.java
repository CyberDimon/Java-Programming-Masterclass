package com.CyberDimon.Section4;

public class MinutesToYearsAndDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) System.out.println("Invalid Value");
        else {
            long day = (long) ((minutes / 60L) / 24L);
            long year = (long) (day / 365);
            day %= 365;
            System.out.println(minutes + " min = " + year + " y and " + day + " d");
        }
    }
}
