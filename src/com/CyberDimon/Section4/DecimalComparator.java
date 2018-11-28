package com.CyberDimon.Section4;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int iNum1 = (int)(num1 * 1000);
        int iNum2 = (int)(num2 * 1000);
        if (iNum1 == iNum2) return true;
        return false;
    }
}
