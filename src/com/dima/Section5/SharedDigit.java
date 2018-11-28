package com.dima.Section5;

public class SharedDigit {
    public static boolean hasSharedDigit(int left, int right) {
        if (left <= 10 || right >= 99 || left >= 99 || right <= 10) return false;

        int cutLeft = left;
        int cutRight = right;

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
        cutLeft = left;
        cutRight = right;
        int rememberRightCount = rightCount;

        while (cutLeft != 0) {
            cutRight = right;
            rightCount = rememberRightCount;

            while(cutRight != 0) {
                //System.out.println( (cutLeft) % 10 + " or " + (cutRight) % 10);
                if ( (cutLeft) % 10 == (cutRight) % 10) return true;

                cutRight /= 10;
                rightCount /= 10;
            }

            cutLeft /= 10;
            leftCount /= 10;
        }


        return false;
    }
}
