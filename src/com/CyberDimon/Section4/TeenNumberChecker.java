package com.CyberDimon.Section4;

public class TeenNumberChecker {
    public static boolean hasTeen(int first, int second, int third) {
        if ( (first >= 13 && first <= 19) || (second >= 13 && second <= 19) || (third >= 13 && third <= 19)) return true;
        return false;
    }
}
