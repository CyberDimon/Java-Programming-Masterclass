package com.CyberDimon.Section5;

public class FlourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else if (bigCount * 5 + smallCount < goal) {
            return false;
        } else if (((bigCount * 5) % goal != 0) && ((goal % 5) > smallCount)) {
            return false;
        }

        return true;

    }
}
