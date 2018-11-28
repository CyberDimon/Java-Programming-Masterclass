package com.CyberDimon.Section5;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;

        int cutLeft = first;
        int cutRight = second;

        // how many digits in left number
        int leftCount = 1;
        while (cutLeft > 9) {
            cutLeft /= 10;
            leftCount *= 10;
        }

        // how many numbers in right digit
        int rightCount = 1;
        while (cutRight > 9) {
            cutRight /= 10;
            rightCount *= 10;
        }

        // reinit temp vars
        cutLeft = first;
        cutRight = second;
        int rememberRightCount = rightCount;

        int divisor = first >= second ? second : first;

        for (int i = divisor; i > 0; i--) {
            //System.out.println(first+"/"+i+" vs "+second+"/"+i);
            if (first%i == 0 && second%i == 0) return i;
        }

        return -1;
    }
}
